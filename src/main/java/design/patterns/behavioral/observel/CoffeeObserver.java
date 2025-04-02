package design.patterns.behavioral.observel;

/**
 * 1. 观察者接口（所有通知渠道需实现）
 */
public interface CoffeeObserver {
    void update(String message);
}
