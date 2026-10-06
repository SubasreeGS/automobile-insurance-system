package com.main;

import com.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.JDBCType;

public class SpringApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("The DS is at memory location : "+context.getBean(DataSource.class));
        System.out.println("Our template class is at loc : "+context.getBean(JdbcTemplate.class));
    }
}
