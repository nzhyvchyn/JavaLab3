package ua.lviv.iot.waterSports.models;

public class WaterSports {
    private String name;

    private int amountOfParticipants;

    private boolean needOfSportEquipment;

    private boolean isOlympicSport;

    private String purposeOfSports;

    private Rating rating;

    public WaterSports() {

    }

    public WaterSports(String name, int amountOfParticipants, boolean needOfSportEquipment, boolean isOlympicSport, String purposeOfSports, Rating rating) {
        this.name = name;
        this.amountOfParticipants = amountOfParticipants;
        this.needOfSportEquipment = needOfSportEquipment;
        this.isOlympicSport = isOlympicSport;
        this.purposeOfSports = purposeOfSports;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "WaterSports{" +
                "name='" + name + '\'' +
                ", amountOfParticipants=" + amountOfParticipants +
                ", needOfSportEquipment=" + needOfSportEquipment +
                ", isOlympicSport=" + isOlympicSport +
                ", purposeOfSports=" + purposeOfSports +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmountOfParticipants(int amountOfParticipants) {
        this.amountOfParticipants = amountOfParticipants;
    }

    public void setNeedOfSportEquipment(boolean needOfSportEquipment) {
        this.needOfSportEquipment = needOfSportEquipment;
    }

    public void setOlympicSport(boolean olympicSport) {
        isOlympicSport = olympicSport;
    }

    public String getName() {
        return name;
    }

    public int getAmountOfParticipants() {
        return amountOfParticipants;
    }

    public boolean isNeedOfSportEquipment() {
        return needOfSportEquipment;
    }

    public boolean isOlympicSport() {
        return isOlympicSport;
    }

    public String getPurposeOfSports() {
        return purposeOfSports;
    }

    public void setPurposeOfSports(String purposeOfSports) {
        this.purposeOfSports = purposeOfSports;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}

