public class SoldState implements State{
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertCoin() {
        System.out.println("Already got the coin. Not required now");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Not possible now brother! The crank has been turned.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You have turned the crank already. Wait now to collect the gum.");
    }

    @Override
    public void dispense() {
        System.out.println("There you have it. Enjoy your gum!");
        this.gumballMachine.count -= 1;
        if (this.gumballMachine.count > 0) {
            this.gumballMachine.setState(new NoCoinState(this.gumballMachine));
        } else {
            this.gumballMachine.setState(new SoldOutState(this.gumballMachine));
        }
    }
}
