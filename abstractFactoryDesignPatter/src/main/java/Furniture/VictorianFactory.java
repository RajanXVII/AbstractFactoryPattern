package Furniture;

import Furniture.chair.Chair;
import Furniture.chair.VictorianChair;
import Furniture.table.Table;
import Furniture.table.VictorianTable;

public class VictorianFactory implements Factory {
    public Chair createChair(){
        return new VictorianChair();
    }
    public Table createTable(){
        return new VictorianTable();
    }
}
