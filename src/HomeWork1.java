import java.sql.SQLOutput;

public class HomeWork1 {
    public static void main(String[] args)
    {
        System.out.println(Method1(100, 0));
        int[] m = {1, 3, 4, 5, 5};
        System.out.println(Method2(m));
        Method3(null);
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
}
