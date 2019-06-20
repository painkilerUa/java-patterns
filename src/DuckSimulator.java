import com.compound.*;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        CountingDuckFactory countingDuckFactory = new CountingDuckFactory();
        GooseFactory gooseFactory = new GooseFactory();
        simulator.simulate(countingDuckFactory, gooseFactory);
    }

    void simulate(AbstractDuckFactory duckFactory, GooseFactory gooseFactory) {
        Quacklogist quacklogist = new Quacklogist();
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable mallardDuckSecond = duckFactory.createMallardDuck();
        Quackable mallardDuckThird = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = gooseFactory.createGoose();

        System.out.println("\nDuck simulator");

        Flock duckFlock = new Flock();
        duckFlock.registerObserver(quacklogist);
        duckFlock.add(redHeadDuck);
        duckFlock.add(duckCall);
        duckFlock.add(rubberDuck);

        Flock mallardDuckFlock = new Flock();
        mallardDuckFlock.add(mallardDuck);
        mallardDuckFlock.add(mallardDuckSecond);
        mallardDuckFlock.add(mallardDuckThird);

        duckFlock.add(mallardDuckFlock);

        simulate(duckFlock);

        int count = QuackCounter.getNumberOfQuacks();
        System.out.println("\nNumber of quack is " + count);
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
