package org.dimigo.maybe;

public class Print {
    public static void main(String[] args) {
        int i, cnt = 0;
        int num = 30;
        for (i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                cnt++;
            }

        }
        if (cnt == 0) {
            System.out.println("소수 입니다");
        }
        else {
            System.out.println("소수가 아닙니다");
        }
    }
}
