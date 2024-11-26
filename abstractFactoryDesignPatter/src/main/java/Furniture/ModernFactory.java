package Furniture;

import Furniture.chair.Chair;
import Furniture.chair.ModernChair;
import Furniture.table.ModernTable;
import Furniture.table.Table;

public class ModernFactory implements Factory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
