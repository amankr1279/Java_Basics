public abstract class CaffeineWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (wantsCondiments()) {
            addCondiments();
        }
    }

    void boilWater() {
        System.out.println("Boil water");
    }
    abstract void brew();
    void pourInCup() {
        System.out.println("Pour water in cup");
    }
    abstract void addCondiments();

    /**
     * Hook method => Can be overridden but not necessary.
     * Helps in controlling the flow of the algorithm in
     * template design pattern
     * @return boolean
     */
    boolean wantsCondiments() {
        return true;
    }
}
