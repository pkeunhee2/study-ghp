/*
 * @(#)UnaryFunction.java
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.effectivejava.examples.chapter05.item27;

public interface UnaryFunction<T> { //인터페이스에서 generic 적용
	T apply(T arg); //항등 함수. 받은걸 그대로 다시 return 함
}
