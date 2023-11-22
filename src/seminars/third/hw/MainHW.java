package seminars.third.hw;

public class MainHW {
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).


    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%
    public static void main(String[] args) {
        System.out.println(evenOddNumber(2));
        System.out.println(evenOddNumber(3));
        System.out.println(evenOddNumber(6));
        System.out.println(evenOddNumber(26));
        System.out.println(evenOddNumber(3434));

    }

    public static boolean evenOddNumber(int number) {
        numberInInterval(number);
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean numberInInterval(int number){
        if (number <= 100 && number >= 25){
            System.out.println("Число в интервале");
            return true;
        } else {
            System.out.println("Число НЕ в интервале");

            return false;
        }
    }

}
