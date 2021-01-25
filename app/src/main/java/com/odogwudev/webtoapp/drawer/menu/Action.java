package com.odogwudev.webtoapp.drawer.menu;

import java.io.Serializable;

/**
 *
 * @author Odogwudev
 * Copyright 2021
 */
public class Action implements Serializable{

    public String name;
    public String url;

    public Action(String name, String url){
        this.name = name;
        this.url = url;
    }

}
