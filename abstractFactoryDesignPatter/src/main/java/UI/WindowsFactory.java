package UI;

public class WindowsFactory implements Factory{
    @Override
    public Button createButton() {
            return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
            return new WindCheckBox();
    }
}
