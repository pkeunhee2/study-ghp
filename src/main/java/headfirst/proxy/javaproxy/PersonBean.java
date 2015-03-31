/*
 * @(#)PersonBean.java
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package headfirst.proxy.javaproxy;

public interface PersonBean {

	String getName();

	String getGender();

	String getInterests();

	int getHotOrNotRating();

	void setName(String name);

	void setGender(String gender);

	void setInterests(String interests);

	void setHotOrNotRating(int rating);

}
