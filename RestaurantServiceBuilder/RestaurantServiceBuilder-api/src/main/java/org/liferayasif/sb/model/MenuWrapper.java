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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Menu}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Menu
 * @generated
 */
@ProviderType
public class MenuWrapper implements Menu, ModelWrapper<Menu> {
	public MenuWrapper(Menu menu) {
		_menu = menu;
	}

	@Override
	public Class<?> getModelClass() {
		return Menu.class;
	}

	@Override
	public String getModelClassName() {
		return Menu.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("menuId", getMenuId());
		attributes.put("type", getType());
		attributes.put("foodName", getFoodName());
		attributes.put("price", getPrice());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long menuId = (Long)attributes.get("menuId");

		if (menuId != null) {
			setMenuId(menuId);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String foodName = (String)attributes.get("foodName");

		if (foodName != null) {
			setFoodName(foodName);
		}

		Long price = (Long)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}
	}

	@Override
	public Menu toEscapedModel() {
		return new MenuWrapper(_menu.toEscapedModel());
	}

	@Override
	public Menu toUnescapedModel() {
		return new MenuWrapper(_menu.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _menu.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _menu.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _menu.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _menu.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Menu> toCacheModel() {
		return _menu.toCacheModel();
	}

	@Override
	public int compareTo(Menu menu) {
		return _menu.compareTo(menu);
	}

	@Override
	public int hashCode() {
		return _menu.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _menu.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new MenuWrapper((Menu)_menu.clone());
	}

	/**
	* Returns the food name of this menu.
	*
	* @return the food name of this menu
	*/
	@Override
	public java.lang.String getFoodName() {
		return _menu.getFoodName();
	}

	/**
	* Returns the type of this menu.
	*
	* @return the type of this menu
	*/
	@Override
	public java.lang.String getType() {
		return _menu.getType();
	}

	@Override
	public java.lang.String toString() {
		return _menu.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _menu.toXmlString();
	}

	/**
	* Returns the menu ID of this menu.
	*
	* @return the menu ID of this menu
	*/
	@Override
	public long getMenuId() {
		return _menu.getMenuId();
	}

	/**
	* Returns the price of this menu.
	*
	* @return the price of this menu
	*/
	@Override
	public long getPrice() {
		return _menu.getPrice();
	}

	/**
	* Returns the primary key of this menu.
	*
	* @return the primary key of this menu
	*/
	@Override
	public long getPrimaryKey() {
		return _menu.getPrimaryKey();
	}

	@Override
	public void persist() {
		_menu.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_menu.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_menu.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_menu.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_menu.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the food name of this menu.
	*
	* @param foodName the food name of this menu
	*/
	@Override
	public void setFoodName(java.lang.String foodName) {
		_menu.setFoodName(foodName);
	}

	/**
	* Sets the menu ID of this menu.
	*
	* @param menuId the menu ID of this menu
	*/
	@Override
	public void setMenuId(long menuId) {
		_menu.setMenuId(menuId);
	}

	@Override
	public void setNew(boolean n) {
		_menu.setNew(n);
	}

	/**
	* Sets the price of this menu.
	*
	* @param price the price of this menu
	*/
	@Override
	public void setPrice(long price) {
		_menu.setPrice(price);
	}

	/**
	* Sets the primary key of this menu.
	*
	* @param primaryKey the primary key of this menu
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_menu.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_menu.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the type of this menu.
	*
	* @param type the type of this menu
	*/
	@Override
	public void setType(java.lang.String type) {
		_menu.setType(type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MenuWrapper)) {
			return false;
		}

		MenuWrapper menuWrapper = (MenuWrapper)obj;

		if (Objects.equals(_menu, menuWrapper._menu)) {
			return true;
		}

		return false;
	}

	@Override
	public Menu getWrappedModel() {
		return _menu;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _menu.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _menu.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_menu.resetOriginalValues();
	}

	private final Menu _menu;
}