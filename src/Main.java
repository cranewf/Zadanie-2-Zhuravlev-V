public class Main {
    public static void main(String[] args) {

        int amount = 50; // У клиента на счету 50 руб
        int popolnenie = 1500; // Сумма пополнения
        int casback = 100; // 1 бонусный рубль за каждые 100 руб
        int bonus; // Бонус за пополнение

        if (popolnenie > 1000) {
            bonus = popolnenie/casback;
        } else {
            bonus = 0;
        }

        int balance = amount + popolnenie + bonus;

        System.out.println("Ваш баланс " + balance + " рублей");
    }
}
