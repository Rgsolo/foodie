package org.foodie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author steve.mei
 * @Version Application,  2020/10/18 9:47 下午
 **/

@SpringBootApplication
@MapperScan(basePackages = "org.foodie.mapper")
//扫描所有包以及相关组件包
@ComponentScan(basePackages = {"org.foodie", "org.n3r.idworker"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
