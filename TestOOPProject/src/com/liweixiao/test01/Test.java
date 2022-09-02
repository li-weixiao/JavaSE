package com.liweixiao.test01;

import java.util.Scanner;

/**
 * @author:liweixiao
 * @date:2022/9/2
 * @version:v1.0
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入想要制作的披萨：1.培根披萨 2.水果披萨：");
        int choice=sc.nextInt();
        Pizza p = PizzaStore.getPizza(choice);
        System.out.println(p.showPizza());
    }
}
