package kr.pe.ghp.study.dp.singleton;

/**
 * private static final 로 INSTANCE 필드를 생성하고 
 * getInstacne 메소드를 통해서만 객체 받을수 있게 함
 * @author geunhui park
 *
 */
public class Singleton2 {
	private static final Singleton2 INSTANCE = new Singleton2();

	private Singleton2() {
	}

	public static Singleton2 getInstance() {
		return INSTANCE;
	}

	public void hello() {
		System.out.println("hello I'am Singleton2");
	}
}
