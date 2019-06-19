import com.compound.*;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        CountingDuckFactory countingDuckFactory = new CountingDuckFactory();
        GooseFactory gooseFactory = new GooseFactory();
        simulator.simulate(countingDuckFactory, gooseFactory);
    }

    void simulate(AbstractDuckFactory duckFactory, GooseFactory gooseFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = gooseFactory.createGoose();

        System.out.println("\nDuck simulator");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);

        int count = QuackCounter.getNumberOfQuacks();
        System.out.println("\nNumber of quack is " + count);
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
