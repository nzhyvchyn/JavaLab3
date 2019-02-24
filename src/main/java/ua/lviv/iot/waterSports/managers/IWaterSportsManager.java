package ua.lviv.iot.waterSports.managers;

import ua.lviv.iot.waterSports.models.WaterSports;

import java.util.List;

public interface IWaterSportsManager {

    List<WaterSports> findByAmountOfMembers(int min, int max);

    void sortBySportPurpose(List<WaterSports> waterSports);

    List<WaterSports> sortBySportName(boolean decreasing, List<WaterSports> waterSports);

    void formWaterSportsInfo(List<WaterSports> waterSports);
}
