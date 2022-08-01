public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int myInt = 1;
        short myShort = 2;
        byte myByte = 120;
        long myLong = 11232L;
        float myFloat = 111.2f;
        double myDouble = 14.2;
        char c = 'b';
        boolean b = true;

        System.out.println("Задача 2");
        double boxerWeight = 72.2;
        double boxer2Weight = 82.7;
        double BoxersWeight = boxerWeight+boxer2Weight;
        double differenceBoxers = boxer2Weight - boxerWeight;
        System.out.println("Общий вес боксеров равен " + BoxersWeight + " кг.");
        System.out.println("Разница в весе боксеров составляет " + differenceBoxers + " кг. ");

        System.out.println("Задача 3");
        int banana = 5;
        int weightOneBanana = 80;
        int iceCream = 2;
        int weightOneIceCream = 100;
        int egg = 4;
        int weightOneEgg = 70;
        int milk = 2;
        int weightMilk = 105;
        float breakfast = banana * weightOneBanana + iceCream * weightOneIceCream + egg * weightOneEgg + milk * weightMilk;
        System.out.println("Вес спорт-завтрака равен " + breakfast + " грамм");
        int grInKg = 1000;
        float weightKg = breakfast / grInKg;
        System.out.println("Вес спорт-завтрака равен " + weightKg + " килограмм.");

        System.out.println("Задача 4");
        int kgInGr = 1000;
        int weightSportsmanKg = 7;
        float weightSportsmanGr = weightSportsmanKg * 1000;
        float amountDays1 = weightSportsmanGr / 250;
        System.out.println("При потере веса в 250 грамм, спортсмену понадобится " + amountDays1 + " дней.");
        float amountDays2 = weightSportsmanGr / 500;
        System.out.println("При потере веса в 500 грамм, спортсмену понадобится " + amountDays2 + " дней.");
        float averageAmount = (amountDays1 + amountDays2) / 2;
        System.out.println("Среднее количество дней, которое потребуется спортсмену равно " + averageAmount + ".");

        System.out.println("Задача 5");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double newSalaryMasha = salaryMasha * 0.1 + salaryMasha;
        double newSalaryDenis = salaryDenis * 0.1 + salaryDenis;
        double newSalaryKristina = salaryKristina * 0.1 + salaryKristina;
        double incomeMasha = newSalaryMasha * 12 - salaryMasha * 12;
        double incomeDenis = newSalaryDenis * 12 - salaryDenis * 12;
        double incomeKristina = newSalaryKristina * 12 - salaryKristina * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + incomeMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + incomeDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + incomeKristina + " рублей.");

    }
}