package homework;
/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme4_Int2_Sta2 {

    int a = 5;//4.1
    int b = 10;//4.1
    static int c = 6;//4.1
    static int d = 12;//4.1
    public void a1(){//4.2
        System.out.println(a);//4.4
        System.out.println(b);//4.4
        System.out.println(c);//4.4
        System.out.println(d);//4.4
    }
    public static void a2(){//4.3
        Programme4_Int2_Sta2 obj = new Programme4_Int2_Sta2();
        System.out.println(obj.a);//4.4
        System.out.println(obj.b);//4.4
        System.out.println(c);//4.4
        System.out.println(d);//4.4

    }

    public static void main(String[] args) {//4.5
        Programme4_Int2_Sta2 a3 = new Programme4_Int2_Sta2();//4.5
        a3.a1();//4.5
        a2();//4.5
    }
}
