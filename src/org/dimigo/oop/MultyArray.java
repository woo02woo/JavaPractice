package org.dimigo.oop;

public class MultyArray {
    public static void main(String[] args) {
        //int 타입 이차원 배열
        int[][] intArr = new int[2][3];
        intArr[1][1] = 2;
        intArr[0][2] = 1;
        printArray(intArr);

        //String타입 이차원 배열
        String[][] strArr = new String[2][];
        strArr[0] = new String[3];
        strArr[1] = new String[2];
        strArr[0][0] ="c";
        strArr[0][1] ="java";
        strArr[0][2] ="PHP";
        strArr[1][0] ="C#";
        strArr[1][1] ="Python";
        printArray(strArr);

        String[][] strArr2 = {
                {"c","java","php"},
                {"c#","Python"}
        };
        String[][] strArr3 = new String[][]{
                {"c","java","php"},
                {"c#","Python"}
        };
        String[][] strArr4 = {
                new String[]{"c","java","php"},
                new String[]{"c#","Python"}
        };
        String[][] strArr5 = new String[][]{
                new String[]{"c","java","php"},
                new String[]{"c#","Python"}
        };




    }

    private static void printArray(int[][] intArr) {
        //출력
//        for(int i=0;i<intArr.length;i++){
//            for(int j=0;j<intArr[i].length;j++){
//                System.out.print(intArr[i][j]+"|");
//            }
        for(int[] arr : intArr){
            for(int value : arr){
                System.out.print(value+"|");
            }
        }


    }
    private static void printArray(String[][] strArr) {
        //출력
//        for(int i=0;i<intArr.length;i++){
//            for(int j=0;j<intArr[i].length;j++){
//                System.out.print(intArr[i][j]+"|");
//            }
        for(String[] arr : strArr){
            for(String value : arr){
                System.out.print(value+"|");
            }
        }


    }
}
