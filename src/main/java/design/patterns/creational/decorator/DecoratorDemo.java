package design.patterns.creational.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Pizza myPizza = new BasicPizza();
        // 输出: 基础披萨
        System.out.println(myPizza.make());

        //芝士披萨
        myPizza = new Cheese(myPizza);
        // 输出: 基础披萨 + 芝士
        System.out.println(myPizza.make());

        // 可以继续装饰: 芝士 x2
        myPizza = new Cheese(myPizza);
        // 输出: 基础披萨 + 芝士 + 芝士
        System.out.println(myPizza.make());

        // 添加其他装饰: 咖喱
        // 输出: 基础披萨 + 芝士 + 芝士 + 咖喱
        myPizza = new Curry(myPizza);
        System.out.println(myPizza.make());
    }
}
