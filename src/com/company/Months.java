package com.company;

public enum Months {
    January(Seasons.Winter, 31),
    February(Seasons.Winter, 28),
    March(Seasons.Spring, 31),
    April(Seasons.Spring, 30),
    May(Seasons.Spring, 31),
    June(Seasons.Summer, 30),
    July(Seasons.Summer, 31),
    August(Seasons.Summer, 31),
    September(Seasons.Autumn, 30),
    October(Seasons.Autumn, 31),
    November(Seasons.Autumn, 30),
    December(Seasons.Winter, 31);

    Seasons seasons;
    private int days;


    Months(Seasons seasons, int days) {
        this.seasons = seasons;
        this.days = days;
    }

    public Seasons getSeasons() {
        return seasons;
    }

    public int getDays() {
        return days;
    }
}
