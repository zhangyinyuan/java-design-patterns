package design.patterns.behavioral.observel;

import java.util.ArrayList;
import java.util.List;

/**
 * 2. 被观察者：咖啡机
 */
public class SmartCoffeeMachine {
    private List<CoffeeObserver> observers = new ArrayList<>();
    private String state;

    // 注册观察者
    public void addObserver(CoffeeObserver observer) {
        observers.add(observer);
    }

    // 状态变更时通知所有观察者
    private void notifyObservers() {
        for (CoffeeObserver observer : observers) {
            observer.update(state);
        }
    }

    // 模拟咖啡机状态变化
    public void brewCoffee() {
        state = "咖啡制作完成！";
        System.out.println("[咖啡机] " + state);
        notifyObservers();
    }

    public void outOfBeans() {
        state = "警告：咖啡豆不足！";
        System.out.println("[咖啡机] " + state);
        notifyObservers();
    }
}
