package ua.lviv.iot.waterSports.models;

public class WaterSports {
    private String name;

    private int amountOfMembers;

    private boolean needOfSportEquipment;

    private boolean isOlympicSport;

    private String purposeOfSports;

    private Rating rating;

    public WaterSports() {

    }

    public WaterSports(final String name, final int amountOfMembers,
                       final boolean needOfSportEquipment,
                       final boolean isOlympicSport,
                       final String purposeOfSports,
                       final Rating rating) {
        this.name = name;
        this.amountOfMembers = amountOfMembers;
        this.needOfSportEquipment = needOfSportEquipment;
        this.isOlympicSport = isOlympicSport;
        this.purposeOfSports = purposeOfSports;
        this.rating = rating;
    }

    @Override
    public final String toString() {
        return "WaterSports{"
                + "name='" + name + '\''
                + ", amountOfParticipants=" + amountOfMembers
                + ", needOfSportEquipment=" + needOfSportEquipment
                + ", isOlympicSport=" + isOlympicSport
                + ", purposeOfSports=" + purposeOfSports
                + '}';
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final void setAmountOfMembers(int amountOfMembers) {
        this.amountOfMembers = amountOfMembers;
    }

    public final void setNeedOfSportEquipment(boolean needOfSportEquipment) {
        this.needOfSportEquipment = needOfSportEquipment;
    }

    public final void setOlympicSport(boolean olympicSport) {
        isOlympicSport = olympicSport;
    }

    public final String getName() {
        return name;
    }

    public final int getAmountOfMembers() {
        return amountOfMembers;
    }

    public final boolean isNeedOfSportEquipment() {
        return needOfSportEquipment;
    }

    public final boolean isOlympicSport() {
        return isOlympicSport;
    }

    public final String getPurposeOfSports() {
        return purposeOfSports;
    }

    public final void setPurposeOfSports(String purposeOfSports) {
        this.purposeOfSports = purposeOfSports;
    }

    public final Rating getRating() {
        return rating;
    }

    public final void setRating(Rating rating) {
        this.rating = rating;
    }
}

