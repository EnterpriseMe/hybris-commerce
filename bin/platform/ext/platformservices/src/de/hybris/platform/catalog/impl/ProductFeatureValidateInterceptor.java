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
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;


/**
 * ProductFeature Validator
 */
public class ProductFeatureValidateInterceptor implements ValidateInterceptor<ProductFeatureModel>
{
	@Override
	public void onValidate(final ProductFeatureModel productFeatureModel, final InterceptorContext ctx) throws InterceptorException
	{
		if (productFeatureModel.getValue() == null)
		{
			throw new InterceptorException("missing attribute 'Value' ");
		}
	}
}
