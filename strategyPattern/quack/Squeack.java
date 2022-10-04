package strategyPattern.quack;

public class Squeack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
