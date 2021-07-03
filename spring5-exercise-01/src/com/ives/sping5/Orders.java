package com.ives.sping5;

public class Orders {
    // 屬性
    private String oname;
    private String address;

    // 有參數構造
    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void ordersTest(){
        System.out.println(oname+"==="+address);
    }
}
