package ua.lviv.iot.waterSports.models;

public class Windsurfing extends WaterSports {

    private int sailSquare;

    private int speedOfSportsman;

    public Windsurfing(){

    }

    public Windsurfing(String name, int amountOfParticipants,
                       boolean needOfSportEquipment, boolean isOlympicSport,
                       String purposeOfSports, int sailSquare,
                       int speedOfSportsman, Rating rating) {
        super(name, amountOfParticipants, needOfSportEquipment, isOlympicSport,
                purposeOfSports, rating);
        this.sailSquare = sailSquare;
        this.speedOfSportsman = speedOfSportsman;
    }

    public final int getSailSquare() {
        return sailSquare;
    }

    public final void setSailSquare(final int sailSquare) {
        this.sailSquare = sailSquare;
    }

    public final int getSpeedOfSportsman() {
        return speedOfSportsman;
    }

    public final void setSpeedOfSportsman(final int speedOfSportsman) {
        this.speedOfSportsman = speedOfSportsman;
    }
}