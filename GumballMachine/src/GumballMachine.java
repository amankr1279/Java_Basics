public class GumballMachine {
    State state;
    int count = 0;

    public GumballMachine(int gumballs){
        this.count = gumballs;
        this.state = new NoCoinState(this);
    }

    public void setState(State newState) {
        this.state = newState;
    }

    public void insertCoin() {
        if (this.count > 0) {
            this.setState(new NoCoinState(this));
        } else {
            this.setState(new SoldOutState(this));
        }
        this.state.insertCoin();
    }

    public void ejectCoin() {
        this.state.ejectCoin();
    }

    public void turnCrank() {
        this.state.turnCrank();
    }

    public void dispense() {
        System.out.println("Current state is" + this.state.toString());
        this.state.dispense();
    }
}
