abstract class Device{
   public abstract  void printModel();
}

class HP extends Device{
    @Override
    public void printModel(){
        System.out.println("This is HP laptop");
    }
}
class DELL extends Device{
    @Override
    public void printModel(){
        System.out.println("This is DELL laptop");
    }
}
class Nokia extends Device{
    @Override
    public void printModel(){
        System.out.println("This is Nokia Mobile");
    }
}
class OnePlus extends Device{
    @Override
    public void printModel(){
        System.out.println("This is OnePlus Mobile");
    }
}
abstract class DeviceFactories{
    public abstract Device getFactoryInstance(String choice);
}

class LaptopFactory extends DeviceFactories{
    @Override
    public Device getFactoryInstance(String choice){
        switch(choice){
            case "HP":
                return new HP();
            case "DELL":
                return new DELL();
        }
        return null;
    }
}

class MobileFactory extends DeviceFactories{
    @Override
    public Device getFactoryInstance(String choice){
        switch(choice){
            case "Nokia":
                return new Nokia();
            case "OnePlus":
                return new OnePlus();
        }
        return null;
    }
}

class FactoryOfFactories{
    public static DeviceFactories decide(String choice){
        switch(choice){
            case "Laptop":
                return new LaptopFactory();
            case "Mobile":
                return new MobileFactory();
        }
        return null;
    }
}

public class AbstractFactoryPattern
{
    public static void main(String[] args){
        Device dc=FactoryOfFactories.decide("Mobile").getFactoryInstance("OnePlus");
        dc.printModel();
    }
    
    
}
