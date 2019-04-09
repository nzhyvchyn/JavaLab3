package ua.lviv.iot.waterSports;

import ua.lviv.iot.waterSports.managers.WaterSportsManager;
import ua.lviv.iot.waterSports.models.*;

import java.util.ArrayList;
import java.util.List;


 class Main {

    public final static void main(String[] args) {

        WaterSportsManager wsm = new WaterSportsManager(formWaterSportsInfo());

        List<WaterSports> selectedSports = wsm.findByAmountOfMembers(0, 5);

        wsm.sortBySportName(true, selectedSports);

        wsm.formWaterSportsInfo(selectedSports);
    }

    private static List<WaterSports> formWaterSportsInfo() {
        List<WaterSports> waterSports = new ArrayList<>();

        waterSports.add(new Swimming("Swimming", 3, false,
                false, "Wellness", 50, Rating.AVERAGE));
        waterSports.add(new WaterPolo("Water polo", 6,
                true, true, 2,7, "Wellness", Rating.HIGH));
        waterSports.add(new Aquajogging("Aquajogging", 4, false, true,
                "Recreational", true, Rating.HIGH));
        waterSports.add(new Windsurfing("Windsurfing", 1, false, true,
                "Competition", 20, 40, Rating.LOW));


        return waterSports;
    }
}