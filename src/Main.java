public class Main {
    public static void main(String[] args) {
        int amount = 100; // сумма на счету
        int refill = 1100; // сумма пополнения счета
        int bonusСalculation = 100; // условие для расчета бонуса

        int pill;
        int bonus;

        if (refill > 1000) {
            pill = refill / bonusСalculation + refill + amount;
            bonus = refill / bonusСalculation;
        } else {
            pill = amount + refill;
            bonus = 0;
        }
        System.out.println(pill);
        System.out.println(bonus);
    }
}