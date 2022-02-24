package by.si;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mode;
        Animal animal;
        Bird bird;
        Fish fish;

    Fauna.faunaInit();

        Scanner scanner = new Scanner(System.in);
        Scanner scanLine = new Scanner(System.in);


        do {
            System.out.println("Чтобы узнать о Пандах наберите 1\n" +
                    "Чтобы узнать о Жирафах наберите 2 \n " +
                    "Чтобы узнать о Коровах наберите 3 \n" +
                    "Чтобы узнать о Курицах наберите 4 \n" +
                    "Чтобы узнать о Пингвинах наберите 5 \n" +
                    "Чтобы узнать о Страусах наберите 6 \n" +
                    "Чтобы узнать о Китах наберите 7 \n" +
                    "Чтобы узнать о Сомах наберите 8 \n" +
                    "Чтобы узнать о Анчоусах наберите 9 \n" +

                    "Для выхода наберите 0 ");
            mode = scanner.nextInt();
            switch (mode) {
                case 1:
                    animal = new Animal("Панда");
                    System.out.println(animal.infoType());

                    break;
                case 2:
                    animal = new Animal("Жираф");
                    System.out.println(animal.infoType());
                    break;
                case 3:
                    animal = new Animal("Корова");
                    System.out.println(animal.infoType());
                    break;
                case 4:
                    bird = new Bird("Курица");
                    System.out.println(bird.infoType());
                    break;
                case 5:
                    bird = new Bird("Пингвин");
                    System.out.println(bird.infoType());
                    break;
                case 6:
                    bird = new Bird("Страус");
                    System.out.println(bird.infoType());
                    break;
                case 7:
                    fish = new Fish("Кит");
                    System.out.println(fish.infoType());
                    break;
                case 8:
                    fish = new Fish("Сом");
                    System.out.println(fish.infoType());
                    break;
                case 9:
                    fish = new Fish("Анчоус");
                    System.out.println(fish.infoType());
                    break;

                case 0:
                    System.out.println("До cвидания !!! ");
                    return;
                default:
                    System.out.println("Ошибка выбора");
                    break;
            }
            System.out.println("Для продолжения нажмите Enter ");
            scanLine.nextLine();
        }while(mode != 0);

    }
}
