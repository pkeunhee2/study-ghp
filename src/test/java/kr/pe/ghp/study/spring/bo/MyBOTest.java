package kr.pe.ghp.study.spring.bo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author geunhui park
 *
 */
public class MyBOTest {

	/**
	 * applicationContext xml 로 부터 ApplicationContext 생성하기
	 */
	@Test
	public void beanLifeCycle() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyBO myBO = ac.getBean(MyBO.class);
		myBO.hello();

		// close 될때 destroy-method 가 callback으로 호출된다.
		((ClassPathXmlApplicationContext) ac).close();
	}
}
