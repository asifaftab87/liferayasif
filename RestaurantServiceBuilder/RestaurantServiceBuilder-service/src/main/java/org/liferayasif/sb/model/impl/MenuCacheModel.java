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

package org.liferayasif.sb.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import org.liferayasif.sb.model.Menu;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Menu in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Menu
 * @generated
 */
@ProviderType
public class MenuCacheModel implements CacheModel<Menu>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MenuCacheModel)) {
			return false;
		}

		MenuCacheModel menuCacheModel = (MenuCacheModel)obj;

		if (menuId == menuCacheModel.menuId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, menuId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{menuId=");
		sb.append(menuId);
		sb.append(", type=");
		sb.append(type);
		sb.append(", foodName=");
		sb.append(foodName);
		sb.append(", price=");
		sb.append(price);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Menu toEntityModel() {
		MenuImpl menuImpl = new MenuImpl();

		menuImpl.setMenuId(menuId);

		if (type == null) {
			menuImpl.setType(StringPool.BLANK);
		}
		else {
			menuImpl.setType(type);
		}

		if (foodName == null) {
			menuImpl.setFoodName(StringPool.BLANK);
		}
		else {
			menuImpl.setFoodName(foodName);
		}

		menuImpl.setPrice(price);

		menuImpl.resetOriginalValues();

		return menuImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		menuId = objectInput.readLong();
		type = objectInput.readUTF();
		foodName = objectInput.readUTF();

		price = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(menuId);

		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}

		if (foodName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(foodName);
		}

		objectOutput.writeLong(price);
	}

	public long menuId;
	public String type;
	public String foodName;
	public long price;
}