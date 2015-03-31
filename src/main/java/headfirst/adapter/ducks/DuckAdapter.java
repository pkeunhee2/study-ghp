/*
 * @(#)DuckAdapter.java
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package headfirst.adapter.ducks;

import java.util.Random;

public class DuckAdapter implements Turkey {
	Duck duck;
	Random rand;

	public DuckAdapter(Duck duck) {
		this.duck = duck;
		rand = new Random();
	}

	public void gobble() {
		duck.quack();
	}

	public void fly() {
		if (rand.nextInt(5) == 0) {
			duck.fly();
		}
	}
}
