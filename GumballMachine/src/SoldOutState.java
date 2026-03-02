public class SoldOutState implements State{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertCoin() {
        System.out.println("The machine is empty brother. Not accepting any coin");
    }

    @Override
    public void ejectCoin() {
        System.out.println("The machine is empty brother. Can't eject when you haven't given any");
    }

    @Override
    public void turnCrank() {
        System.out.println("The machine is empty brother. No gums to crank up too");
    }

    @Override
    public void dispense() {
        System.out.println("The machine is empty brother. No gums to dispense");
    }
}
