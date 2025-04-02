package design.patterns.behavioral.observel;

public class CoffeeClient {
    public static void main(String[] args) {
        SmartCoffeeMachine machine = new SmartCoffeeMachine();

        // 注册观察者
        machine.addObserver(new PhoneApp());
        machine.addObserver(new VoiceAssistant());

        // 模拟咖啡机行为
        machine.brewCoffee();    // 触发通知
        System.out.println("----------------------------------");
        machine.outOfBeans();    // 再次触发通知
    }
}
