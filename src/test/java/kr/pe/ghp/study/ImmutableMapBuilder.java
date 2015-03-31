/*
 * @(#)ImmutableMapBuilder.java
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package kr.pe.ghp.study;

import org.junit.Test;

import com.google.common.collect.ImmutableMap;

/**
 * @author 박근희
 */
public class ImmutableMapBuilder {

	@Test
	public void test001() {
		ImmutableMap<String, Integer> map = ImmutableMap.of("A", 1, "B", 2);

		System.out.println(map);

		//System.out.println(map);
	}
}
