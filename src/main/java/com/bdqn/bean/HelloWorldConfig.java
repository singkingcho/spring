package com.bdqn.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

	
	@Bean
	public HelloWorld getHelloWorld() {
		return new HelloWorld();
	}
}

/*
 * 上面的注解配合就等同于下面
 * <beans>
   <bean id = "helloWorld" class = "com.bdqn.bean.HelloWorld" />
</beans>
 */
