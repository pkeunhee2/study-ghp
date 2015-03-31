/*
 * @(#)Favorites.java
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.effectivejava.examples.chapter05.item29;

import java.util.HashMap;
import java.util.Map;

/**
 * Class type을 key로 가지는 Map 만들기
 * @author 박근희
 */
public class Favorites {
	// Typesafe heterogeneous container pattern - implementation
	private Map<Class<?>, Object> favorites = new HashMap<Class<?>, Object>();

	public <T> void putFavorite(Class<T> type, T instance) {
		if (type == null)
			throw new NullPointerException("Type is null");
		favorites.put(type, instance);
	}

	public <T> T getFavorite(Class<T> type) {
		//파라미터로 전달된 클래스 타입으로 캐스팅하여 return 함
		return type.cast(favorites.get(type));
	}

	// Typesafe heterogeneous container pattern - client
	public static void main(String[] args) {
		Favorites f = new Favorites();
		f.putFavorite(String.class, "Java");
		f.putFavorite(String.class, "C++"); //Map이므로 Type은 하나만 존재할 수 있음
		f.putFavorite(Integer.class, 0xcafebabe);
		f.putFavorite(Class.class, Favorites.class);

		String favoriteString = f.getFavorite(String.class);
		System.out.println(favoriteString);

		int favoriteInteger = f.getFavorite(Integer.class);
		Class<?> favoriteClass = f.getFavorite(Class.class);
		System.out.printf("%s %x %s%n", favoriteString, favoriteInteger, favoriteClass.getName());
	}
}