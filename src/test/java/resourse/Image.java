package resourse;


import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import sun.misc.BASE64Encoder;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Image extends TestCase {
    public void testImageRead() throws IOException {
        InputStream in = null;
        byte[] data = null;
        Resource resource = new ClassPathResource("image/photo1.jpg");
        File file = resource.getFile();
        in = new FileInputStream(file.getPath());

        data = new byte[in.available()];
        in.read(data);
        in.close();
        BASE64Encoder encoder = new BASE64Encoder();
        String data1 = encoder.encode(data);
        System.out.println(data1);
    }
}
