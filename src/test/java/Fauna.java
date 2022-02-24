package by.si;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public abstract class Fauna {
    String name;
    String food;
    String habitat;
    static  HashMap <String, ArrayList<String>> fauna;

    public static void faunaInit() {
        String [] loadAnimal = {
                "Панда @ бамбук @ в Китае @ на 4 лапах, но может ходить на двух",
                "Жираф @ листья @ в Африке @ на 4 лапах",
                "Корова @ траву @ везде @ на 4 лапах, дает молоко",
                "Курица @ зерно @ везде @ на 2 лапах, может летать и несет яйца",
                "Пингвин @ рыбу @  Антарктиде @ на 2 лапах и не умеет летать",
                "Страус @ траву и насекомых @ в Африке @ на 2 лапах и не умеет летать",
                "Кит @ рыбу, крабов, кальмаров @  в океане @ Не пьет морскую воду и поет песни",
                "Сом @ рыбу и насекомых @ в речных ямах @ Спит зимой и имеет усы",
                "Анчоус @ планктон @ в море @ Используют в 'высокой' кулинарии , если не съедят живет 4 года "
        };

        fauna = new HashMap<>();
        for (String animal : loadAnimal) {
            String[] mas = animal.split("@");
            ArrayList<String> props = new ArrayList(Arrays.asList(mas));
            props.remove(0);
            fauna.put(mas[0].trim(), props);
        }

    }

    public abstract String getName();
    public abstract String getFood();
    public abstract String whereLive();
    public abstract String infoType();

}
