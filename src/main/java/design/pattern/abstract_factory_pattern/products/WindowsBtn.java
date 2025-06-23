package design.pattern.abstract_factory_pattern.products;

public class WindowsBtn implements Button{
    @Override
    public void render() {
        System.out.println("Render Windows button");
    }
}
