package Furniture;

import Furniture.chair.Chair;
import Furniture.table.Table;

public interface Factory {
    Chair createChair();
    Table createTable();
}
