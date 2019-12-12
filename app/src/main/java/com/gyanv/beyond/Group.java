package com.gyanv.beyond;

public class Group {
    private String name;
    private String page_id;
    private int icon;
    private boolean sub;

    public Group(int icon, String name, String page_id) {
        this.name = name;
        this.icon = icon;
        this.page_id = page_id;
    }

    //get name method

    public String getName() {
        return name;
    }

    // get page_id method
    public String getPage_id() {
        return page_id;
    }

    // get icon
    public int getIcon() {
        return icon;
    }


}
