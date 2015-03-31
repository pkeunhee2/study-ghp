/*
 * @(#)Test001.java $version 2014. 4. 17.
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package kr.pe.ghp.study;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

/**
 * @author 박근희
 */
public class GuavaExamples {
	public String returnValue1() {
		//return "1";
		return null;
	}

	@Test
	public void firstNotNull() {
		String result = Objects.firstNonNull(returnValue1(), "2"); //null이 아니면 처음거 return
		System.out.println(result);
	}

	@Test
	public void joiner() {
		List<String> list = Lists.newArrayList("박근희", "진혜정", "박근영", null, "박지은");
		//String result = Joiner.on(", ").join(list);
		//String result = Joiner.on(", ").skipNulls().join(list);
		//String result = Joiner.on("")
		//System.out.println(result);
	}

	@Test
	public void immutableMap() {
		ImmutableMap.of("1", 1, "2", 2, "3", "%");
	}
}
