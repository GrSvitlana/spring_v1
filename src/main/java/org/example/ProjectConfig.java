package org.example;

import org.example2.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot1() {
        Parrot parrot = new Parrot();
        parrot.setName("Co co");
        return parrot;
    }

    @Bean("Coco")
    public Parrot parrot2() {
        Parrot parrot = new Parrot();
        parrot.setName("Coco");
        return parrot;
    }

    @Bean
    @Primary
    public Parrot parrot3() {
        Parrot parrot = new Parrot();
        parrot.setName("Miki");
        return parrot;
    }

    @Bean
    public String hello() {
        return "Hello";
    }

    @Bean
    public int i_val() {
        return 0;
    }
}
