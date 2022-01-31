package com.extend.test;

import org.testng.IAlterSuiteListener;
import org.testng.ITestListener;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

public class ArkTestListener implements ITestListener, IAlterSuiteListener {

    @Override
    public void alter(List<XmlSuite> suiteList) {
        List<String> groups=new ArrayList<>();

        groups.add("login");
        groups.add("signup");
        for (XmlSuite suite : suiteList){
            suite.setIncludedGroups(groups);
            System.out.println("Setting groups ************");
            System.out.println("Groups : "+suite.getGroups());
            System.out.println("Groups included  : "+suite.getIncludedGroups());
            System.out.println("Groups excluded : "+suite.getExcludedGroups());
        }
    }

}
