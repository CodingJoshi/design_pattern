package design.pattern.creational.abstract_factory_pattern;

// Windows UI
class WindowsBtn {
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}

class WindowsScrollBar {
    public void scroll() {
        System.out.println("Rendering Windows Scrollbar");
    }
}
// MacOS UI

class MacOSBtn {
    public void render() {
        System.out.println("Rendering MacOS Button");
    }
}

class MacOSScrollBar {
    public void scroll() {
        System.out.println("Rendering MacOS Scrollbar");
    }
}

public class ProblemStatement {
    public static void main(String[] args) {
        //Windows UI
        WindowsBtn btn = new WindowsBtn();
        WindowsScrollBar scrollBar = new WindowsScrollBar();
        btn.render();
        scrollBar.scroll();

        /*
        Problem with this approach
        1. client might create a windowsBtn with macOS scroll bar,
            which should not be allowed,
            as related component must come in one theme (Logically inconsistent)
        2. Tight Coupling (switching not easy, have to modify client)
        3. Hard to extend (to add android)
         */
    }
}
