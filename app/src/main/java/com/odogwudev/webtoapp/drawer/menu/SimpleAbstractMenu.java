package com.odogwudev.webtoapp.drawer.menu;

import android.view.Menu;
import android.view.MenuItem;

import com.odogwudev.webtoapp.R;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Odogwudev
 * Copyright 2021
 */
public abstract class SimpleAbstractMenu {
    //Top menu
    protected Menu menu;
    protected MenuItemCallback callback;

    //Keep track of everything in the menu and submenu's
    protected Map<MenuItem, Action> menuContent;

    public SimpleAbstractMenu(){
        menuContent = new LinkedHashMap<>();
    }

    protected MenuItem add(Menu menu, String title, int drawable, final Action action){
        //Add the item to the menu
        MenuItem item = menu.add(R.id.main_group, Menu.NONE, Menu.NONE, title).setCheckable(true).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                callback.menuItemClicked(action, menuItem);
                return true;
            }
        });

        if (drawable != 0)
            item.setIcon(drawable);

        menuContent.put(item, action);

        return item;
    }

    protected Menu getMenu(){
        return menu;
    }

    protected MenuItemCallback getMenuItemCallback(){
        return callback;
    }

    public Map.Entry<MenuItem, Action> getFirstMenuItem(){
        if (menuContent.size() < 1) {
            return null;
        }

        return menuContent.entrySet().iterator().next();
    }

    public Set<MenuItem> getMenuItems(){
        return menuContent.keySet();
    }

}
