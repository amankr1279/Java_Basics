package quack;

public class Mute implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I can't say. I am mute");
    }
}
