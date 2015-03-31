package kr.pe.ghp.study.spring.bo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 
 * @author geunhui park
 *
 */
public class MyBO {
	//@PostConstruct
	public void beforeHello() {
		System.out.println("사람을 만나다.");
	}

	public void hello() {
		System.out.println("안녕하세요.");
	}

	//@PreDestroy
	public void afterHello() {
		System.out.println("인사를 끝낸 후 대화를 나눈다.");
	}
}
