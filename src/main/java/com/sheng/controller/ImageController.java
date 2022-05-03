package com.sheng.controller;

import com.sheng.vo.ResponseVo;
import org.apache.commons.codec.binary.Base64;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Encoder;

import java.io.*;

@RestController
@RequestMapping("/file")
public class ImageController {

    @GetMapping("/image")
    public ResponseVo<String> image() throws IOException {
        String path = "E:/photo1.jpg";
        ClassPathResource classPathResource = new ClassPathResource("/image/photo1.jpg");
        System.out.println(classPathResource);
        // 测试修改
        return ResponseVo.success(ImageToBase64());
    }

    public String getImage(String path) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(path);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        byte[] b = new byte[1024];
        int len = -1;

        while ((len = fileInputStream.read(b)) != -1) {
            bos.write(b, 0, len);
        }
        byte[] fileByte = bos.toByteArray();
        // 进行base64编码
        String data1 = Base64.encodeBase64String(fileByte);
        BASE64Encoder encoder = new BASE64Encoder();
        String data = encoder.encode(fileByte);
        System.out.println(data);
        return data;
    }

    public String ImageToBase64() throws IOException {
        InputStream in = null;
        byte[] data = null;
        Resource resource = new ClassPathResource("/image/photo1.jpg");
        File file = resource.getFile();
        in = new FileInputStream(file.getPath());

        data = new byte[in.available()];
        in.read(data);
        in.close();
        BASE64Encoder encoder = new BASE64Encoder();
        String data1 = encoder.encode(data);
        return data1;
    }
}
