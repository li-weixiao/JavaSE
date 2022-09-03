package com.liweixiao.test01;

/**
 * @author:liweixiao
 * @date:2022/9/2
 * @description:水果披萨类
 */
public class PizzaFruit extends Pizza{
    //属性
    private String burden;

    public String getBurden() {
        return burden;
    }

    public void setBurden(String burden) {
        this.burden = burden;
    }

    //构造器
    public PizzaFruit() {
    }

    public PizzaFruit(String name, int size, double price, String burden) {
        super(name, size, price);
        this.burden = burden;
    }

    //方法
    @Override
    public String showPizza() {
        return super.showPizza()+"\n配料水果："+burden;
    }
}
