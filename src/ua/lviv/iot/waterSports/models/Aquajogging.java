package ua.lviv.iot.waterSports.models;

public class Aquajogging extends WaterSports {

    private boolean isStreamsOnTV;

    public Aquajogging() {

    }

    public Aquajogging(String name, int amountOfParticipants, boolean needOfSportEquipment,
                       boolean isOlympicSport, String purposeOfSports, boolean isStreamsOnTV, Rating rating) {
        super(name, amountOfParticipants, needOfSportEquipment, isOlympicSport, purposeOfSports, rating);
        this.isStreamsOnTV = isStreamsOnTV;
    }

    public boolean isStreamsOnTV() {
        return isStreamsOnTV;
    }

    public void setStreamsOnTV(boolean streamsOnTV) {
        isStreamsOnTV = streamsOnTV;
    }

}

