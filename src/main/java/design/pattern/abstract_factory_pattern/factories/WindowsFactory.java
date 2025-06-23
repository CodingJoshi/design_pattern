package design.pattern.abstract_factory_pattern.factories;

import design_patterns.abstract_factory_pattern.products.Button;
import design_patterns.abstract_factory_pattern.products.ScrollBar;
import design_patterns.abstract_factory_pattern.products.WindowsBtn;
import design_patterns.abstract_factory_pattern.products.WindowsScrollbar;

public class WindowsFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new WindowsBtn();
    }

    @Override
    public ScrollBar createScrollbar() {
        return new WindowsScrollbar();
    }
}
