package com.example;

import com.example.config.JavaConfig;
import com.example.domain.Member;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Member m = context.getBean("BNK48", Member.class);
        m.sayHello();
        m.sayCatchphrase();

        System.out.println();

        Member n = context.getBean("kaiwan", Member.class);
        n.sayHello();
        n.sayCatchphrase();
    }
}
