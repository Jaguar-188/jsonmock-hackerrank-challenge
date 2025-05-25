package com.example.jsonMockHackerrank.utils;

import com.example.jsonMockHackerrank.Logger.Logging;
import com.example.jsonMockHackerrank.constants.Constants;
import com.example.jsonMockHackerrank.entity.Marathons;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.BeforeClass;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LoadDataFromPublicAPI {

    static List<Marathons> marathonsList = new ArrayList<>();

    private static final Logging log = Logging.getLoggingInstance();

    static {
        try {
            marathonsList = getMarathonsList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private LoadDataFromPublicAPI(){


    }

    public static List<Marathons> getMarathonsList() throws IOException {

        URL url = new URL(Constants.API_URL);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod(Constants.GET_REQUEST_METHOD);

        log.info("Loading data into list from public API");

        List<Marathons> marathonsList = new ArrayList<>();

        try
        {
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(new InputStreamReader(httpURLConnection.getInputStream()));
            JSONArray jsonArray = (JSONArray) jsonObject.get("data");

            for (Object json : jsonArray)
            {
                JSONObject object = (JSONObject) json;
                Marathons marathons = new Marathons();

                marathons.setName((String) object.get("name"));
                marathons.setSex((String) object.get("sex"));
                marathons.setId((String) object.get("id"));
                marathons.setAge((long) object.get("age"));
                marathons.setTop_speed((double) object.get("top_speed"));
                marathons.setBottom_speed((double) object.get("bottom_speed"));
                marathons.setAverage_speed((double) object.get("average_speed"));
                marathons.setAvgheartbeat((long) object.get("avgheartbeat"));
                marathons.setDistance_run((double) object.get("distance_run"));
                marathons.setMarathon_name((String) object.get("marathon_name"));
                marathons.setCountry((String) object.get("country"));
                marathons.setNumber_of_participants((long) object.get("number_of_participants"));
                marathons.setPersonal_best_time((long) object.get("personal_best_time"));
                marathons.setStops_taken((long) object.get("stops_taken"));
                marathons.setPosition((long) object.get("position"));
                marathonsList.add(marathons);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return marathonsList;
    }

    public static List<Marathons> getListOfMarathonians(){
        return marathonsList;
    }
}
