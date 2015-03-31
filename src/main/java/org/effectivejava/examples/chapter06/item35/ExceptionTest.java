// Annotation type with an array parameter -  Page 173
package org.effectivejava.examples.chapter06.item35;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated method is a test method that must throw the any
 * of the designated exceptions to succeed.
 * 익셉션이 발생해야하는 annotation 테스트
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionTest{
	//annotation의 파라미터 값 정의
	Class<? extends Exception>[] value();
}
