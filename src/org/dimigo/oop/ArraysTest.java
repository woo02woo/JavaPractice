package org.dimigo.oop;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        String[] src ={"서울","대전","수원","안산"};

        //배열 출력
        System.out.println(Arrays.toString(src));

        //배열 복사(src -> dest)
        String[] dest = Arrays.copyOf(src,src.length);//뭘 복사할껀지,얼마나 복사할껀지
        System.out.println(Arrays.toString(dest));

        //배열 비교
        System.out.println(Arrays.equals(src,dest));

        //배열 정렬

        Arrays.sort(dest);
        System.out.println(Arrays.toString(dest));

        //배열 검색(정렬 먼저 하기)
        System.out.println(Arrays.binarySearch(dest,"수원"));
    }
}
