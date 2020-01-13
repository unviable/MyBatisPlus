package com.ali.main.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author jacob peng
 * @Date 2020/1/13
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
