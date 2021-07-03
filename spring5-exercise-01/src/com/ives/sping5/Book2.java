package com.ives.sping5;


public class Book2 {
    // 創建屬性
    private String bname;
    private String bauthor;
    private String address;

    // 創建屬性對應的set方法
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testDemo(){
        System.out.println(bname+"==="+bauthor+"==="+address);
    }

}
