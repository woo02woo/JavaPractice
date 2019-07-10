package org.dimigo.oop;

public class SnackTest {
    private static int sumprice;

    public static void main(String[] args) {
        Snack[] snack = {new Snack("새우깡", "농심", 1100, 2),
                new Snack("콘칲", "크라운", 1200, 1),
                new Snack("허니버터칩", "해태", 1500, 4)};
        printSnack(snack);
        System.out.println("총 구매 금액: "+sumprice+"원" );


    }

    private static void printSnack(Snack[] snack) {
        for (Snack value : snack) {
            System.out.println(value);
            value.calcPrice();
            sumprice += value.calcPrice();
        }

    }


}

