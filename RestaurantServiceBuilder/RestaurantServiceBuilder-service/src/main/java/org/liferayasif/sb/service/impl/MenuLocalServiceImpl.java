/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.liferayasif.sb.service.impl;

import java.util.List;

import org.liferayasif.sb.model.Menu;
import org.liferayasif.sb.service.base.MenuLocalServiceBaseImpl;

/**
 * The implementation of the menu local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.liferayasif.sb.service.MenuLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MenuLocalServiceBaseImpl
 * @see org.liferayasif.sb.service.MenuLocalServiceUtil
 */
public class MenuLocalServiceImpl extends MenuLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link org.liferayasif.sb.service.MenuLocalServiceUtil} to access the menu local service.
	 */
	public List<Menu> findByType(String type) {
		return this.menuPersistence.findByType(type);
	}
	
}