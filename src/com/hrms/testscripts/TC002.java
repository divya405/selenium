package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {

    //Test Steps
	@Test
	public void tc002() {
		DOMConfigurator.configure("log4j.xml");
 General  obj = new General();
 obj.openAppilcation();
 obj.login();
 obj.enterFrame();
 obj.addNewEmp();
 obj.exitFrame();
 obj.closeApplication();
}
}
