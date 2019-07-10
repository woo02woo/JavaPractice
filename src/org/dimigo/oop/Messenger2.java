package org.dimigo.oop;


public class Messenger2 {


    private String profile;

    private String friend;

    private String emoticon;

    private String company;

    private String type;

    public void send(String text) {
        System.out.println(text +"라는 메세지를 보냅니다");
    }

    public void search(String text) {
        System.out.println(text +"를 검색합니다");
    }


    public void shopping() {
        System.out.println("이모티콘 쇼핑을 합니다");
    }


    public void delete() {
        System.out.println("메세지를 지웁니다");

    }


    public void receive(String text) {
        System.out.println(text+ "라는 메세지를 받았습니다");

    }

}