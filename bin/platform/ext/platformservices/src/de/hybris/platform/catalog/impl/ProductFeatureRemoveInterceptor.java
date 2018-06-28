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
package de.hybris.platform.catalog.impl;

import de.hybris.platform.catalog.model.ProductFeatureModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PersistenceOperation;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import java.util.Date;


/**
 * Remove Interceptor for ProductFeature. Needed especially for touching the Product.
 */
public class ProductFeatureRemoveInterceptor implements RemoveInterceptor<ProductFeatureModel>
{

	@Override
	public void onRemove(final ProductFeatureModel productFeatureModel, final InterceptorContext ctx) throws InterceptorException
	{
		markProductAsModified(ctx, productFeatureModel.getProduct());
	}

	private void markProductAsModified(final InterceptorContext ctx, final ProductModel product)
	{
		product.setModifiedtime(new Date());

		if (!ctx.contains(product, PersistenceOperation.SAVE))
		{
			ctx.registerElementFor(product, PersistenceOperation.SAVE);
		}
	}
}
