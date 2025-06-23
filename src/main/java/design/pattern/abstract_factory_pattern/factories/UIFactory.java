package design.pattern.abstract_factory_pattern.factories;

import design_patterns.abstract_factory_pattern.products.Button;
import design_patterns.abstract_factory_pattern.products.ScrollBar;

public interface UIFactory {
    Button createButton();
    ScrollBar createScrollbar();
}
