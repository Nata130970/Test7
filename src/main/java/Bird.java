
import java.util.ArrayList;
// Это класс птицы
public class Bird extends Fauna{
    String move;

    public Bird (String name){
        this.name=name;
        ArrayList<String> props = fauna.get(this.name);
        food=props.get(0).trim();
        habitat=props.get(1).trim();
        move=props.get(2).trim();
    }

    @Override
    public  String getName(){
        return this.name + ":\n";
    }
    @Override
    public  String getFood() {
        return  "Eст " + this.food + "\n";
    }
    @Override
    public  String whereLive(){
        return "Живет " + this.habitat+ "\n";
    }
    @Override
    public String infoType(){
        String info = getName() + getFood() + whereLive() + move();
        return info;
    }

    protected String move(){
        return "Ходит " + this.move+ "\n";
    }

}
