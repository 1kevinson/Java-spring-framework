/**
 * @author Arsene Kevin
 * @Test  with Spring Framework
 */

package com.in28minutes.spring.basics.springin10steps.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.basics.springin10steps.SpringIn10StepsBasicApplication;

//Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringIn10StepsBasicApplication.class)
public class BinarySearchXmlConfigurationTest {

	// Get this bean from the context
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenario() {

		// call method for binary search
		int actualResult = binarySearch.binarySearch(new int[] {}, 5);

		// check if the value is correct
		assertEquals(3, actualResult);
	}

}
