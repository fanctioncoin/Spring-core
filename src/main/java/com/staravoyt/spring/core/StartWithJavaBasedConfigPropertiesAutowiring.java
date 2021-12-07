package com.staravoyt.spring.core;

import com.staravoyt.spring.core.config.JavaBasedConfigPropertiesAutowiring;
import com.staravoyt.spring.core.model.Supermarket;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartWithJavaBasedConfigPropertiesAutowiring {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(JavaBasedConfigPropertiesAutowiring.class);

        ctx.registerShutdownHook();

        Supermarket supermarket =ctx.getBean("supermarket", Supermarket.class);
        supermarket.printInfo();
    }
}
