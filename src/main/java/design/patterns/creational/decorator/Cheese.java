package design.patterns.creational.decorator;

/**
 * 具体装饰器
 */
public class Cheese extends ToppingDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public String make() {
        return pizza.make() + " + 芝士";
    }
}