public class HasCoinState implements State{
    GumballMachine gumballMachine;

    public HasCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertCoin() {
        System.out.println("Not allowed, already got the coin");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Okay! Take back your coin");
        this.gumballMachine.setState(new NoCoinState(this.gumballMachine));
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning up the crank. Get ready for a gum");
        this.gumballMachine.setState(new SoldState(this.gumballMachine));
    }

    @Override
    public void dispense() {
        System.out.println("Can't do! Turn the crank and wait then.");
    }
}
