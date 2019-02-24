package ua.lviv.iot.waterSports.models;

public class Swimming extends WaterSports {

    private int poolLength;

    public Swimming() {
    }

    public Swimming(final String name, final int amountOfParticipants, final boolean needOfSportEquipment,
                   final boolean isOlympicSport, final String purposeOfSports,
                   final int poolLength, final Rating rating) {
        super(name, amountOfParticipants, needOfSportEquipment,
                isOlympicSport, purposeOfSports, rating);
        this.poolLength = poolLength;
    }


    public final int getPoolLength() {
        return poolLength;
    }

    public final void setPoolLength(int poolLength) {
        this.poolLength = poolLength;
    }

}
