package com.extend.test;

import org.testng.IAlterSuiteListener;
import org.testng.ITestListener;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArkTestListener implements ITestListener, IAlterSuiteListener {

    @Override
    public void alter(List<XmlSuite> suiteList) {
        //List<String> groupMasterList = Arrays.asList("editQuoteLine", "addQuoteLine");
        List<String> groupMasterList = Arrays.asList("login", "signup");
        String commitMsg = System.getProperty("commitMsg", "edit login etc addQuoteLine");
        String[] words = commitMsg.split(" ");
        List<String> groups = new ArrayList<>();
        for (String word : words) {
            if (groupMasterList.contains(word))
                groups.add(word);
        }
        for (XmlSuite suite : suiteList) {
            suite.setIncludedGroups(groups);
            System.out.println("Setting groups : " + groups);
        }
    }

}
