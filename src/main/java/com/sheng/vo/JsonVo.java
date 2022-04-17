package com.sheng.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonVo {
    //存储数据，以及http状态
    private Object data;
    private Meta meta;
}
