package ua.lviv.iot.waterSports.managers;


import ua.lviv.iot.waterSports.models.WaterSports;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WaterSportsManager implements IWaterSportsManager {

    private List<WaterSports> waterSports;

    public WaterSportsManager() {
    }

    public WaterSportsManager(List<WaterSports> waterSports) {
        this.waterSports = waterSports;
    }

    @Override
    public List<WaterSports> findByAmountOfParticipants(int min, int max) {
        return waterSports.stream()
                .filter(waterSports -> waterSports.getAmountOfParticipants() >= min &&
                        waterSports.getAmountOfParticipants() <= max)
                .collect(Collectors.toList());
    }

    @Override
    public void sortBySportPurpose(List<WaterSports> waterSports) {
        waterSports.sort(Comparator.comparing(WaterSports::getPurposeOfSports));
    }

    @Override
    public List<WaterSports> sortBySportName(boolean decreasing, List<WaterSports> waterSports) {
            if (decreasing){
                waterSports.sort(Comparator.comparing(WaterSports::getName).reversed());
            }
            else {
                waterSports.sort(Comparator.comparing(WaterSports::getName));
            }
            return waterSports;
    }

    @Override
    public void printWaterSportsInfo(List<WaterSports> waterSports) {
        waterSports.forEach(System.out::println);
    }

    public List<WaterSports> getWaterSports() {
        return waterSports;
    }

    public void setWaterSports(List<WaterSports> waterSports) {
        this.waterSports= waterSports;
    }
}