package com.tts.weatherapp;

import java.util.Date;
import java.util.List;
import java.util.Map;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Response {
    private Map<String, String> coord;
    private List<Map<String, String>> weather;
    private String base;
    private Map<String, String> main;
    private Map<String, String> wind;
    private Map<String, String> clouds;
    private String dt;
    private Map<String, String> sys;
    private String id;
    private String name;
    private String cod;

    @Override
    public String toString() {
        long epoch = Long.parseLong(dt);
        Date dtDate = new Date(epoch * 1000);
        return  "Description: " + weather.get(0).get("description") + "\n" +
                "Temperature: " + main.get("temp") + "\n" +
                "Feels like: "  + main.get("feels_like") + "\n" +
                "Min temp: "  + main.get("temp_min") + "\n" +
                "Max temp: "  + main.get("temp_max") + "\n" +
                "Humidity: "  + main.get("humidity") + "\n" +
                "Wind speed: "  + wind.get("speed") + "\n" +
                "Cloud Cover %: "  + clouds.get("all") + "\n" +
                "Current time: "  + dtDate.toString() + "\n" +
                "Locale: "  + name;
    }
}