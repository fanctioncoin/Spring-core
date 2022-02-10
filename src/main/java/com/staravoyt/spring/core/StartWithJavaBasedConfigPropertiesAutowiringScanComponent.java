package com.staravoyt.spring.core;

import com.staravoyt.spring.core.model.Minimarket;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartWithJavaBasedConfigPropertiesAutowiringScanComponent {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext("com.staravoyt.spring.core");

        ctx.registerShutdownHook();

        Minimarket minimarket =ctx.getBean("minimarket", Minimarket.class);
        minimarket.printInfo();

    }
}
