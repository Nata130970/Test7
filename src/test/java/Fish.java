package by.si;

import java.util.ArrayList;

public class Fish extends Fauna{
    String about;
    public Fish (String name){
        this.name=name;
        ArrayList<String> props = fauna.get(this.name);
        food=props.get(0).trim();
        habitat=props.get(1).trim();
        about=props.get(2).trim();
    }

    @Override
    public  String getName(){
        return this.name + ":\n";
    }
    @Override
    public  String getFood() {
        return "Eст " +this.food + "\n";
    }
    @Override
    public  String whereLive(){
        return "Живет " + this.habitat+ "\n";
    }
    @Override
    public String infoType(){
        String info = getName() + getFood() + whereLive() + aboutFish();
        return info;
    }
    private String aboutFish(){
        return this.about + "\n";
    }


}
