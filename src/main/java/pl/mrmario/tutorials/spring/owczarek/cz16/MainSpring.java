package pl.mrmario.tutorials.spring.owczarek.cz16;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MrMario108
 *
 */
public class MainSpring {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		context.registerShutdownHook();
		SomeBean someBean= context.getBean("someBean", SomeBean.class);
		someBean.isWorking();
		System.out.println("cos innego");
		
		
			}
}