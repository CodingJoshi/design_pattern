package design.pattern.creational.abstract_factory_pattern.products;

public class MacOsScrollbar implements ScrollBar {
    @Override
    public void scroll() {
        System.out.println("MacOs scrollbar");
    }
}
