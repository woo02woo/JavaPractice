package org.dimigo.oop;

public class IdolGroup {
    public static void main(String[] args) {
        String[] groupName = {"레드벨벳","프로미스나인","걸스데이"};
        String[][] memberName ={
                {"아이린","슬기","에리","조이","웬디"},
                {"나경","새롬","서연","지선","규리","채영","지헌","하영","지원"},
                {"유라","혜리","소진","민아"}
        };

        for(int i=0; i<groupName.length;i++){
            System.out.println("<< "+groupName[i]+" >>");
                for(String value :memberName[i]){
                    System.out.println(value);

                }
            System.out.println();
            }
        }

}
