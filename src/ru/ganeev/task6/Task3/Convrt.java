package ru.ganeev.task6.Task3;
import java.util.Arrays;

public class Convrt {
    public static  Act convert (Contract contract){
        Act act = new Act();
//        int number = contract.getNumber();
//        String date = contract.getDate();
//        String[] listOfGoods = contract.getListOfGoods();
        act.setNumber(contract.getNumber());
        act.setDate(contract.getDate());
        act.setListOfGoods(contract.getListOfGoods());
        return act;
    }
    public static void main(String[] args) {
        Contract con1 = new Contract();
        Act act = Convrt.convert(con1);


        System.out.println(act.getNumber() + " " + " " + act.getDate() + "" + Arrays.toString(act.getListOfGoods()));
    }
}
