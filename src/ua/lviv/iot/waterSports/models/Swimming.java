package ua.lviv.iot.waterSports.models;

public class Swimming extends WaterSports {

    private int poolLength;

    private int poolWidth;

    public Swimming() {
    }

    public Swimming(String name, int amountOfParticipants, boolean needOfSportEquipment, boolean isOlympicSport, String purposeOfSports, int poolLength, int poolWidth, Rating rating) {
        super(name, amountOfParticipants, needOfSportEquipment, isOlympicSport, purposeOfSports, rating);
        this.poolLength = poolLength;
        this.poolWidth = poolWidth;
    }


    public int getPoolLength() {
        return poolLength;
    }

    public void setPoolLength(int poolLength) {
        this.poolLength = poolLength;
    }

    public int getPoolWidth() {
        return poolWidth;
    }

    public void setPoolWidth(int poolWidth) {
        this.poolWidth = poolWidth;
    }


}
