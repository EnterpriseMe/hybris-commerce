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
package de.hybris.platform.core.initialization.testbeans;

import de.hybris.platform.core.initialization.SystemSetupAuditDAO;
import de.hybris.platform.core.initialization.SystemSetupCollectorResult;
import de.hybris.platform.core.model.initialization.SystemSetupAuditModel;


public class TestSystemSetupAuditDAO implements SystemSetupAuditDAO
{

	@Override
	public boolean isPatchApplied(final String patchHash)
	{
		return false;
	}

	@Override
	public SystemSetupAuditModel storeSystemPatchAction(final SystemSetupCollectorResult collectorResult)
	{
		return null;
	}
}
