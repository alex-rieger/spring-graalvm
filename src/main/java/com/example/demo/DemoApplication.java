package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.graalvm.polyglot.*;

@SpringBootApplication(proxyBeanMethods = false)
public class DemoApplication {

	public static void main(String[] args) {
		Context context = Context.create();
		context.eval("js", "var test = Java.type('graaltest.GraalVMTest'); test.hello('World');");

		SpringApplication.run(DemoApplication.class, args);
	}

}
