package org.dimigo.oop;

public class CalculatorTest2 {
    public static void main(String[] args) {
        int a= 10;
        int b =20;
        Calculator2 c = new Calculator2();
        Calculator2 c2 = new Calculator2();
        Calculator2 c3 = new Calculator2();
        c.PI =3.14;
        System.out.println(c.PI);
        System.out.println(c2.PI);
        System.out.println(c3.PI);


        //c.powerOn();
        System.out.printf("%d + %d = %d\n",a,b,Calculator2.add(a,b,c));
        System.out.printf("%d - %d = %d\n",a,b,Calculator2.sub(a,b));
        System.out.printf("%d * %d = %d\n",a,b,Calculator2.mul(a,b));
        System.out.printf("%d / %d = %.1f\n",a,b,Calculator2.div(a,b));
    }


}