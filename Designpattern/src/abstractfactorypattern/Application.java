package abstractfactorypattern;

public class Application {
    private Button button;
    private TextField textField;

    public Application(UIThemeFactory factory) {
        button = factory.createButton();
        textField = factory.createTextField();
    }

    public void render() {
        button.render();
        textField.render();
    }

    public static void main(String[] args) {
        UIThemeFactory lightThemeFactory = new LightThemeFactory();
        Application lightApp = new Application(lightThemeFactory);
        lightApp.render();

        UIThemeFactory darkThemeFactory = new DarkThemeFactory();
        Application darkApp = new Application(darkThemeFactory);
        darkApp.render();
    }
}
