package UI;

public class CreationUtil {
    Factory factory;

    public CreationUtil(Factory factory){
        this.factory = factory;
    }

    public Button getButton(){
        return factory.createButton();
    }

    public CheckBox getCheckbox(){
        return factory.createCheckBox();
    }

    //Icache->in-memory, redis
    //persist->mongo, pithos
    //queue->kafka

    //factory->Icache, Ipersisitence, Iqueue
    //provider -> getInstance(){
    //  factory.getInst().
    // }










}
