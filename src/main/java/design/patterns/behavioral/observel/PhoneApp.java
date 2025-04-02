package design.patterns.behavioral.observel;

public class PhoneApp implements CoffeeObserver {
    @Override
    public void update(String message) {
        System.out.println("【手机APP】" + message);
    }
}