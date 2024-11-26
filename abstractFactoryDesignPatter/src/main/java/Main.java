import UI.*;
import Furniture.chair.Chair;
import Furniture.table.Table;

public class Main {
    public static void main(String[] args){
        CreationUtil creationUtil = new CreationUtil(readConfig());
        CheckBox checkBox = creationUtil.getCheckbox();
        System.out.println(checkBox.check());
        Button button = creationUtil.getButton();
        System.out.println(button.click());

    }

    public static Factory readConfig(){
//        return new MackBookFactory();
        return new WindowsFactory();
    }
}
