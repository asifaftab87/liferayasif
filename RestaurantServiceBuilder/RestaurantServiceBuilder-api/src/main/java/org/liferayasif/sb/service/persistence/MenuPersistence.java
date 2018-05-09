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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.liferayasif.sb.exception.NoSuchMenuException;
import org.liferayasif.sb.model.Menu;

/**
 * The persistence interface for the menu service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see org.liferayasif.sb.service.persistence.impl.MenuPersistenceImpl
 * @see MenuUtil
 * @generated
 */
@ProviderType
public interface MenuPersistence extends BasePersistence<Menu> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MenuUtil} to access the menu persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the menus where type = &#63;.
	*
	* @param type the type
	* @return the matching menus
	*/
	public java.util.List<Menu> findByType(java.lang.String type);

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
	public java.util.List<Menu> findByType(java.lang.String type, int start,
		int end);

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
	public java.util.List<Menu> findByType(java.lang.String type, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Menu> orderByComparator);

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
	public java.util.List<Menu> findByType(java.lang.String type, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Menu> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first menu in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching menu
	* @throws NoSuchMenuException if a matching menu could not be found
	*/
	public Menu findByType_First(java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator<Menu> orderByComparator)
		throws NoSuchMenuException;

	/**
	* Returns the first menu in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching menu, or <code>null</code> if a matching menu could not be found
	*/
	public Menu fetchByType_First(java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator<Menu> orderByComparator);

	/**
	* Returns the last menu in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching menu
	* @throws NoSuchMenuException if a matching menu could not be found
	*/
	public Menu findByType_Last(java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator<Menu> orderByComparator)
		throws NoSuchMenuException;

	/**
	* Returns the last menu in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching menu, or <code>null</code> if a matching menu could not be found
	*/
	public Menu fetchByType_Last(java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator<Menu> orderByComparator);

	/**
	* Returns the menus before and after the current menu in the ordered set where type = &#63;.
	*
	* @param menuId the primary key of the current menu
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next menu
	* @throws NoSuchMenuException if a menu with the primary key could not be found
	*/
	public Menu[] findByType_PrevAndNext(long menuId, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator<Menu> orderByComparator)
		throws NoSuchMenuException;

	/**
	* Removes all the menus where type = &#63; from the database.
	*
	* @param type the type
	*/
	public void removeByType(java.lang.String type);

	/**
	* Returns the number of menus where type = &#63;.
	*
	* @param type the type
	* @return the number of matching menus
	*/
	public int countByType(java.lang.String type);

	/**
	* Caches the menu in the entity cache if it is enabled.
	*
	* @param menu the menu
	*/
	public void cacheResult(Menu menu);

	/**
	* Caches the menus in the entity cache if it is enabled.
	*
	* @param menus the menus
	*/
	public void cacheResult(java.util.List<Menu> menus);

	/**
	* Creates a new menu with the primary key. Does not add the menu to the database.
	*
	* @param menuId the primary key for the new menu
	* @return the new menu
	*/
	public Menu create(long menuId);

	/**
	* Removes the menu with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param menuId the primary key of the menu
	* @return the menu that was removed
	* @throws NoSuchMenuException if a menu with the primary key could not be found
	*/
	public Menu remove(long menuId) throws NoSuchMenuException;

	public Menu updateImpl(Menu menu);

	/**
	* Returns the menu with the primary key or throws a {@link NoSuchMenuException} if it could not be found.
	*
	* @param menuId the primary key of the menu
	* @return the menu
	* @throws NoSuchMenuException if a menu with the primary key could not be found
	*/
	public Menu findByPrimaryKey(long menuId) throws NoSuchMenuException;

	/**
	* Returns the menu with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param menuId the primary key of the menu
	* @return the menu, or <code>null</code> if a menu with the primary key could not be found
	*/
	public Menu fetchByPrimaryKey(long menuId);

	@Override
	public java.util.Map<java.io.Serializable, Menu> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the menus.
	*
	* @return the menus
	*/
	public java.util.List<Menu> findAll();

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
	public java.util.List<Menu> findAll(int start, int end);

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
	public java.util.List<Menu> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Menu> orderByComparator);

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
	public java.util.List<Menu> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Menu> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the menus from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of menus.
	*
	* @return the number of menus
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}