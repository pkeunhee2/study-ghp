package kr.pe.ghp.study.dp.singleton;

/**
 * 싱글톤 생성법 1
 * static final 로 필드에서 객체를 생성 시키고 생성자를 private 로 만든다
 * @author geunhui park
 *
 */
public class Singleton1 {
	public static final Singleton1 INSTANCE = new Singleton1();

	private Singleton1() {
	}

	public void hello() {
		System.out.println("hello");
	}
}
