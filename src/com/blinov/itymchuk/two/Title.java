package com.blinov.itymchuk.two;

/**
 * The {@code Title} class create and print info about author program
 * @author Ihor Tymchuk
 * @since 06.06.2021
 * @see java.lang.Object#toString()
 **/

public class Title {
    String author, dateStart, dateFinish;

    public Title() {
        this.author = "unknown";
    }

    public Title(String author) {
        this.author = author;
    }

    public Title(String author, String dateStart, String dateFinish) {
        this.author = author;
        this.dateStart = dateStart;
        this.dateFinish = dateFinish;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public void setDateFinish(String dateFinish) {
        this.dateFinish = dateFinish;
    }

    @Override
    public String toString() {
        return
                "author='" + author + '\'' +
                        ", \ndateStart='" + dateStart + '\'' +
                        ", \ndateFinish='" + dateFinish + '\'';
    }
}
