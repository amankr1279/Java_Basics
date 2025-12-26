public abstract class Caffeine {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("Boil water");
    }
    abstract void brew();
    void pourInCup() {
        System.out.println("Pour water in cup");
    }
    abstract void addCondiments();
}
