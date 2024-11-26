package Furniture.table;

public class VictorianTable implements Table{
    @Override
    public int getNoOfLegs() {
        return 6;
    }

    @Override
    public String typeOfWood() {
        return "Sagacha";
    }
}
