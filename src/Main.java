public class Main {
    public static void main(String[] args) {

        int accountBalance = 50; // У клиента на счету 50 руб
        int creditAmount = 950; // Сумма пополнения
        int cashback = 100; // 1 бонусный рубль за каждые 100 руб
        int bonus; // Бонус за пополнение

        if (creditAmount > 1000) {
            bonus = creditAmount / cashback;
        } else {
            bonus = 0;
        }

        int balance = accountBalance + creditAmount + bonus;

        System.out.println("Ваш баланс " + balance + " рублей");
        System.out.println("Ваши бонусы " + bonus + " рублей");
    }
}
