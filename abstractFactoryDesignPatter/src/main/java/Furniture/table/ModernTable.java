package Furniture.table;

public class ModernTable implements Table{
    @Override
    public int getNoOfLegs() {
        return 5;
    }

    @Override
    public String typeOfWood() {
        return "normal";
    }
}
