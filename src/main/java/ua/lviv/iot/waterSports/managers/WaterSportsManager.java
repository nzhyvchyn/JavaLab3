package ua.lviv.iot.waterSports.managers;


import ua.lviv.iot.waterSports.models.WaterSports;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WaterSportsManager implements IWaterSportsManager {

    private List<WaterSports> waterSports;

    public WaterSportsManager() {
    }

    public WaterSportsManager(final List<WaterSports> waterSports) {
        this.waterSports = waterSports;
    }

    @Override
    public final List<WaterSports> findByAmountOfMembers(final int min, final int max) {
        return waterSports.stream()
                .filter(waterSports -> waterSports.getAmountOfMembers() >= min
                        &&
                        waterSports.getAmountOfMembers() <= max)
                .collect(Collectors.toList());
    }

    @Override
    public final void sortBySportPurpose(final List<WaterSports> waterSports) {
        waterSports.sort(Comparator.comparing(WaterSports::getPurposeOfSports));
    }

    @Override
    public List<WaterSports> sortBySportName(final boolean decreasing, List<WaterSports> waterSports) {
        if (decreasing) {
            waterSports.sort(Comparator.comparing(WaterSports::getName).reversed());
        }
        else {
            waterSports.sort(Comparator.comparing(WaterSports::getName));
        }
        return waterSports;
    }

    @Override
    public final void formWaterSportsInfo(final List<WaterSports> waterSports) {
        waterSports.forEach(System.out::println);
    }

    public final List<WaterSports> getWaterSports() {
        return waterSports;
    }

    public final void setWaterSports(final List<WaterSports> waterSports) {
        this.waterSports = waterSports;
    }
}