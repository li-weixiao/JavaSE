package com.liweixiao.test01;

/**
 * @author:liweixiao
 * @date:2022/9/2
 * @description:培根披萨类
 */
public class PizzaBacon extends Pizza{
    //属性
    private int weight;//克数

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //构造器
    public PizzaBacon() {
    }

    public PizzaBacon(String name, int size, double price, int weight) {
        super(name, size, price);
        this.weight = weight;
    }

    //方法
    @Override
    public String showPizza() {
        return super.showPizza()+"\n培根克数："+weight+"g";
    }
}
