package design.pattern.creational.abstract_factory_pattern.factories;

import design.pattern.creational.abstract_factory_pattern.products.Button;
import design.pattern.creational.abstract_factory_pattern.products.MacOsBtn;
import design.pattern.creational.abstract_factory_pattern.products.MacOsScrollbar;
import design.pattern.creational.abstract_factory_pattern.products.ScrollBar;

public class MacOsFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacOsBtn();
    }

    @Override
    public ScrollBar createScrollbar() {
        return new MacOsScrollbar();
    }
}
