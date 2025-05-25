package com.example.jsonMockHackerrank.controller;

import com.example.jsonMockHackerrank.service.PublicAPIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/json-mock-operation")
public class PublicAPIController {

    private final PublicAPIService publicAPIService;

    public PublicAPIController(PublicAPIService publicAPIService){

        this.publicAPIService = publicAPIService;
    }


    @GetMapping(value = "/getAthleteWithBestTopSpeed")
    public String getAthleteWithBestTopSpeed(){

        String playerWithHighestTopSpeed = "";
        try
        {
            playerWithHighestTopSpeed =  publicAPIService.getAthleteWithBestTopSpeed();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return playerWithHighestTopSpeed;
    }

    @GetMapping(value = "/getAthleteWithBestBottomSpeed")
    public String getAthleteWithBestBottomSpeed(){

        String playerWithHighestBottomSpeed = "";
        try
        {
            playerWithHighestBottomSpeed =  publicAPIService.getAthleteWithBestBottomSpeed();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return playerWithHighestBottomSpeed;
    }
}
