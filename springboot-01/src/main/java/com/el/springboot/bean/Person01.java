package com.el.springboot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *
 * @author Roman.Zhang
 * @description TODO
 * </p >
 * @date 2021/3/6
 */
@Component
@ConfigurationProperties(prefix = "person")
@Validated
@ToString
@Data
public class Person01 {
    //lastName必须是邮箱格式 @Email //@Value("${person.last‐name}")
    private String lastName;
    //@Value("#{11*2}")
    private Integer age;
    //@Value("true")
    private Boolean boss;
    private Date birth;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;
}
