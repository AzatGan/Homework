package ru.ganeev.task5;

public class Drink {
     private String name;
     private Integer priсe;
     private Integer count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPriсe() {
        return priсe;
    }

    public void setPriсe(Integer priсe) {
        this.priсe = priсe;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Drink(String name, Integer priсe, Integer count) {
        this.name = name;
        this.priсe = priсe;
        this.count = count;

    }

    public int buy(int money) {
        count = count - 1;
        return money - priсe;
    }
}

