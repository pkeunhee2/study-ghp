/*
 * @(#)GumballMachine.java
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package headfirst.state.gumballstate;

public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;

	State state = soldOutState; //현재의 상태를 나타내는
	int count = 0;

	public GumballMachine(int numberGumballs) {
		//생성자에서 state 객체들을 생성해서 가지고 있음.
		//state 생성시 본 객체의 레퍼런스를 주고 state 객체가 참조하고 있도록 함

		soldOutState = new SoldOutState(this); //매진 상태
		noQuarterState = new NoQuarterState(this); //동전 없는 상태
		hasQuarterState = new HasQuarterState(this); //동전 있는 상태
		soldState = new SoldState(this); //판매 상태

		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	/**
	 * 현재 상태에 해당하는 state 객체를 세팅
	 * @param state
	 */
	void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}

	int getCount() {
		return count;
	}

	void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
