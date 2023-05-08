import com.sun.jdi.FloatValue;

import java.util.InputMismatchException;
import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args)
    {
        //System.out.println(Method1());
    //    Method2();
        //Method3();
        System.out.println(Method4());
    }
    /* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    вместо этого, необходимо повторно запросить у пользователя ввод данных. */
    public static float Method1() throws InputMismatchException
    {
        Scanner scanner = new Scanner(System.in);
        String num = "";
        System.out.print("Введите дробное число типа float: ");
        num = scanner.nextLine();
        // используем регулярные выражения для проверки является ли введенное число типом float или нет
        while (!num.matches("[-+]?[0-9]*\\.?[0-9]+"))
        {
            System.out.print("Введите дробное число типа float: ");
            num = scanner.nextLine();
        }
        return Float.valueOf(num);
    }
    public static void Method2()
    {
        int[] intArray = {1, 3, 4, 5, 5, 5, 5, 5, 9};
        try {
            double d = 2;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e);
        }
    }
    public static void Method3()
    {
//    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2, 0, 0};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");

        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
        public static void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b);
    }
//    }
    /* Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.  */

    public static String Method4()
    {
        Scanner scanner = new Scanner(System.in);
        String num = "";
        System.out.print("Введите какую-либо строку: ");
        num = scanner.nextLine();
        if (num.equals(""))
        {
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
        return num;
    }
}
