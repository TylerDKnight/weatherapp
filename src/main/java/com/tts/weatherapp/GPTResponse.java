package com.tts.weatherapp;

import java.util.Date;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class GPTResponse {
    private String id;
    private String object;
    private Date created;
    private List<Choice> choices;

    @Data
    public static class Choice {
        private Map<String, String> message;
        private String finish_reason;
        private int index;
    }
}