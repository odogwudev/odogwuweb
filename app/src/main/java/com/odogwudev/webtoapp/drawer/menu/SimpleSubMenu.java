package com.odogwudev.webtoapp.drawer.menu;

import android.view.MenuItem;
import android.view.SubMenu;

/**
 * @author Odogwudev
 * Copyright 2021
 */
public class SimpleSubMenu {
    //Sub menu
    SubMenu subMenu;
    String subMenuTitle;

    //Parent menu
    SimpleMenu parent;

    //Create a new submenu
    public SimpleSubMenu(SimpleMenu menu, String subMenu){
        super();
        this.parent = menu;
        this.subMenuTitle = subMenu;
        this.subMenu = menu.getMenu().addSubMenu(subMenu);

    }

    public MenuItem add(String title, int drawable, Action action) {
        return parent.add(subMenu, title, drawable, action);
    }

    public String getSubMenuTitle(){
        return subMenuTitle;
    }

}
