import java.util.ArrayList;
import java.util.List;

public class CompositeComponent implements SmartComponent{
    List<SmartComponent> components;

    public CompositeComponent() {
        this.components = new ArrayList<SmartComponent>();
    }

    public void addComponent(SmartComponent component){
        this.components.add(component);
    }

    @Override
    public void turnOff() {
        for (SmartComponent component: this.components) {
            component.turnOff();
        }
    }

    @Override
    public void turnOn() {
        for (SmartComponent component: this.components) {
            component.turnOn();
        }
    }
}
