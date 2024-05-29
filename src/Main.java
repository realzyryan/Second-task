import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int initialData = 100;
        int replenishmentAmount = 1000;
        int bonus;
        int balance1;
        int balance2;
        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
            balance1 = (initialData + replenishmentAmount + bonus);
            System.out.println("Бонус равен " + bonus + " Итоговая сумма " + balance1);
        } else {
            balance2 = (initialData + replenishmentAmount);
            System.out.println("Бонусов нет, итоговая сумма " + balance2);
        }
    }
}