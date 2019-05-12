package ru.ganeev.task5;



public class VendingMachine {
    private Drink[] drinks;
    private int money = 0;
    public VendingMachine(Drink[]drinks) {
        this.drinks = drinks; // присвоили в поле класса значение из аргумента конструктора
    }
    public void showmenu(){
       // выводим id, название, цену каждого напитка с количество больше 0

        for (int id = 0; id < drinks.length; id++) {
           if (drinks[id].getCount()>0){
               System.out.printf("%d. %s. цена: %d. ",id, drinks[id].getName(), drinks[id].getPriсe());
               System.out.println();
           }
        }
    }


    public void inputMoney(int money) {
        this.money = this.money + money;

    }
    public boolean tryToBuy(int id) {
        Drink selectedDrink;
        selectedDrink = drinks[id];
        System.out.printf("Вы внесли %d руб. Напиток '%s' стоит %d руб.", money, selectedDrink.getName(), selectedDrink.getPriсe());
        System.out.println();

        if (money >= selectedDrink.getPriсe()) {
            int change = selectedDrink.buy(money);
            money = 0;
            System.out.printf("Вы купили напиток %s получите сдачу %d", selectedDrink.getName(), change);
            System.out.println();
            return true;
        } else {
            int insufficiently = selectedDrink.buy(money);
            System.out.printf("не достаточно средств, внесите ещё: %d руб.", insufficiently );
            return false;
        }
    }
}
