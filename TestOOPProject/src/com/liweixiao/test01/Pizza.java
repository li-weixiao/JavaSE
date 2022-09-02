package com.liweixiao.test01;

/**
 * @author:liweixiao
 * @date:2022/9/2
 * @version:v1.0
 * @description:披萨类
 */
public class Pizza {
    //属性
    private String name;//名称
    private int size;//大小
    private double price;//价格

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //构造器
    public Pizza() {
    }

    public Pizza(String name, int size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    //方法
    public String showPizza(){
        return "名称："+name+"\n价格："+price+"元\n大小："+size+"寸";
    }
}
