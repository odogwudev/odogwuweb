package com.odogwudev.webtoapp.drawer.menu;

import android.view.Menu;
import android.view.MenuItem;

/**
 *
 * @author Odogwudev
 * Copyright 2021
 */
public class SimpleMenu extends SimpleAbstractMenu {

    public SimpleMenu(Menu menu, MenuItemCallback callback){
        super();
        this.menu = menu;
        this.callback = callback;
    }

    public MenuItem add(String title, int drawable, Action action) {
        return add(menu, title, drawable, action);
    }

}
