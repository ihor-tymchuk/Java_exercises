package com.blinov.itymchuk.three;

public class Study {
    private String facultative;
    private int level;
    private String group;

    public Study(){}

    public Study(String facultative, int level, String group) {
        this.facultative = facultative;
        this.level = level;
        this.group = group;
    }

    public String getFacultative() {
        return facultative;
    }

    public void setFacultative(String facultative) {
        this.facultative = facultative;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Study{" +
                "facultative='" + facultative + '\'' +
                ", level=" + level +
                ", group='" + group + '\'' +
                '}';
    }
}
