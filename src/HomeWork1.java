import java.sql.SQLOutput;

public class HomeWork1 {
    public static void main(String[] args)
    {
        //System.out.println(Method1(100, 0));
        int[] m = { 10, 30, 40, 50, 50 };
        //System.out.println(Method2(m));
        //Method3(null);
        int[] n = { 2, 6, 8, 8, 9 };
        //int[] mn = Method4(m, n);
        int[] mn = Method5(m, n);
        System.out.println(mn[0] + " " + mn[1]  + " " + mn[2]  + " " + mn[3] + " " + mn[4]);
    }
    /* Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить? */
    public static int Method1(int a, int b)
    {
        return a / b;
    }
    public static int Method2(int[] a)
    {
        return a[100];
    }
    public static void Method3(Object obj)
    {
        System.out.println(obj.toString());
    }
    /* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих
    массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. */
    public static int[] Method4(int[] a, int[] b)
    {
        if (a.length != b.length) {
            //System.out.println("Зашли в исключение.");
            throw new RuntimeException("Массивы разной длинны.");
        }
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
        }
        return c;
    }
    /* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
    каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов
    не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
    которое пользователь может увидеть - RuntimeException, т.е. ваше.*/
    public static int[] Method5(int[] a, int[] b)
    {
        if (a.length != b.length) {
            //System.out.println("Зашли в исключение.");
            throw new RuntimeException("Массивы разной длинны.");
        }
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0)
                throw new RuntimeException("На ноль делить нельзя.");
            c[i] = a[i] / b[i];
        }
        return c;
    }
}
