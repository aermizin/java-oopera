import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Actor> listOfActors = new ArrayList<>();

        Actor actor1 = new Actor("Алексей", "Петренко", Gender.MALE, 180);
        Actor actor2 = new Actor("Антон", "Марков", Gender.MALE, 175);
        Actor actor3 = new Actor("Светлана", "Колокольцева", Gender.FEMALE, 165);
        Actor actor4 = new Actor("Евгений", "Марков", Gender.MALE, 179);
        Actor actor5 = new Actor("Лия", "Шарова", Gender.FEMALE, 173);

        Director director1 = new Director("Серегй", "Радлов", Gender.MALE,   25);
        Director director2 = new Director("Владимир", "Васильев", Gender.MALE,  25);
        Director director3 = new Director("Александрс", "Даум", Gender.MALE,  35);

        Person choreographer = new Person ("Агриппина", "Ваганова", Gender.FEMALE);

        Person musicAuthor = new Person ("Сергей", "Прокофьев", Gender.MALE);

        MusicalShow musicalShow = new MusicalShow("Ромео и Джульетта", 170, director1, listOfActors,
                musicAuthor, "librettoTextMusicalShow");
        Ballet ballet = new Ballet("Боядерка", 150, director2, listOfActors, musicAuthor,
                "librettoTextBallet", choreographer);
        Opera opera = new Opera("Евгений Онегин", 150, director3, listOfActors, musicAuthor,
                "librettoTextOpera",10);

        System.out.println("Либретто баллета 'Боядерка': ");
        ballet.getLibrettoText();
        System.out.println("Либретто оперы 'Евгений Онегин': ");
        opera.getLibrettoText();

        System.out.println("Информация о режисере спектакля " + "'" + musicalShow.getTitle() + "'"  + ":");
        musicalShow.infoDirector();
        System.out.println("Информация о режисере баллета " + "'" + ballet.getTitle() + "'" + ":");
        ballet.infoDirector();
        System.out.println("Информация о режисере спектакля " + "'" + opera.getTitle() + "'" + ":");
        opera.infoDirector();

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
        opera.addActor(actor3);
        opera.addActor(actor4);
        opera.addActor(actor5);

        opera.printActor();

        opera.replaceActor("Марков", actor3);
        opera.printActor();
        opera.replaceActor("Марков", actor3);
        opera.printActor();
        opera.replaceActor("Колокольцева", actor1);
        opera.printActor();
        opera.replaceActor("Иванов", actor1);
        opera.printActor();
    }

}


