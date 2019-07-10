package org.dimigo.oop;

public class BookTest {
    public static void main(String[] args) {
        Book book;
        book = new Book();// 아무 생성자도 없으면 자동으로 생성되지만 다른 것이 만들어져있을 경우 생성 안돼서 오류 남
        Book book2=new Book();
        System.out.println(book);
        System.out.println(book2);
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());

        book.setTitle("수학의 바이블");
        book.setAuthor("민경도");
        book.setPage(200);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());

        Book book3 = new Book("언어의 정원","신카이마코토",100);
        System.out.println(book3.getTitle());

        Book book4 = new Book("언어의 정원","신카이마코토");
        System.out.println(book4.getPage());//초기화를 안했으므로 0이 나옴.

        Book book5 = new Book("언어의 정원");
        System.out.println(book5.getAuthor());




    }
}
