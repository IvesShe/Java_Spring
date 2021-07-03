package com.ives.sping5;

/**
 * 使用set方法進行注入屬性
 */
public class Book {
    // 創建屬性
    private String bname;
    private String bauthor;

    // 創建屬性對應的set方法
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }
// 有參數構造注入
//    public Book(String bname) {
//        this.bname = bname;
//    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setBname("abc");
//        Book book = new Book("abc");
    }

    public void testDemo(){
        System.out.println(bname+"==="+bauthor);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", bauthor='" + bauthor + '\'' +
                '}';
    }
}
