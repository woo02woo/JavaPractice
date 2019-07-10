package org.dimigo.oop;

public class StringTest {
    public static void main(String[] args) {
        //문자열 리터럴방식 (literal pool)
        String dog1 = "댕댕이";
        String dog2 = "댕댕이";
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));

        //new 객체 생성방식
        String cat1 = new String("냥냥이");
        String cat2 = new String("냥냥이");
        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));

        //문제
        System.out.println(dog1 == "댕댕이");
        System.out.println(cat1 == "냥냥이");

        String id =null;
        //id가 admin이면 관리자를 출력, admin이 아니면 관리자 아님 출력
        if("admin".equals(id)){
            System.out.println("관리자");
        }
        else
            System.out.println("관리자 아님");


        testString();
    }

    private static void testString() {
        //          01234567890123
        String s = "abcdefgABCDEFG";

        System.out.println(s.length());//14 길이 출력 ★
        System.out.println(s.substring(3));//defgABCDEFG ★
        System.out.println(s.substring(3,6));//def  엔드인덱스-1 개수만큼 출력 ★
        System.out.println(s.indexOf("C"));//9 인덱스 값 출력 C->9
        System.out.println(s.charAt(9));//9->C
        System.out.println(s.concat("ABC"));//문자 붙이기
        System.out.println("      ABC       ".trim()); // [ABC] 출력(스페이스바 없이) ★
        System.out.println(s.toUpperCase()); //전부 대문자로 바꾸기
        System.out.println(s.toLowerCase());//전부 소문자로 바꾸기
        System.out.println(s.replace('a','A'));//AbcdefgABCDEFG 앞에 a를 A로 변환
        System.out.println(s.startsWith("abc")); //"abc"로 시작하는 지 확인
        System.out.println(s.endsWith("FG"));//"FG"로 끝나는지 확인
    }
}
