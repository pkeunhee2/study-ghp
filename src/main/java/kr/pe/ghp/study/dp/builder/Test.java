package kr.pe.ghp.study.dp.builder;

/**
 * 
 * @author geunhui park
 *
 */
public class Test {
	public static void main(String[] ar) {
		//불변 객체 생성
		PersonInfo personInfo = new PersonInfo.Builder("geunhui park", 32).telephone("010-3231-9699").build();

		System.out.println(personInfo);
	}
}
