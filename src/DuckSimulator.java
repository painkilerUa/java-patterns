import com.compound.*;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        Quackable mallardDuck = new QuackCounter(new MalardDuck());
        Quackable redHeadDuck = new QuackCounter(new ReadHeadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable goose = new QuackCounter(new GooseAdapter(new Goose()));

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
