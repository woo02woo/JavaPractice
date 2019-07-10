package org.dimigo.oop;

public class WrapperTest {
    public static void main(String[] args) {
        //wrapper 클래스 : primitive type을 객체화시켜주는 클래스
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toOctalString(10));
        System.out.println(Integer.toHexString(10));

        //Boxing
        //1. 생성자 이용
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println(i1.equals(i2));

        //2.valueOf 메소드 이용
        Integer i3 = Integer.valueOf(100);
        Double d1 = Double.valueOf(3.14);

        //unboxing
        int r1 = i3.intValue();
        double r2 =d1.doubleValue();
        // 문자열->primitive data type - parseXXX()
        int p1 = Integer.parseInt("200");
        double p2 = Double.parseDouble("3.14");


        System.out.println(args[0]); // "100"
        System.out.println(args[1]); // "200"
        int p3 = Integer.parseInt(args[0]);
        int p4 = Integer.parseInt(args[1]);
        System.out.println(p3+p4);


        Integer a = new Integer(1000);
        Integer b = new Integer(2000);
        System.out.println(a+b);

        Integer c = 1000;
        int d = c +2000;


        // 총 몇번의 autoboxing 과 autounboxing이 일어났을까??
        Integer obj1 = 10; //autoboxing 1번
        Integer obj2 = obj1 +20; // autoboxing 1 autounboxing 1
        Integer result = obj1 +obj2; // autounboxing 2 autoboxing 1





    }
}
