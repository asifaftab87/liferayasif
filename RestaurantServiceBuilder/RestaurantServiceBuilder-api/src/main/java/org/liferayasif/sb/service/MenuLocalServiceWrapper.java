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

package org.liferayasif.sb.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MenuLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MenuLocalService
 * @generated
 */
@ProviderType
public class MenuLocalServiceWrapper implements MenuLocalService,
	ServiceWrapper<MenuLocalService> {
	public MenuLocalServiceWrapper(MenuLocalService menuLocalService) {
		_menuLocalService = menuLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _menuLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _menuLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _menuLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _menuLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _menuLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of menus.
	*
	* @return the number of menus
	*/
	@Override
	public int getMenusCount() {
		return _menuLocalService.getMenusCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _menuLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _menuLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.liferayasif.sb.model.impl.MenuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _menuLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.liferayasif.sb.model.impl.MenuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _menuLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<org.liferayasif.sb.model.Menu> findByType(
		java.lang.String type) {
		return _menuLocalService.findByType(type);
	}

	/**
	* Returns a range of all the menus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.liferayasif.sb.model.impl.MenuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of menus
	* @param end the upper bound of the range of menus (not inclusive)
	* @return the range of menus
	*/
	@Override
	public java.util.List<org.liferayasif.sb.model.Menu> getMenus(int start,
		int end) {
		return _menuLocalService.getMenus(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _menuLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _menuLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the menu to the database. Also notifies the appropriate model listeners.
	*
	* @param menu the menu
	* @return the menu that was added
	*/
	@Override
	public org.liferayasif.sb.model.Menu addMenu(
		org.liferayasif.sb.model.Menu menu) {
		return _menuLocalService.addMenu(menu);
	}

	/**
	* Creates a new menu with the primary key. Does not add the menu to the database.
	*
	* @param menuId the primary key for the new menu
	* @return the new menu
	*/
	@Override
	public org.liferayasif.sb.model.Menu createMenu(long menuId) {
		return _menuLocalService.createMenu(menuId);
	}

	/**
	* Deletes the menu with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param menuId the primary key of the menu
	* @return the menu that was removed
	* @throws PortalException if a menu with the primary key could not be found
	*/
	@Override
	public org.liferayasif.sb.model.Menu deleteMenu(long menuId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _menuLocalService.deleteMenu(menuId);
	}

	/**
	* Deletes the menu from the database. Also notifies the appropriate model listeners.
	*
	* @param menu the menu
	* @return the menu that was removed
	*/
	@Override
	public org.liferayasif.sb.model.Menu deleteMenu(
		org.liferayasif.sb.model.Menu menu) {
		return _menuLocalService.deleteMenu(menu);
	}

	@Override
	public org.liferayasif.sb.model.Menu fetchMenu(long menuId) {
		return _menuLocalService.fetchMenu(menuId);
	}

	/**
	* Returns the menu with the primary key.
	*
	* @param menuId the primary key of the menu
	* @return the menu
	* @throws PortalException if a menu with the primary key could not be found
	*/
	@Override
	public org.liferayasif.sb.model.Menu getMenu(long menuId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _menuLocalService.getMenu(menuId);
	}

	/**
	* Updates the menu in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param menu the menu
	* @return the menu that was updated
	*/
	@Override
	public org.liferayasif.sb.model.Menu updateMenu(
		org.liferayasif.sb.model.Menu menu) {
		return _menuLocalService.updateMenu(menu);
	}

	@Override
	public MenuLocalService getWrappedService() {
		return _menuLocalService;
	}

	@Override
	public void setWrappedService(MenuLocalService menuLocalService) {
		_menuLocalService = menuLocalService;
	}

	private MenuLocalService _menuLocalService;
}