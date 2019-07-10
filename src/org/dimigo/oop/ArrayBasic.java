package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        // 기본형 타입 배열
        //int,float,double,char,boolean,byte,long,short
        //int 타입 배열

        int[] intArr = null;
        intArr = new int[5];
        int[] intArr2 = {1,2,3,4,5};
       // int[] intArr2 = new int[] {1,2,3,4,5}
        printarray(intArr2);
        //double 타입 배열 5개짜리
        double[] doubleArr = new double[5];


        printarray(intArr);
        printarray(doubleArr);

        //참조형 타입 배열
        String[] strArr = new String[3];

        strArr[0] = "프로미스나인";
        strArr[1] = "레드벨벳";
        strArr[2] = "블랙핑크";
        printarray(strArr);

        String[] strArr2 ={"ITZY","프로미스나인"};



        //Book 타입 배열 2개 짜리
        //Book 객체 생성
        Book[] bookArr = new Book[2];
        bookArr[0] = new Book("미생","허정우");
        bookArr[1] = new Book("wordmaster", "전유원 선생님");
        printarray(bookArr);

        Book[] bookArr2 ={new Book("미생2","허정우"),
                new Book("wordmaster2", "전유원 선생님")};
        printarray(bookArr2);

        //배열 사용시 주의사항!!!
        //int[] intArr3 =null; XXX
        int[] intArr3 =new int[3];
        System.out.println(intArr3.length);
        //System.out.println(intArr3[3]); 배열 범위를 벗어남
        System.out.println(intArr3.length-1);

        String[] strArr3 =new String[3];
        System.out.println(strArr3[0]); //null
       // System.out.println(strArr3[0].length()); 오류 null 값의 길이를 구할 수 없음

        Book[] bookArr3 = new Book[3];
        System.out.println(bookArr3[0]);//null

    }


    private static void printarray(int[] intArr) {
        for(int value : intArr){
            System.out.print(value + "|");
        }
        System.out.println();
    }
    private static void printarray(double[] doubleArr) {
        for(double value : doubleArr){
            System.out.print(value + "|");

        }
    }
    private static void printarray(String[] strArr) {
        for(String value : strArr){
            System.out.print(value + "|");

        }
    }
    private static void printarray(Book[] bookArr) {
        for(Book value : bookArr){
            System.out.println(value);
//toString이 있다면 출력
        }
    }

}
