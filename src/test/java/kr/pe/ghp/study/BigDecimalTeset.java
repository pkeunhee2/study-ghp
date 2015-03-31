/*
 * @(#)BigDecimalTeset.java $version 2014. 4. 4.
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package kr.pe.ghp.study;

import java.math.BigDecimal;

import org.junit.Test;

/**
 * @author 박근희
 */
public class BigDecimalTeset {
	@Test
	public void test001() {
		BigDecimal a1 = new BigDecimal("1.2");
		BigDecimal a2 = new BigDecimal("0.5");

		double b1 = 2.0;
		double b2 = 1.1;

		System.out.println(a1.add(a2));
		System.out.println(b1 - b2);
	}
}
