package ua.lviv.iot.waterSports.models;

public class WaterPolo extends WaterSports {

    private int targetNumbers;

    private int teamMembers;

    public WaterPolo() {

    }

    public WaterPolo(final String name, final int amountOfParticipants,
                     final boolean needOfSportEquipment, final boolean isOlympicSport,
                     final int targetNumbers, final int teamMembers,
                     final String purposeOfSports, final Rating rating) {
        super(name, amountOfParticipants, needOfSportEquipment,
                isOlympicSport, purposeOfSports, rating);
        this.targetNumbers = targetNumbers;
        this.teamMembers = teamMembers;
    }

    public final int getTargetNumbers() {
        return targetNumbers;
    }

    public final void setTargetNumbers(int targetNumbers) {
        this.targetNumbers = targetNumbers;
    }

    public final int getTeamMembers() {
        return teamMembers;
    }

    public final void setTeamMembers(int teamMembers) {
        this.teamMembers = teamMembers;
    }

    @Override
    public final String toString() {
        return super.toString()
                + "Water polo{"
                + "target numbers =" + targetNumbers
                + ", teamMembers =" + teamMembers
                + '}';
    }
}
