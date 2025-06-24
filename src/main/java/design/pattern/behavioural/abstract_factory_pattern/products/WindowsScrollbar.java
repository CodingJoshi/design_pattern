package design.pattern.behavioural.abstract_factory_pattern.products;

public class WindowsScrollbar implements ScrollBar {
    @Override
    public void scroll() {
        System.out.println("Windows scrollbar");
    }
}
