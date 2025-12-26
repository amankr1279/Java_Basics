import java.util.Scanner;

public class TeaWithHook extends CaffeineWithHook{

    @Override
    void brew() {
        System.out.println("Steeping water in kettle");
    }

    @Override
    void addCondiments() {
        System.out.println("Add Ginger");
    }

    @Override
    public boolean wantsCondiments() {
        System.out.println("Do you want ginger (y/n)?");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();
        return response.toLowerCase().contains("y");
    }
}
