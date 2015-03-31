/*
 * @(#)GenericStaticFactory.java
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.effectivejava.examples.chapter05.item27;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericStaticFactory {
	// Generic static factory method
	public static <K, V> HashMap<K, V> newHashMap() {
		return new HashMap<K, V>();
	}

	public static void main(String[] args) {
		// Parameterized type instance creation with static factory
		Map<String, List<String>> anagrams = newHashMap();
		anagrams.put("pak", Arrays.asList("geunhui", "geunyoung"));

		System.out.println(anagrams);
	}
}
