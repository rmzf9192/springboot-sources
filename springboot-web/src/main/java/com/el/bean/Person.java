package com.el.bean;

import lombok.Data;

import java.util.Date;
/**
 * <p>
 *
 * @author Roman.Zhang
 * @description TODO
 * </p >
 * @date 2021/3/7
 */
/**
 *     姓名： <input name="userName"/> <br/>
 *     年龄： <input name="age"/> <br/>
 *     生日： <input name="birth"/> <br/>
 *     宠物姓名：<input name="pet.name"/><br/>
 *     宠物年龄：<input name="pet.age"/>
 */
@Data
public class Person {

    private String userName;
    private Integer age;
    private Date birth;
    private Pet pet;

}
