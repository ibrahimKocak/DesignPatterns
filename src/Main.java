import BehavioralDesignPatterns.Observer.Alarm.zzTestObserverAlarm;
import BehavioralDesignPatterns.Observer.Digits.zzTestObserverDigits;
import BehavioralDesignPatterns.State.Account.zzTestStateAccount;
import BehavioralDesignPatterns.State.Human.zzTestStateHuman;
import BehavioralDesignPatterns.State.MobileAlert.zzTestStateMobileAlert;
import BehavioralDesignPatterns.Strategy.Fighter.zzTestStrategyFighter;
import BehavioralDesignPatterns.Strategy.Ordek.zzTestStrategyOrdek;
import CreationalDesignPatterns.AbstractFactory.ColorShapeFactory.zzTestAbstractFactoryColorShape;
import CreationalDesignPatterns.Builder.MealBuilder.zzTestBuilderMeal;
import CreationalDesignPatterns.FactoryMethod.DatabaseFactory.zzTestFactoryDatabase;
import CreationalDesignPatterns.FactoryMethod.ShapeFactory.zzTestFactoryShape;
import CreationalDesignPatterns.Prototype.ColorPrototype.zzTestPrototypeColor;
import CreationalDesignPatterns.Singleton.LazyInstantiation.zzTestSingletonLazy;
import TestDesignPatern.Test;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        start(new zzTestSingletonLazy());
        start(new zzTestFactoryDatabase());
        start(new zzTestFactoryShape());
        start(new zzTestAbstractFactoryColorShape());
        start(new zzTestPrototypeColor());
        start(new zzTestBuilderMeal());
        start(new zzTestStateAccount());
        start(new zzTestStateMobileAlert());
        start(new zzTestStateHuman());
        start(new zzTestObserverDigits());
        start(new zzTestObserverAlarm());
        start(new zzTestStrategyOrdek());
        start(new zzTestStrategyFighter());
    }

    private static void start(Test test) {
        test.start();
    }
}
