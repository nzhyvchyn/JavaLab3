package ua.lviv.iot.waterSports.managers;

import ua.lviv.iot.waterSports.models.WaterSports;

import java.util.List;

public interface IWaterSportsManager {

    public List<WaterSports> findByAmountOfParticipants(int min, int max);

    public void sortBySportPurpose(List<WaterSports> waterSports);

    public List<WaterSports> sortBySportName(boolean decreasing, List<WaterSports> waterSports);

    public void printWaterSportsInfo(List<WaterSports> waterSports);
}
