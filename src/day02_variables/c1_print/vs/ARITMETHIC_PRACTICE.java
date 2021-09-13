package day02_variables.c1_print.vs;

public class ARITMETHIC_PRACTICE {

    public static void main(String[] args) {


        byte a1=127;
        short a2=32322;
        int a3=2123123123;
        long a4= 12351231241235L;
        float a5=1234.5f;
        double a6=1231255123.5;

        System.out.println(a1 );
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);


        System.out.println(10.0/3); // would be decent
        System.out.println(10%5); // would be 0 percentage
        System.out.println(10+2); //would be 12
        System.out.println(10.0-5); //would be decent result


        boolean aritmetich= a1>a2;
        System.out.println(aritmetich);
        boolean b2 = a3 != a4;
        System.out.println(b2);
        boolean b3= (a3+a4>a5-a2);
        System.out.println(b3);

        boolean and = a3<a4 && a5>a6;
        System.out.println(and);
        boolean and2= a1!=a2 && a4>a5;
        System.out.println(and2);

        boolean and3 = a3<a4 || a5>a6;
        System.out.println(and3);
        boolean and4= a1!=a2 || a4>a5;
        System.out.println(and4);
        System.out.println(a2>a3 && a4<a5);
        System.out.println(a2>a3 || a4<a5);
        System.out.println(!(a2>a3 && a4<a5));



        if (b3) {
            System.out.println("hello"); }

















    }





















}
