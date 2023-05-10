package com.tts.weatherapp;

import lombok.Data;

@Data
public class Request {
    private String zipCode = "90210";
    private String description = "I am a 28 year old man in an architecture non-profit. I want to look sharp today for an event after work. I usually accessorize adventurously, but always within traditional boundaries.";
}