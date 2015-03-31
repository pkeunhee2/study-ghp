/*
 * @(#)Test002.java
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package kr.pe.ghp.study;

import org.junit.Test;

/**
 * @author 박근희
 */

class Context {
	public static ThreadLocal<String> threadLocal = new ThreadLocal<String>();
}

public class ThreadLocalTest {
	@Test
	public void a() {
		String data = String.valueOf(System.currentTimeMillis());
		System.out.println(data);

		Context.threadLocal.set(data);

		B b = new B();
		b.b();

		a1();

		//Context.threadLocal.remove();
	}

	@Test
	public void a1() {
		String data = Context.threadLocal.get();

		System.out.println("a1() : " + data);
	}
}

class B {
	public void b() {
		String data = Context.threadLocal.get();
		System.out.println(data);

		C c = new C();
		c.c();
	}
}

class C {
	public void c() {
		String data = Context.threadLocal.get();
		System.out.println(data);
	}
}
