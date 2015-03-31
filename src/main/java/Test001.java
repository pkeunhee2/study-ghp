import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	protected Person clone() throws CloneNotSupportedException {
		return new Person(name);
	}
}

public class Test001 {
	public static void main(String[] ar) throws Exception {
		Person a = new Person("geunhui park");
		Person b = a.clone();

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}
}
