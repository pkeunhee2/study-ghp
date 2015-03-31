/*
 * @(#)CaffeineBeverage.java
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package headfirst.templatemethod.barista;

public abstract class CaffeineBeverage {
	final void prepareRecipe() { //템플릿 메소드 역할. 알고리즘의 템플릿을 정의한다.
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	abstract void brew();

	abstract void addCondiments();

	void boilWater() {
		System.out.println("Boiling water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
