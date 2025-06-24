package design.pattern.behavioural.abstract_factory_pattern.factories;

import design.pattern.behavioural.abstract_factory_pattern.products.Button;
import design.pattern.behavioural.abstract_factory_pattern.products.ScrollBar;

public interface UIFactory {
    Button createButton();

    ScrollBar createScrollbar();
}
