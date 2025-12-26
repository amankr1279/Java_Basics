import java.util.Scanner;

public class CoffeeWithHook extends CaffeineWithHook{

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public boolean wantsCondiments() {
        System.out.println("Do you want cream (y/n)?");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();
        return response.toLowerCase().contains("y");
    }

    @Override
    void addCondiments() {
        System.out.println("Add cream");
    }
}
