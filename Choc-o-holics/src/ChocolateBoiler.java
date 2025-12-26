public class ChocolateBoiler {
    private Boolean empty;
    private Boolean boiled;
    private static ChocolateBoiler uniqueInstance = new ChocolateBoiler();
    // instantiating the object here ensures that the class is thread-safe
    // This technique is called eager instantiation.

    /** Keeping a private constructor because we don't want external
     * code to initialize this class
    */
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        System.out.println("Instantiating the Chocolate Boiler :" + uniqueInstance.hashCode());
        return uniqueInstance;
    }

    /**
     * Fill the boiler
     */
    public void fill() {
        if (isEmpty()) {
            System.out.println("Filling the boiler with milk and chocolate");
            empty = false;
        } else {
            System.out.println("The boiler is already filled");
        }
    }

    /**
     * Boil the ingredients in the boiler
     */
    public void boil() {
        System.out.println("Boiling the mixture in the boiler");
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    /**
     * Drain the boiler once the mixture is boiled
     */
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println("Ths mix is ready. Let's drain it");
            empty = true;
            boiled = false;
        }
    }

    public Boolean isEmpty() {
        return empty;
    }

    public Boolean isBoiled() {
        return boiled;
    }
}
