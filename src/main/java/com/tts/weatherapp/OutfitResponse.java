package com.tts.weatherapp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OutfitResponse extends Response {
    private String recommendation;

    public String toString() {
        return recommendation;
    }
}