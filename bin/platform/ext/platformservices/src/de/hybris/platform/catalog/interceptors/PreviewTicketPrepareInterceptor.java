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

package de.hybris.platform.catalog.interceptors;


import de.hybris.platform.catalog.model.PreviewTicketModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.user.UserService;


public class PreviewTicketPrepareInterceptor implements PrepareInterceptor<PreviewTicketModel>
{
	private UserService userService;


	@Override
	public void onPrepare(final PreviewTicketModel previewTicket, final InterceptorContext ctx) throws InterceptorException
	{
		if (ctx.getModelService().isNew(previewTicket) && previewTicket.getCreatedBy() == null)
		{
			previewTicket.setCreatedBy(userService.getCurrentUser());
		}
	}

	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}
}
