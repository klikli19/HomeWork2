public class Main {
    public static void main(String[] args) {
        //Задание 1
        int myInt = 1;
        short myShort = 2;
        byte myByte = 120;
        long myLong = 11232L;
        float myFloat = 111.2f;
        double myDouble = 14.2;
        char c = 'b';
        boolean b = true;

        //Задание 2
        double boxerWeight = 72.2;
        double boxer2Weight = 82.7;
        double BoxersWeight = boxerWeight+boxer2Weight;
        double differenceBoxers = boxer2Weight - boxerWeight;
        System.out.println("Общий вес боксеров равен " + BoxersWeight + " кг.");
        System.out.println("Разница в весе боксеров составляет " + differenceBoxers + " кг.");

    }
}