public class Tea extends Caffeine{

    @Override
    void brew() {
        System.out.println("Steeping water in kettle");
    }

    @Override
    void addCondiments() {
        System.out.println("Add Ginger");
    }
}
