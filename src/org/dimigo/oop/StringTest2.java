package org.dimigo.oop;

public class StringTest2 {
    public static void main(String[] args) {
        //String으로 문자열 생성
        String str = "디미고 "; //문자열 4개 생성
        str += "2학년 ";
        str += "4반 ";
        str += "허정우";


        //StringBuilder , StringBuffer
        StringBuilder sb = new StringBuilder("디미고 "); //문자열 1개만 생성
        sb.append("2학년 ").append("4반 ").append("허정우"); //메소드 체이닝

        System.out.println(sb.toString());

        compareSpeed();


    }

    private static void compareSpeed() {
        long start = System.currentTimeMillis();


        String str = "abc";
        StringBuffer sb = new StringBuffer(str);
        StringBuilder sb2 = new StringBuilder(str);

        for (int i = 0; i < 1000000; i++) {
            //str += "def";
            sb.append("def");
            //sb2.append("def");

        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
}
