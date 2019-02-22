package ua.lviv.iot.waterSports.models;

public class WaterPolo extends WaterSports {

    private int targetNumbers;

    private int teamMembers;

    public WaterPolo() {

    }

    public WaterPolo(String name, int amountOfParticipants, boolean needOfSportEquipment, boolean isOlympicSport,
                     int targetNumbers, int teamMembers, String purposeOfSports, Rating rating) {
        super(name, amountOfParticipants, needOfSportEquipment, isOlympicSport, purposeOfSports, rating);
        this.targetNumbers = targetNumbers;
        this.teamMembers = teamMembers;
    }

    public int getTargetNumbers() {
        return targetNumbers;
    }

    public void setTargetNumbers(int targetNumbers) {
        this.targetNumbers = targetNumbers;
    }

    public int getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(int teamMembers) {
        this.teamMembers = teamMembers;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Water polo{" +
                "target numbers =" + targetNumbers +
                ", teamMembers =" + teamMembers +
                '}';
    }
}
