package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
    //IoC DI
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(SpringConfig.class);
    }
}
