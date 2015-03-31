/*
 * @(#)CompositeIterator.java
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package headfirst.composite.menuiterator;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
	Stack stack = new Stack();

	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}

	public Object next() {
		if (hasNext()) {
			Iterator iterator = (Iterator)stack.peek();
			MenuComponent component = (MenuComponent)iterator.next();
			if (component instanceof Menu) { //메뉴인 경우 하위 항목이 있기 때문에 stack에 iterator를 넣음
				stack.push(component.createIterator());
			}
			return component;
		} else {
			return null;
		}
	}

	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator iterator = (Iterator)stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext(); //재귀 호출
			} else {
				return true;
			}
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
