package info.jsjackson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Further Reading:
 * https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-aop
 * https://docs.spring.io/spring/docs/4.3.x/spring-framework-reference/html/beans.html
 * 
 * About Actuators:
 * https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-endpoints.html
 * 
 * @author josan
 *
 */
@SpringBootApplication
public class SpringStereotypeAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStereotypeAopApplication.class, args);
	}
}
