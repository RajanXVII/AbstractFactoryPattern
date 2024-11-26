package UI;

public class MackBookFactory implements Factory{
    @Override
    public Button createButton() {
            return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
            return new MacCheckBox();
    }
}
