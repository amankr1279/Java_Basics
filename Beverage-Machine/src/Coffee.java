public class Coffee extends Caffeine{

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Add cream");
    }
}
