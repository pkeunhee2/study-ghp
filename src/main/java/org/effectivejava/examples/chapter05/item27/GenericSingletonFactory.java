/*
 * @(#)GenericSingletonFactory.java
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.effectivejava.examples.chapter05.item27;

public class GenericSingletonFactory {
	// Generic singleton factory pattern
	private static UnaryFunction<Object> IDENTITY_FUNCTION = new UnaryFunction<Object>() {
		public Object apply(Object arg) {
			return arg;
		}
	};

	// IDENTITY_FUNCTION is stateless and its type parameter is
	// unbounded so it's safe to share one instance across all types.
	@SuppressWarnings("unchecked")
	public static <T> UnaryFunction<T> identityFunction() {
		return (UnaryFunction<T>)IDENTITY_FUNCTION;
	}

	// Sample program to exercise generic singleton
	public static void main(String[] args) {
		String[] strings = {"jute", "hemp", "nylon"};
		UnaryFunction<String> sameString = identityFunction(); //객체 생성함
		for (String s : strings)
			System.out.println(sameString.apply(s));

		Number[] numbers = {1, 2.0, 3L};
		UnaryFunction<Number> sameNumber = identityFunction(); //객체 생성
		for (Number n : numbers)
			System.out.println(sameNumber.apply(n));
	}
}