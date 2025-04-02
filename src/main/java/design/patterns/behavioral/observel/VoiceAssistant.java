package design.patterns.behavioral.observel;

public class VoiceAssistant implements CoffeeObserver {
    @Override
    public void update(String message) {
        System.out.println("【语音播报】叮咚！" + message);
    }
}