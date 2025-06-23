package design.pattern.abstract_factory_pattern.factories;

import design_patterns.abstract_factory_pattern.products.Button;
import design_patterns.abstract_factory_pattern.products.MacOsBtn;
import design_patterns.abstract_factory_pattern.products.MacOsScrollbar;
import design_patterns.abstract_factory_pattern.products.ScrollBar;

public class MacOsFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacOsBtn();
    }

    @Override
    public ScrollBar createScrollbar() {
        return new MacOsScrollbar();
    }
}
