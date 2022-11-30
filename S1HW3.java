import java.util.Scanner;

// Реализовать простой калькулятор
public class S1HW3 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        double first_number = iScanner.nextDouble();

        System.out.printf("Выберите знак '+', '-','*','/': ");
        String action_sign = iScanner.next();

        System.out.printf("Введите второе число: ");
        double second_number = iScanner.nextDouble();
        iScanner.close();

        if (action_sign.equals("+")) {
            System.out.println(first_number + second_number);
        } else if (action_sign.equals("-")) {
            System.out.println(first_number - second_number);
        } else if (action_sign.equals("/") && first_number != 0) {
            System.out.println(first_number / second_number);
        } else if (action_sign.equals("*")) {
            System.out.println(first_number * second_number);
        }

    }
}