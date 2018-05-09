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

package org.liferayasif.sb.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReflectionUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import org.liferayasif.sb.exception.NoSuchMenuException;
import org.liferayasif.sb.model.Menu;
import org.liferayasif.sb.model.impl.MenuImpl;
import org.liferayasif.sb.model.impl.MenuModelImpl;
import org.liferayasif.sb.service.persistence.MenuPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the menu service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MenuPersistence
 * @see org.liferayasif.sb.service.persistence.MenuUtil
 * @generated
 */
@ProviderType
public class MenuPersistenceImpl extends BasePersistenceImpl<Menu>
	implements MenuPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MenuUtil} to access the menu persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MenuImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MenuModelImpl.ENTITY_CACHE_ENABLED,
			MenuModelImpl.FINDER_CACHE_ENABLED, MenuImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MenuModelImpl.ENTITY_CACHE_ENABLED,
			MenuModelImpl.FINDER_CACHE_ENABLED, MenuImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MenuModelImpl.ENTITY_CACHE_ENABLED,
			MenuModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPE = new FinderPath(MenuModelImpl.ENTITY_CACHE_ENABLED,
			MenuModelImpl.FINDER_CACHE_ENABLED, MenuImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByType",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE = new FinderPath(MenuModelImpl.ENTITY_CACHE_ENABLED,
			MenuModelImpl.FINDER_CACHE_ENABLED, MenuImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByType",
			new String[] { String.class.getName() },
			MenuModelImpl.TYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TYPE = new FinderPath(MenuModelImpl.ENTITY_CACHE_ENABLED,
			MenuModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByType",
			new String[] { String.class.getName() });

	/**
	 * Returns all the menus where type = &#63;.
	 *
	 * @param type the type
	 * @return the matching menus
	 */
	@Override
	public List<Menu> findByType(String type) {
		return findByType(type, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Menu> findByType(String type, int start, int end) {
		return findByType(type, start, end, null);
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
	@Override
	public List<Menu> findByType(String type, int start, int end,
		OrderByComparator<Menu> orderByComparator) {
		return findByType(type, start, end, orderByComparator, true);
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
	@Override
	public List<Menu> findByType(String type, int start, int end,
		OrderByComparator<Menu> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE;
			finderArgs = new Object[] { type };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPE;
			finderArgs = new Object[] { type, start, end, orderByComparator };
		}

		List<Menu> list = null;

		if (retrieveFromCache) {
			list = (List<Menu>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Menu menu : list) {
					if (!Objects.equals(type, menu.getType())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_MENU_WHERE);

			boolean bindType = false;

			if (type == null) {
				query.append(_FINDER_COLUMN_TYPE_TYPE_1);
			}
			else if (type.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TYPE_TYPE_3);
			}
			else {
				bindType = true;

				query.append(_FINDER_COLUMN_TYPE_TYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MenuModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindType) {
					qPos.add(type);
				}

				if (!pagination) {
					list = (List<Menu>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Menu>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first menu in the ordered set where type = &#63;.
	 *
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching menu
	 * @throws NoSuchMenuException if a matching menu could not be found
	 */
	@Override
	public Menu findByType_First(String type,
		OrderByComparator<Menu> orderByComparator) throws NoSuchMenuException {
		Menu menu = fetchByType_First(type, orderByComparator);

		if (menu != null) {
			return menu;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMenuException(msg.toString());
	}

	/**
	 * Returns the first menu in the ordered set where type = &#63;.
	 *
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching menu, or <code>null</code> if a matching menu could not be found
	 */
	@Override
	public Menu fetchByType_First(String type,
		OrderByComparator<Menu> orderByComparator) {
		List<Menu> list = findByType(type, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last menu in the ordered set where type = &#63;.
	 *
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching menu
	 * @throws NoSuchMenuException if a matching menu could not be found
	 */
	@Override
	public Menu findByType_Last(String type,
		OrderByComparator<Menu> orderByComparator) throws NoSuchMenuException {
		Menu menu = fetchByType_Last(type, orderByComparator);

		if (menu != null) {
			return menu;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMenuException(msg.toString());
	}

	/**
	 * Returns the last menu in the ordered set where type = &#63;.
	 *
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching menu, or <code>null</code> if a matching menu could not be found
	 */
	@Override
	public Menu fetchByType_Last(String type,
		OrderByComparator<Menu> orderByComparator) {
		int count = countByType(type);

		if (count == 0) {
			return null;
		}

		List<Menu> list = findByType(type, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Menu[] findByType_PrevAndNext(long menuId, String type,
		OrderByComparator<Menu> orderByComparator) throws NoSuchMenuException {
		Menu menu = findByPrimaryKey(menuId);

		Session session = null;

		try {
			session = openSession();

			Menu[] array = new MenuImpl[3];

			array[0] = getByType_PrevAndNext(session, menu, type,
					orderByComparator, true);

			array[1] = menu;

			array[2] = getByType_PrevAndNext(session, menu, type,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Menu getByType_PrevAndNext(Session session, Menu menu,
		String type, OrderByComparator<Menu> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MENU_WHERE);

		boolean bindType = false;

		if (type == null) {
			query.append(_FINDER_COLUMN_TYPE_TYPE_1);
		}
		else if (type.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TYPE_TYPE_3);
		}
		else {
			bindType = true;

			query.append(_FINDER_COLUMN_TYPE_TYPE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(MenuModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindType) {
			qPos.add(type);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(menu);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Menu> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the menus where type = &#63; from the database.
	 *
	 * @param type the type
	 */
	@Override
	public void removeByType(String type) {
		for (Menu menu : findByType(type, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(menu);
		}
	}

	/**
	 * Returns the number of menus where type = &#63;.
	 *
	 * @param type the type
	 * @return the number of matching menus
	 */
	@Override
	public int countByType(String type) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TYPE;

		Object[] finderArgs = new Object[] { type };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MENU_WHERE);

			boolean bindType = false;

			if (type == null) {
				query.append(_FINDER_COLUMN_TYPE_TYPE_1);
			}
			else if (type.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TYPE_TYPE_3);
			}
			else {
				bindType = true;

				query.append(_FINDER_COLUMN_TYPE_TYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindType) {
					qPos.add(type);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_TYPE_TYPE_1 = "menu.type IS NULL";
	private static final String _FINDER_COLUMN_TYPE_TYPE_2 = "menu.type = ?";
	private static final String _FINDER_COLUMN_TYPE_TYPE_3 = "(menu.type IS NULL OR menu.type = '')";

	public MenuPersistenceImpl() {
		setModelClass(Menu.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("type", "type_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the menu in the entity cache if it is enabled.
	 *
	 * @param menu the menu
	 */
	@Override
	public void cacheResult(Menu menu) {
		entityCache.putResult(MenuModelImpl.ENTITY_CACHE_ENABLED,
			MenuImpl.class, menu.getPrimaryKey(), menu);

		menu.resetOriginalValues();
	}

	/**
	 * Caches the menus in the entity cache if it is enabled.
	 *
	 * @param menus the menus
	 */
	@Override
	public void cacheResult(List<Menu> menus) {
		for (Menu menu : menus) {
			if (entityCache.getResult(MenuModelImpl.ENTITY_CACHE_ENABLED,
						MenuImpl.class, menu.getPrimaryKey()) == null) {
				cacheResult(menu);
			}
			else {
				menu.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all menus.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MenuImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the menu.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Menu menu) {
		entityCache.removeResult(MenuModelImpl.ENTITY_CACHE_ENABLED,
			MenuImpl.class, menu.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Menu> menus) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Menu menu : menus) {
			entityCache.removeResult(MenuModelImpl.ENTITY_CACHE_ENABLED,
				MenuImpl.class, menu.getPrimaryKey());
		}
	}

	/**
	 * Creates a new menu with the primary key. Does not add the menu to the database.
	 *
	 * @param menuId the primary key for the new menu
	 * @return the new menu
	 */
	@Override
	public Menu create(long menuId) {
		Menu menu = new MenuImpl();

		menu.setNew(true);
		menu.setPrimaryKey(menuId);

		return menu;
	}

	/**
	 * Removes the menu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param menuId the primary key of the menu
	 * @return the menu that was removed
	 * @throws NoSuchMenuException if a menu with the primary key could not be found
	 */
	@Override
	public Menu remove(long menuId) throws NoSuchMenuException {
		return remove((Serializable)menuId);
	}

	/**
	 * Removes the menu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the menu
	 * @return the menu that was removed
	 * @throws NoSuchMenuException if a menu with the primary key could not be found
	 */
	@Override
	public Menu remove(Serializable primaryKey) throws NoSuchMenuException {
		Session session = null;

		try {
			session = openSession();

			Menu menu = (Menu)session.get(MenuImpl.class, primaryKey);

			if (menu == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMenuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(menu);
		}
		catch (NoSuchMenuException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Menu removeImpl(Menu menu) {
		menu = toUnwrappedModel(menu);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(menu)) {
				menu = (Menu)session.get(MenuImpl.class, menu.getPrimaryKeyObj());
			}

			if (menu != null) {
				session.delete(menu);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (menu != null) {
			clearCache(menu);
		}

		return menu;
	}

	@Override
	public Menu updateImpl(Menu menu) {
		menu = toUnwrappedModel(menu);

		boolean isNew = menu.isNew();

		MenuModelImpl menuModelImpl = (MenuModelImpl)menu;

		Session session = null;

		try {
			session = openSession();

			if (menu.isNew()) {
				session.save(menu);

				menu.setNew(false);
			}
			else {
				menu = (Menu)session.merge(menu);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!MenuModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { menuModelImpl.getType() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_TYPE, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((menuModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { menuModelImpl.getOriginalType() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TYPE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE,
					args);

				args = new Object[] { menuModelImpl.getType() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TYPE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE,
					args);
			}
		}

		entityCache.putResult(MenuModelImpl.ENTITY_CACHE_ENABLED,
			MenuImpl.class, menu.getPrimaryKey(), menu, false);

		menu.resetOriginalValues();

		return menu;
	}

	protected Menu toUnwrappedModel(Menu menu) {
		if (menu instanceof MenuImpl) {
			return menu;
		}

		MenuImpl menuImpl = new MenuImpl();

		menuImpl.setNew(menu.isNew());
		menuImpl.setPrimaryKey(menu.getPrimaryKey());

		menuImpl.setMenuId(menu.getMenuId());
		menuImpl.setType(menu.getType());
		menuImpl.setFoodName(menu.getFoodName());
		menuImpl.setPrice(menu.getPrice());

		return menuImpl;
	}

	/**
	 * Returns the menu with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the menu
	 * @return the menu
	 * @throws NoSuchMenuException if a menu with the primary key could not be found
	 */
	@Override
	public Menu findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMenuException {
		Menu menu = fetchByPrimaryKey(primaryKey);

		if (menu == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMenuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return menu;
	}

	/**
	 * Returns the menu with the primary key or throws a {@link NoSuchMenuException} if it could not be found.
	 *
	 * @param menuId the primary key of the menu
	 * @return the menu
	 * @throws NoSuchMenuException if a menu with the primary key could not be found
	 */
	@Override
	public Menu findByPrimaryKey(long menuId) throws NoSuchMenuException {
		return findByPrimaryKey((Serializable)menuId);
	}

	/**
	 * Returns the menu with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the menu
	 * @return the menu, or <code>null</code> if a menu with the primary key could not be found
	 */
	@Override
	public Menu fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(MenuModelImpl.ENTITY_CACHE_ENABLED,
				MenuImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Menu menu = (Menu)serializable;

		if (menu == null) {
			Session session = null;

			try {
				session = openSession();

				menu = (Menu)session.get(MenuImpl.class, primaryKey);

				if (menu != null) {
					cacheResult(menu);
				}
				else {
					entityCache.putResult(MenuModelImpl.ENTITY_CACHE_ENABLED,
						MenuImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(MenuModelImpl.ENTITY_CACHE_ENABLED,
					MenuImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return menu;
	}

	/**
	 * Returns the menu with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param menuId the primary key of the menu
	 * @return the menu, or <code>null</code> if a menu with the primary key could not be found
	 */
	@Override
	public Menu fetchByPrimaryKey(long menuId) {
		return fetchByPrimaryKey((Serializable)menuId);
	}

	@Override
	public Map<Serializable, Menu> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Menu> map = new HashMap<Serializable, Menu>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Menu menu = fetchByPrimaryKey(primaryKey);

			if (menu != null) {
				map.put(primaryKey, menu);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(MenuModelImpl.ENTITY_CACHE_ENABLED,
					MenuImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Menu)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_MENU_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Menu menu : (List<Menu>)q.list()) {
				map.put(menu.getPrimaryKeyObj(), menu);

				cacheResult(menu);

				uncachedPrimaryKeys.remove(menu.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(MenuModelImpl.ENTITY_CACHE_ENABLED,
					MenuImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the menus.
	 *
	 * @return the menus
	 */
	@Override
	public List<Menu> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Menu> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Menu> findAll(int start, int end,
		OrderByComparator<Menu> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Menu> findAll(int start, int end,
		OrderByComparator<Menu> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Menu> list = null;

		if (retrieveFromCache) {
			list = (List<Menu>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_MENU);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MENU;

				if (pagination) {
					sql = sql.concat(MenuModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Menu>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Menu>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the menus from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Menu menu : findAll()) {
			remove(menu);
		}
	}

	/**
	 * Returns the number of menus.
	 *
	 * @return the number of menus
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MENU);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MenuModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the menu persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(MenuImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_MENU = "SELECT menu FROM Menu menu";
	private static final String _SQL_SELECT_MENU_WHERE_PKS_IN = "SELECT menu FROM Menu menu WHERE menuId IN (";
	private static final String _SQL_SELECT_MENU_WHERE = "SELECT menu FROM Menu menu WHERE ";
	private static final String _SQL_COUNT_MENU = "SELECT COUNT(menu) FROM Menu menu";
	private static final String _SQL_COUNT_MENU_WHERE = "SELECT COUNT(menu) FROM Menu menu WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "menu.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Menu exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Menu exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(MenuPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"type"
			});
}