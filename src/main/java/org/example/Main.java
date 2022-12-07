package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot = context.getBean("parrot2", Parrot.class);
        System.out.println(parrot.getName());

        String str = context.getBean(String.class);
        System.out.println(str);

        Integer i = context.getBean(Integer.class);
        System.out.println(i);
    }
}