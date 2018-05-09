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

package org.liferayasif.sb.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Menu service. Represents a row in the &quot;AA_Menu&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MenuModel
 * @see org.liferayasif.sb.model.impl.MenuImpl
 * @see org.liferayasif.sb.model.impl.MenuModelImpl
 * @generated
 */
@ImplementationClassName("org.liferayasif.sb.model.impl.MenuImpl")
@ProviderType
public interface Menu extends MenuModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link org.liferayasif.sb.model.impl.MenuImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Menu, Long> MENU_ID_ACCESSOR = new Accessor<Menu, Long>() {
			@Override
			public Long get(Menu menu) {
				return menu.getMenuId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Menu> getTypeClass() {
				return Menu.class;
			}
		};
}