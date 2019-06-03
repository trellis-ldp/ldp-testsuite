package org.w3.ldp.paging.testsuite.tests;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Options;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.testng.xml.XmlClass;
import org.w3.ldp.testsuite.LdpTestSuite;

public class RunPagingTest {

	private static Options options = new Options();
	
	public static void main(String[] args){
		Logger.getRootLogger().setLevel(Level.OFF);
		
		LdpTestSuite.addCommonOptions().getOptions().forEach(options::addOption);
		LdpTestSuite.addEarlOptions().getOptions().forEach(options::addOption);

		// Add classes we want to test
		final List<XmlClass> classes = new ArrayList<>();
		classes.add(new XmlClass( "org.w3.ldp.paging.testsuite.tests.PagingTest"));
		
		LdpTestSuite.executeTestSuite(args, options, "paging", classes);
	}
	
}
