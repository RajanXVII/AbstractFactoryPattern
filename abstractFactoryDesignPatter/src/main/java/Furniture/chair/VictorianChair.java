package Furniture.chair;

public class VictorianChair implements Chair{
    @Override
    public String getTypeOfCloth() {
        return "victorianCloth";
    }

    @Override
    public String getDurability() {
        return "19";
    }
}
