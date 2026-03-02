public class Main {
    public static void main(String[] args) {
        System.out.println("Gumball machine: State Design Pattern Implementation");
        /**
         * The state of the gumball machine changes as follows
         * NoCoin -- HasCoin -- Sold -- SoldOut
         * At every state we have 4 options: insertCoin, ejectCoin, turnCrank and dispense
         *
         * The gumball machine moves across these states depending on the number of gums
         * it has and if a coin has been provided or not.
         * Out of order operations are also handled so that the state flow is always maintained.
         */
        GumballMachine gumballMachine = new GumballMachine(2);

        System.out.println("Gumball count: " + gumballMachine.count);
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();
        gumballMachine.dispense();

        System.out.println("Gumball count: " + gumballMachine.count);
        gumballMachine.insertCoin();
        gumballMachine.ejectCoin();
        gumballMachine.turnCrank();
        gumballMachine.dispense();

        System.out.println("Gumball count: " + gumballMachine.count);
        gumballMachine.insertCoin();
        gumballMachine.dispense();
    }
}