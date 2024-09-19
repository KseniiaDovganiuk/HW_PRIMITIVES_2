public class Main {
    public static void main(String[] args) {

        int startingScore = 100; // начальная сумма на счету клиента
        int replenishment = 800; // сумма пополнения
        int bonus; // количество бонусных рублей
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int total = startingScore + replenishment + bonus; // итоговый счет

        System.out.println("Бонусные рубли: " + bonus);
        System.out.println("Итоговый счет: " + total);

    }
}
