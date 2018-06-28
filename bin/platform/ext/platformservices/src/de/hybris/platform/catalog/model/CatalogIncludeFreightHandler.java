/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 */

package de.hybris.platform.catalog.model;


import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;


public class CatalogIncludeFreightHandler implements DynamicAttributeHandler<Boolean, CatalogModel>
{
	@Override
	public Boolean get(final CatalogModel model)
	{
		final CatalogVersionModel activeCatalogVersion = model.getActiveCatalogVersion();
		if (activeCatalogVersion != null)
		{
			return activeCatalogVersion.getInclPacking();
		}
		return null;
	}

	@Override
	public void set(final CatalogModel model, final Boolean aBoolean)
	{
	}
}
