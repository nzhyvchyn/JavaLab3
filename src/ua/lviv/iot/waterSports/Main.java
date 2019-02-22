package ua.lviv.iot.waterSports;

import  ua.lviv.iot.waterSports.managers.;

import ua.lviv.iot.waterSports.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        WaterSportsManager manager = new WaterSportsManager(createWaterSportsInfo());

        List<WaterSports> selectedSports = manager.findByAmountOfParticipants(0, 5);

        manager.sortBySportName(true, selectedSports);

        manager.printWaterSportsInfo(selectedSports);
    }

    private static List<WaterSports> createWaterSportsInfo() {
        List<WaterSports> waterSports = new ArrayList<>();

        waterSports.add(new Swimming("Swimming", 3, false,
                false, "Wellness", 40, 50, Rating.AVERAGE));
        waterSports.add(new WaterPolo("Water polo", 6,
                true, true, 2,7, "Wellness", Rating.HIGH));
        waterSports.add(new Aquajogging("Aquajogging", 4, false, true,
               "Recreational", true, Rating.HIGH));
        waterSports.add(new Windsurfing("Windsurfing", 1, false, true,
                "Competition", 20, 40, Rating.LOW));


        return waterSports;
    }
}