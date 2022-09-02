package com.liweixiao.test01;

import java.util.Scanner;

/**
 * @author:liweixiao
 * @date:2022/9/2
 * @version:v1.0
 * @description:披萨简单工厂
 */
public class PizzaStore {
    public static Pizza getPizza(int choice){
        Pizza p=null;
        Scanner sc = new Scanner(System.in);
        switch(choice){
            case 1:
                {
                    System.out.print("请输入培根的克数：");
                    int weight=sc.nextInt();
                    System.out.print("请输入披萨的大小：");
                    int size=sc.nextInt();
                    System.out.print("请输入披萨的价格：");
                    double price=sc.nextDouble();
                    PizzaBacon pb = new PizzaBacon("培根披萨", size, price, weight);
                    p=pb;
                }
                break;
            case 2:
                {
                    System.out.print("请输入你想加入的水果：");
                    String burden=sc.next();
                    System.out.print("请输入披萨的大小：");
                    int size=sc.nextInt();
                    System.out.print("请输入披萨的价格：");
                    double price=sc.nextDouble();
                    PizzaFruit pf = new PizzaFruit("水果披萨", size, price, burden);
                    p=pf;
                }
                break;
        }
        return p;
    }
}
