package ru.ganeev.task6.Task3;

public  class Contract {
    private int number = 12;
    private String date = "23.05.19";
    private String[] listOfGoods = {"apple", "lemon", "pineapple"};

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String[] getListOfGoods() {
        return listOfGoods;
    }

    public void setListOfGoods(String[] listOfGoods) {
        this.listOfGoods = listOfGoods;
    }
}
