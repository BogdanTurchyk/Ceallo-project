package com.cydeo.enums.contacts;

public enum ContactTab {
    ALL_CONTACTS("All contacts"), NOT_GROUPED("Not grouped");

    private final String name;

    private ContactTab(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
