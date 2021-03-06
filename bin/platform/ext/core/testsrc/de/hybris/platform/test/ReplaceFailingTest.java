/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package de.hybris.platform.test;

import de.hybris.bootstrap.annotations.IntegrationTest;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * This test together with {@link ReplaceSuccessfulTest} shows how to replace one test with another.
 */
@IntegrationTest
public class ReplaceFailingTest
{
    @Test
    public void failingTest()
    {
        assertTrue("this should fail", false);
    }
}
