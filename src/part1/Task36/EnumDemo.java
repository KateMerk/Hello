package part1.Task36;

import java.util.Locale;

public class EnumDemo {
    public static void main(String[] args) {
        for (Seasons season : Seasons.values()) {
            printInfo(season);
        }

    }

    public static void printInfo(Seasons season) {
        System.out.printf(Locale.ROOT, "%s %s, ", season.name(), season);
        season.getDescription();
    }
}

