/*
 * @(#)AutoBoxingProblemTest.java
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package kr.pe.ghp.study;

import org.junit.Test;

/**
 * @author 박근희
 */
public class AutoBoxingProblemTest {

	@Test
	public void test() {
		//Long sum = 0L; //autoboxing이 이루어져 시간 오래걸림
		long sum = 0L; //올바른 방법

		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}

		System.out.println(sum);
	}
}
