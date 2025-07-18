package design.pattern.creational.abstract_factory_pattern.factories;

import design.pattern.creational.abstract_factory_pattern.products.Button;
import design.pattern.creational.abstract_factory_pattern.products.ScrollBar;
import design.pattern.creational.abstract_factory_pattern.products.WindowsBtn;
import design.pattern.creational.abstract_factory_pattern.products.WindowsScrollbar;

public class WindowsFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new WindowsBtn();
    }

    @Override
    public ScrollBar createScrollbar() {
        return new WindowsScrollbar();
    }
}
