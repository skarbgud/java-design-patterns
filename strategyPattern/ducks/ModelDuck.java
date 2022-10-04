package strategyPattern.ducks;

import strategyPattern.fly.FlyWithNoWay;
import strategyPattern.quack.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyWithNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
