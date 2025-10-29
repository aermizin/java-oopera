import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Actor> listOfActors = new ArrayList<>();

        Actor actor1 = new Actor("Алексей", "Петренко", "Мужской", 180);
        Actor actor2 = new Actor("Антон", "Марков", "Мужской", 175);
        Actor actor3 = new Actor("Светлана", "Колокольцева", "Женский", 165);
        Actor actor4 = new Actor("Евгений", "Никишин", "Мужской", 179);
        Actor actor5 = new Actor("Лия", "Шарова", "Женский", 173);

        Director director1 = new Director("Серегй", "Радлов", "Мужской", 178, 25);
        Director director2 = new Director("Владимир", "Васильев", "Мужской", 178,
                25);
        Director director3 = new Director("Александрс", "Даум", "Мужской", 182,
                35);

        Person choreographer = new Person ("Агриппина", "Ваганова", "Женский", 160);

        Person musicAuthor = new Person ("Сергей", "Прокофьев", "Мужской", 170);

        MusicalShow musicalShow = new MusicalShow("Ромео и Джульетта", 170, director1, listOfActors,
                musicAuthor, "librettoTextMusicalShow");
        Ballet ballet = new Ballet("Боядерка", 150, director2, listOfActors, musicAuthor,
                "librettoTextBallet", choreographer);
        Opera opera = new Opera("Евгений Онегин", 150, director3, listOfActors, musicAuthor,
                "librettoTextOpera",10);

        System.out.println("Либретто баллета 'Боядерка': " + ballet.getLibrettoText());
        System.out.println("Либретто оперы 'Евгений Онегин': " + opera.getLibrettoText());

        System.out.println("Информация о режисере спектакля " + "'" +  musicalShow.getTitle() + "'" + ": " + director1.toString());
        System.out.println("Информация о режисере баллета " + "'" + ballet.getTitle() + "'" + ": " + director2.toString());
        System.out.println("Информация о режисере спектакля " + "'" + opera.getTitle() + "'" + ": " + director3.toString());

        musicalShow.addActor(actor1);
        musicalShow.addActor(actor1);
        musicalShow.addActor(actor3);
        musicalShow.addActor(actor5);

        musicalShow.printActor();

        ballet.addActor(actor1);
        ballet.addActor(actor2);
        ballet.addActor(actor4);

        ballet.printActor();

        opera.addActor(actor2);
        opera.addActor(actor4);
        opera.addActor(actor5);

        opera.printActor();

        opera.replaceActor(actor2, actor3);

        opera.printActor();

    }

}

