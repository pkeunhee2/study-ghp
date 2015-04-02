package kr.pe.ghp.study.spring.bo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 
 * @author geunhui park
 *
 */
public class MyBO {
	public MyBO() {
		System.out.println("생성자 호출");
	}

	@PostConstruct
	public void beforeHello() {
		System.out.println("사람을 만나다.");
	}

	public void hello() {
		System.out.println("안녕하세요.");
	}

	@PreDestroy
	public void afterHello() {
		System.out.println("인사를 끝낸 후 대화를 나눈다.");
	}
}
