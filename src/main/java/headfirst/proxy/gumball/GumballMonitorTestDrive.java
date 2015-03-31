/*
 * @(#)GumballMonitorTestDrive.java
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package headfirst.proxy.gumball;

import java.rmi.Naming;

public class GumballMonitorTestDrive {

	public static void main(String[] args) {
		String[] location = {"rmi://santafe.mightygumball.com/gumballmachine", "rmi://boulder.mightygumball.com/gumballmachine", "rmi://seattle.mightygumball.com/gumballmachine"};

		GumballMonitor[] monitor = new GumballMonitor[location.length];

		for (int i = 0; i < location.length; i++) {
			try {
				GumballMachineRemote machine = (GumballMachineRemote)Naming.lookup(location[i]);
				monitor[i] = new GumballMonitor(machine);
				System.out.println(monitor[i]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		for (int i = 0; i < monitor.length; i++) {
			monitor[i].report();
		}
	}
}
