package ua.lviv.iot.waterSports.models;

public class Windsurfing extends WaterSports {

    private int sailSquare;

    private int speedOfSportsman;

    public Windsurfing(){

    }

    public Windsurfing(String name, int amountOfParticipants, boolean needOfSportEquipment, boolean isOlympicSport,
                       String purposeOfSports, int sailSquare, int speedOfSportsman, Rating rating) {
        super(name, amountOfParticipants, needOfSportEquipment, isOlympicSport, purposeOfSports, rating );
        this.sailSquare = sailSquare;
        this.speedOfSportsman = speedOfSportsman;
    }

    public int getSailSquare() {
        return sailSquare;
    }

    public void setSailSquare(int sailSquare) {
        this.sailSquare = sailSquare;
    }

    public int getSpeedOfSportsman() {
        return speedOfSportsman;
    }

    public void setSpeedOfSportsman(int speedOfSportsman) {
        this.speedOfSportsman = speedOfSportsman;
    }
}