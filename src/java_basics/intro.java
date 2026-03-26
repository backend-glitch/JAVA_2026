package java_basics;

//day 1

public class intro {

    public static void main(String[] args) {
        System.out.println("Hello World !!");

        //data types
     int age = 20;
     byte age1  = 30;
     short age2 = 40;
     long age3 = 50;

        System.out.println("Min byte :" + Byte.MIN_VALUE);
        System.out.println("Max byte : " + Byte.MAX_VALUE);
        System.out.println(" min short : " + Short.MIN_VALUE);
        System.out.println("max short : " +Short.MAX_VALUE);
        System.out.println(" min int : " + Integer.MIN_VALUE);
        System.out.println("max int : " +Integer.MAX_VALUE);
        System.out.println(" min long : " + Long.MIN_VALUE);
        System.out.println("max long : " +Long.MAX_VALUE);


        float salary  = 200000.00f;
        double annum = 10000.0001;

        System.out.println(" float salary : " + salary);
        System.out.println("double salary : " + annum);

        String name = "Github";
        char ch = 'a';
        char[] word = {'a','e','i'};

        System.out.println("Name : " + name );

        // type casting
        System.out.println("type casted value of a : " + (int) ch);

        System.out.println("Min charachther : " + (int) Character.MIN_VALUE);
        System.out.println("Max characther : " + (int) Character.MAX_VALUE);

        System.out.println("Heart : " + (char) 10084);

        //boolean
        boolean flag = true;

        //widening or implicit conversion
        float value = 12.90f;
        double value2 = value;

        // narrowing conversion or explicit conversion
        int value3  = (int) value;

        System.out.println("binary of 1234 : " + Integer.toBinaryString(1234));

    }

}
