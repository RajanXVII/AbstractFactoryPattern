package Furniture;

import Furniture.chair.Chair;
import Furniture.table.Table;

public class CreationUtil {

    Chair chair = null;
    Table table = null;
    public  Chair getChair(String typeOfFactory){
        if(typeOfFactory.equals("modern")) {
            chair = new ModernFactory().createChair();
        }
        else if(typeOfFactory.equals("victorian")) {
            chair = new VictorianFactory().createChair();
        }
        return null;
    }

    public  Table getTable(String typeOfFactory){
        if(typeOfFactory.equals("modern")) {
            table = new ModernFactory().createTable();
        }
        else if(typeOfFactory.equals("victorian")) {
            table = new VictorianFactory().createTable();
        }
        return null;
    }
}
