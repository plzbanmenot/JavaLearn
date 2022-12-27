package org.example.enums;

public enum EnumParametrizedContctuctor {
    CHECKHOV("RU", "PROSE", 19),
    TOLSTOY("RU", "PROSE", 19),
    DOSTOEVSKY("RU", "PROSE", 18),
    VODOLAZKIN("RU", "PROSE");

    private String county;
    private String genre;
    private int century;

    private EnumParametrizedContctuctor(String county, String genre, int century){
        this.county = county;
        this.century = century;
        this.genre = genre;
    }

    private EnumParametrizedContctuctor(String county, String genre){
        this.county = county;
        this.century = 0;
        this.genre = genre;
    }

    //getter
    int getCentury(){
        return century;
    }

    int getCenturyInYears(){
        return century * 100;
    }
}
