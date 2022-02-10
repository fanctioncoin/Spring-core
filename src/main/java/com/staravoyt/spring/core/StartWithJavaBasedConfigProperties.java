package com.staravoyt.spring.core;

import com.staravoyt.spring.core.config.JavaBasedConfigProperties;
import com.staravoyt.spring.core.model.Shop;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartWithJavaBasedConfigProperties {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(JavaBasedConfigProperties.class);

        ctx.registerShutdownHook();

        Shop shopIrish = ctx.getBean("shopIrish", Shop.class);
        shopIrish.printInfo();

    }
}
