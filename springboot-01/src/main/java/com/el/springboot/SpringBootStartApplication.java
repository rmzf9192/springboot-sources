package com.el.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * <p>
 *
 * @author Roman.Zhang
 * @description TODO
 *  @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 * </p >
 * @date 2021/3/5
 */
//@EnableConfigurationProperties

/**
 * Spring boot原理总结
 * 1）、SpringBoot启动会加载大量的自动配置类
 * 2）、我们看我们需要的功能有没有SpringBoot默认写好的自动配置类；
 * 3）、我们再来看这个自动配置类中到底配置了哪些组件；（只要我们要用的组件有，我们就不需要再来配置了）
 * 4）、给容器中自动配置类添加组件的时候，会从properties类中获取某些属性。我们就可以在配置文件中指定这 些属性的值；
 * xxxxAutoConfigurartion：自动配置类； 给容器中添加组件
 * xxxxProperties:封装配置文件中相关属性；
 *
 */
@SpringBootApplication
public class SpringBootStartApplication {
    public static void main(String[] args) {
        //Spring应用启动起来
        var run = SpringApplication.run(SpringBootStartApplication.class);

        //2、查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
