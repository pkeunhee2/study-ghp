/*
 * @(#)Mocha.java
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package headfirst.decorator.starbuzz;

public class Mocha extends CondimentDecorator {
	Beverage beverage;

	/**
	 * 생성자로 형식이 같은 beverage 객체를 받음. composition
	 * @param beverage
	 */
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	public double cost() {
		return .20 + beverage.cost();
	}
}
