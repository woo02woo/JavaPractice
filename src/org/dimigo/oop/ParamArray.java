package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        add(intArr,10); //배열에 모두 10을 더하는 메소드
        printArray(intArr);


        String[] names = {"홍길동","홍길서","홍길남","홍길북"};
        changeName(names);
        printArray(names);
    }

    private static void changeName(String[] names) {
        for(int k=0;k<names.length;k++){
            names[k] = names[k].substring(1);
            names[k] = "김"+names[k];
        }
    }


    private static void add(int[] intArr, int i) {
        for(int j=0;j<intArr.length;j++){
            intArr[j] +=10;
        }
    }
    private static void printArray(int[] intArr) {
        for(int arr : intArr){
            System.out.println(arr);
        }
    }
    private static void printArray(String[] names) {
        for(String arr2 : names){
            System.out.println(arr2);
        }
    }


}
