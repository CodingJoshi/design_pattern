package design.pattern.behavioural.abstract_factory_pattern.products;

public class MacOsBtn implements Button {
    @Override
    public void render() {
        System.out.println("Render MacOs button");
    }
}
