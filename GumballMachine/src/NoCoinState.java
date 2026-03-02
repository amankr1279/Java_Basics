public class NoCoinState implements State{
    GumballMachine gumballMachine;

    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Inserting coin in Gumball machine");
        this.gumballMachine.setState(new HasCoinState(this.gumballMachine));
    }

    @Override
    public void ejectCoin() {
        System.out.println("You can't eject coin as you have not given any");
    }

    @Override
    public void turnCrank() {
        System.out.println("Only after you give some coin");
    }

    @Override
    public void dispense() {
        System.out.println("Only after you give some coin");
    }
}
