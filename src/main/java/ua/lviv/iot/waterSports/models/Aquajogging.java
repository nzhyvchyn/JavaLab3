package ua.lviv.iot.waterSports.models;

public class Aquajogging extends WaterSports {

    private boolean isStreamsOnTV;

    public Aquajogging() {

    }

    public Aquajogging(final String name, final int amountOfMembers,
                       final boolean needOfSportEquipment,
                       final boolean isOlympicSport, final String purposeOfSports,
                       final boolean isStreamsOnTV, final Rating rating) {
        super(name, amountOfMembers, needOfSportEquipment, isOlympicSport, purposeOfSports, rating);
        this.isStreamsOnTV = isStreamsOnTV;
    }

    public final boolean isStreamsOnTV() {
        return isStreamsOnTV;
    }

    public final void setStreamsOnTV(boolean streamsOnTV) {
        isStreamsOnTV = streamsOnTV;
    }

}

