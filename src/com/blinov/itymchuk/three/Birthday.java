package com.blinov.itymchuk.three;

public class Birthday {
    private int day;
    private int month;
    private int year;

    public void setBirthday(int day, int month, int year) {
        try {
            checkBirthday(day, month, year);
            this.day = day;
            this.month = month;
            this.year = year;
        } catch (BirthdayLogicException e) {
            System.err.println(e);
        }
    }

    public boolean isFilledBirthday() {
        return day != 0 && month != 0 && year != 0;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return day + "-" + month + "-" + year;
    }

    private boolean checkBirthday(int day, int month, int year) throws BirthdayLogicException {
        if (!isSpectrumDayInMonth(day, month, year)) {
            throw new BirthdayLogicException("spectrum DAY is incorect: " + day + "-" + month + "-" + year);
        }
        if (!isSpectrumMonth(month)) {
            throw new BirthdayLogicException("spectrum MONTH is incorect: " + day + "-" + month + "-" + year);
        }
        if (!isSpectrumYear(year)) {
            throw new BirthdayLogicException("spectrum YEAR is incorect: " + day + "-" + month + "-" + year);
        }
        return true;
    }

    private boolean isHightYear(int year) {
        if (year % 100 == 0) {
            return year % 400 == 0;
        }
        return year % 4 == 0;
    }

    private boolean isSpectrumYear(int year) {
        return year > 0;
    }

    private boolean isSpectrumMonth(int month) {
        return month > 0 && month <= 12;
    }

    private boolean isSpectrumDayInMonth(int day, int month, int year) {
        if (day > 0) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return day <= 31;
                case 2:
                    if (isHightYear(year)) {
                        return day <= 29;
                    } else {
                        return day <= 28;
                    }
                default:
                    return day <= 30;
            }
        }
        return false;
    }
}
