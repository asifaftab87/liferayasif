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

package org.liferayasif.sb.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.liferayasif.sb.model.Menu;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the menu service. This utility wraps {@link org.liferayasif.sb.service.persistence.impl.MenuPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MenuPersistence
 * @see org.liferayasif.sb.service.persistence.impl.MenuPersistenceImpl
 * @generated
 */
@ProviderType
public class MenuUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Menu menu) {
		getPersistence().clearCache(menu);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Menu> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Menu> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Menu> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Menu> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Menu update(Menu menu) {
		return getPersistence().update(menu);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Menu update(Menu menu, ServiceContext serviceContext) {
		return getPersistence().update(menu, serviceContext);
	}

	/**
	* Returns all the menus where type = &#63;.
	*
	* @param type the type
	* @return the matching menus
	*/
	public static List<Menu> findByType(java.lang.String type) {
		return getPersistence().findByType(type);
	}

	/**
	* Returns a range of all the menus where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MenuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param type the type
	* @param start the lower bound of the range of menus
	* @param end the upper bound of the range of menus (not inclusive)
	* @return the range of matching menus
	*/
	public static List<Menu> findByType(java.lang.String type, int start,
		int end) {
		return getPersistence().findByType(type, start, end);
	}

	/**
	* Returns an ordered range of all the menus where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MenuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param type the type
	* @param start the lower bound of the range of menus
	* @param end the upper bound of the range of menus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching menus
	*/
	public static List<Menu> findByType(java.lang.String type, int start,
		int end, OrderByComparator<Menu> orderByComparator) {
		return getPersistence().findByType(type, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the menus where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MenuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param type the type
	* @param start the lower bound of the range of menus
	* @param end the upper bound of the range of menus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching menus
	*/
	public static List<Menu> findByType(java.lang.String type, int start,
		int end, OrderByComparator<Menu> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByType(type, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first menu in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching menu
	* @throws NoSuchMenuException if a matching menu could not be found
	*/
	public static Menu findByType_First(java.lang.String type,
		OrderByComparator<Menu> orderByComparator)
		throws org.liferayasif.sb.exception.NoSuchMenuException {
		return getPersistence().findByType_First(type, orderByComparator);
	}

	/**
	* Returns the first menu in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching menu, or <code>null</code> if a matching menu could not be found
	*/
	public static Menu fetchByType_First(java.lang.String type,
		OrderByComparator<Menu> orderByComparator) {
		return getPersistence().fetchByType_First(type, orderByComparator);
	}

	/**
	* Returns the last menu in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching menu
	* @throws NoSuchMenuException if a matching menu could not be found
	*/
	public static Menu findByType_Last(java.lang.String type,
		OrderByComparator<Menu> orderByComparator)
		throws org.liferayasif.sb.exception.NoSuchMenuException {
		return getPersistence().findByType_Last(type, orderByComparator);
	}

	/**
	* Returns the last menu in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching menu, or <code>null</code> if a matching menu could not be found
	*/
	public static Menu fetchByType_Last(java.lang.String type,
		OrderByComparator<Menu> orderByComparator) {
		return getPersistence().fetchByType_Last(type, orderByComparator);
	}

	/**
	* Returns the menus before and after the current menu in the ordered set where type = &#63;.
	*
	* @param menuId the primary key of the current menu
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next menu
	* @throws NoSuchMenuException if a menu with the primary key could not be found
	*/
	public static Menu[] findByType_PrevAndNext(long menuId,
		java.lang.String type, OrderByComparator<Menu> orderByComparator)
		throws org.liferayasif.sb.exception.NoSuchMenuException {
		return getPersistence()
				   .findByType_PrevAndNext(menuId, type, orderByComparator);
	}

	/**
	* Removes all the menus where type = &#63; from the database.
	*
	* @param type the type
	*/
	public static void removeByType(java.lang.String type) {
		getPersistence().removeByType(type);
	}

	/**
	* Returns the number of menus where type = &#63;.
	*
	* @param type the type
	* @return the number of matching menus
	*/
	public static int countByType(java.lang.String type) {
		return getPersistence().countByType(type);
	}

	/**
	* Caches the menu in the entity cache if it is enabled.
	*
	* @param menu the menu
	*/
	public static void cacheResult(Menu menu) {
		getPersistence().cacheResult(menu);
	}

	/**
	* Caches the menus in the entity cache if it is enabled.
	*
	* @param menus the menus
	*/
	public static void cacheResult(List<Menu> menus) {
		getPersistence().cacheResult(menus);
	}

	/**
	* Creates a new menu with the primary key. Does not add the menu to the database.
	*
	* @param menuId the primary key for the new menu
	* @return the new menu
	*/
	public static Menu create(long menuId) {
		return getPersistence().create(menuId);
	}

	/**
	* Removes the menu with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param menuId the primary key of the menu
	* @return the menu that was removed
	* @throws NoSuchMenuException if a menu with the primary key could not be found
	*/
	public static Menu remove(long menuId)
		throws org.liferayasif.sb.exception.NoSuchMenuException {
		return getPersistence().remove(menuId);
	}

	public static Menu updateImpl(Menu menu) {
		return getPersistence().updateImpl(menu);
	}

	/**
	* Returns the menu with the primary key or throws a {@link NoSuchMenuException} if it could not be found.
	*
	* @param menuId the primary key of the menu
	* @return the menu
	* @throws NoSuchMenuException if a menu with the primary key could not be found
	*/
	public static Menu findByPrimaryKey(long menuId)
		throws org.liferayasif.sb.exception.NoSuchMenuException {
		return getPersistence().findByPrimaryKey(menuId);
	}

	/**
	* Returns the menu with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param menuId the primary key of the menu
	* @return the menu, or <code>null</code> if a menu with the primary key could not be found
	*/
	public static Menu fetchByPrimaryKey(long menuId) {
		return getPersistence().fetchByPrimaryKey(menuId);
	}

	public static java.util.Map<java.io.Serializable, Menu> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the menus.
	*
	* @return the menus
	*/
	public static List<Menu> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the menus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MenuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of menus
	* @param end the upper bound of the range of menus (not inclusive)
	* @return the range of menus
	*/
	public static List<Menu> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the menus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MenuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of menus
	* @param end the upper bound of the range of menus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of menus
	*/
	public static List<Menu> findAll(int start, int end,
		OrderByComparator<Menu> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the menus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MenuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of menus
	* @param end the upper bound of the range of menus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of menus
	*/
	public static List<Menu> findAll(int start, int end,
		OrderByComparator<Menu> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the menus from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of menus.
	*
	* @return the number of menus
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static MenuPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<MenuPersistence, MenuPersistence> _serviceTracker =
		ServiceTrackerFactory.open(MenuPersistence.class);
}