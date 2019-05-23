package ru.ganeev.task6.Task3;


import java.util.Arrays;

public class Convrt {
    public static  Act convert (Contract contract){
        Act act = new Act();
//        int number = contract.getNumber();
//        String date = contract.getDate();
//        String[] listOfGoods = contract.getListOfGoods();

        int goodsCount = contract.getListOfGoods().length;
        String[] copyOfGoods = new String[goodsCount];
        System.arraycopy(contract.getListOfGoods(),0,copyOfGoods,0,goodsCount);
        act.setListOfGoods(copyOfGoods);
        act.setNumber(contract.getNumber());
        act.setDate(contract.getDate());
        //act.setListOfGoods(contract.getListOfGoods());
        act.setListOfGoods(copyOfGoods);
        return act;
    }
    public static void main(String[] args) {
        Contract con1 = new Contract();
        con1.setDate("25.05.19");
        con1.setNumber(12);
        con1.setListOfGoods(new String[]{"apple", "lemon","pineapple"});
        Act act = Convrt.convert(con1);



        System.out.println(act.getNumber() + " " + " " + act.getDate() + " " + Arrays.toString(act.getListOfGoods()));
    }
}
