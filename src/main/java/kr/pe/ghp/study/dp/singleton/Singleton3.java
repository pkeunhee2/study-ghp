package kr.pe.ghp.study.dp.singleton;

/**
 * INSTANCE 라는 필드 하나를 가지는 enum 으로 생성
 * @author geunhui park
 *
 */
public enum Singleton3 {
	INSTANCE;

	public void hello() {
		System.out.println("hello I'm singleton3. enum");
	}
}
