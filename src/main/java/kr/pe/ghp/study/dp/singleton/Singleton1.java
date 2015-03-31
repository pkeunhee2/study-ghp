package kr.pe.ghp.study.dp.singleton;

/**
 * public static final 로 필드에서 객체를 생성 시키고 생성자를 private 로 만든다
 * @author geunhui park
 *
 */
public class Singleton1 {
	public static final Singleton1 INSTANCE = new Singleton1();

	private Singleton1() {
	}

	public void hello() {
		System.out.println("hello! I'am singleton1");
	}
}
