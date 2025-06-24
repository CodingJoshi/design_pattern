package design.pattern.behavioural.abstract_factory_pattern;

import design.pattern.behavioural.abstract_factory_pattern.factories.MacOsFactory;
import design.pattern.behavioural.abstract_factory_pattern.factories.UIFactory;
import design.pattern.behavioural.abstract_factory_pattern.factories.WindowsFactory;
import design.pattern.behavioural.abstract_factory_pattern.products.Button;
import design.pattern.behavioural.abstract_factory_pattern.products.ScrollBar;

public class Client {
    UIFactory uiFactory;

    public Client(UIFactory uiFactory) {
        this.uiFactory = uiFactory;
    }

    public void renderUi() {
        Button button = uiFactory.createButton();
        ScrollBar scrollBar = uiFactory.createScrollbar();
        button.render();
        scrollBar.scroll();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        System.out.println(arr[0]);
        Client macClient = new Client(new MacOsFactory());
        macClient.renderUi();
        Client windowsClient = new Client(new WindowsFactory());
        windowsClient.renderUi();
    }
}
