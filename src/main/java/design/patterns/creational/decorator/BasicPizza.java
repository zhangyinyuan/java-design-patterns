package design.patterns.creational.decorator;

/**
 * BasicPizza 不应该继承 ToppingDecorator
 * 1. 职责分离原则
 * BasicPizza 是被装饰的原始对象（核心组件），它只需要实现最基础的功能。
 * <p>
 * ToppingDecorator 是装饰器的抽象基类，它的职责是动态增强其他对象（包括 BasicPizza 或其他装饰器）。
 * <p>
 * 如果让 BasicPizza 继承 ToppingDecorator，会导致基础组件具有装饰能力，违反单一职责原则。
 * <p>
 * 2. 装饰器模式的核心结构
 * 装饰器模式的关键是：通过组合（而非继承）动态扩展功能。
 */
public class BasicPizza implements Pizza {

    @Override
    public String make() {
        return "基础披萨";
    }

}
