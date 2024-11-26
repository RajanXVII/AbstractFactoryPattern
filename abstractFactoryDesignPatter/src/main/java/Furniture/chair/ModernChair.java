package Furniture.chair;

public class ModernChair implements Chair{
    @Override
    public String getTypeOfCloth() {
        return "modernChairCloth";
    }

    @Override
    public String getDurability() {
        return "5";
    }
}
