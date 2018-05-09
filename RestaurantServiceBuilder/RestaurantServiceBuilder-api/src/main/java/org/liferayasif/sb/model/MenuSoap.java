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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class MenuSoap implements Serializable {
	public static MenuSoap toSoapModel(Menu model) {
		MenuSoap soapModel = new MenuSoap();

		soapModel.setMenuId(model.getMenuId());
		soapModel.setType(model.getType());
		soapModel.setFoodName(model.getFoodName());
		soapModel.setPrice(model.getPrice());

		return soapModel;
	}

	public static MenuSoap[] toSoapModels(Menu[] models) {
		MenuSoap[] soapModels = new MenuSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MenuSoap[][] toSoapModels(Menu[][] models) {
		MenuSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MenuSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MenuSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MenuSoap[] toSoapModels(List<Menu> models) {
		List<MenuSoap> soapModels = new ArrayList<MenuSoap>(models.size());

		for (Menu model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MenuSoap[soapModels.size()]);
	}

	public MenuSoap() {
	}

	public long getPrimaryKey() {
		return _menuId;
	}

	public void setPrimaryKey(long pk) {
		setMenuId(pk);
	}

	public long getMenuId() {
		return _menuId;
	}

	public void setMenuId(long menuId) {
		_menuId = menuId;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public String getFoodName() {
		return _foodName;
	}

	public void setFoodName(String foodName) {
		_foodName = foodName;
	}

	public long getPrice() {
		return _price;
	}

	public void setPrice(long price) {
		_price = price;
	}

	private long _menuId;
	private String _type;
	private String _foodName;
	private long _price;
}