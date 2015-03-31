/*
 * @(#)RecursiveTypeBound.java
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.effectivejava.examples.chapter05.item27;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 재귀적 타입 바운드
 * @author 박근희
 */
public class RecursiveTypeBound {
	/**
	 * Returns the maximum value in a list - uses recursive type bound
	 * 최대값 구하기
	 * @param list
	 * @return
	 */
	public static <T extends Comparable<T>> T max(List<T> list) {
		//public static <T> T max(List<T> list) {
		Iterator<T> i = list.iterator();
		T result = i.next();
		while (i.hasNext()) {
			T t = i.next();
			if (t.compareTo(result) > 0)
				result = t;
		}
		return result;
	}

	public static void main(String[] args) {
		List<String> argList = Arrays.asList(args);
		System.out.println(max(argList)); //최대값 구함
	}
}