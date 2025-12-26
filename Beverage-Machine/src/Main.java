public class Main {
    public static void main(String[] args) {
        System.out.println("Template Design Pattern");
        System.out.println("Beverage machine for making tea and coffee");

        /**
         * We are templating the prepareRecipe() method because it is
         * common for both beverages.
         * Why is it better than just abstract Caffeine class?
         * Because we have removed code duplication yet allowed flexibility
         * for child class for specific steps of the overall algorithm
         * that all children classes have to follow(prepareRecipe here).
         */

        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("Making tea...");
        tea.prepareRecipe();
        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();

        TeaWithHook myTea = new TeaWithHook();
        CoffeeWithHook myCoffee = new CoffeeWithHook();

        System.out.println("\nMaking tea with Hook...");
        myTea.prepareRecipe();
        System.out.println("\nMaking coffee with Hook...");
        myCoffee.prepareRecipe();
    }
}