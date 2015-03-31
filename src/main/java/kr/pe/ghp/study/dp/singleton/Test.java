package kr.pe.ghp.study.dp.singleton;

/**
 * 
 * @author geunhui park
 *
 */
public class Test {
	public static void main(String[] ar) {
		Singleton1.INSTANCE.hello();
		Singleton2.getInstance().hello();
		Singleton3.INSTANCE.hello();
	}
}
