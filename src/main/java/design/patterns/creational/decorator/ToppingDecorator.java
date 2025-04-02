package design.patterns.creational.decorator;

/**
 * 装饰器模式中的核心抽象装饰器类
 * <p>
 * 1. 核心职责
 * 统一装饰行为：作为所有具体装饰器（如 Cheese、Curry）的父类，定义装饰器的标准结构。
 * <p>
 * 维持组件引用：通过 protected Pizza pizza 字段持有被装饰对象（被装饰前的对象: 可能是基础组件或其他装饰器）。
 * <p>
 * 保证类型一致性：继承自 Pizza 接口，确保装饰器与被装饰对象类型兼容。
 */
public abstract class ToppingDecorator implements Pizza {

    // 被装饰的对象. 类似于ps,基于已有的图层叠加图层
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String make();
}
