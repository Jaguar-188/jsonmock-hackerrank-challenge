package com.example.jsonMockHackerrank.service;

import com.example.jsonMockHackerrank.Logger.Logging;
import com.example.jsonMockHackerrank.entity.Marathons;
import com.example.jsonMockHackerrank.utils.LoadDataFromPublicAPI;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Comparator;

@Service
public class PublicAPIService {


    private final Logging log = Logging.getLoggingInstance();


    public String getAthleteWithBestTopSpeed(){


        log.info("Calculating a athlete with highest top speed");
        return LoadDataFromPublicAPI.getListOfMarathonians().stream()
                .sorted(Comparator.comparing(Marathons::getTop_speed).reversed())
                .map(Marathons::getName)
                .findFirst()
                .orElse("");
    }

    public String getAthleteWithBestBottomSpeed() {

        log.info("Calculating a athlete with highest bottom speed");
        return LoadDataFromPublicAPI.getListOfMarathonians().stream()
                .sorted(Comparator.comparing(Marathons::getBottom_speed))
                .map(Marathons::getName)
                .findFirst()
                .orElse("");
    }
}
