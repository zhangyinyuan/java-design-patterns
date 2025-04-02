package design.patterns.creational.decorator;

/**
 * 咖喱装饰器
 *
 * 用于添加咖喱配料
 */
public class Curry extends ToppingDecorator {
    public Curry(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String make() {
        return pizza.make() + " + 咖喱";
    }
}
