package com.lsq.entity;

public class MapClass {
    private String json_data;

    public String getJson_data() {
        return json_data;
    }

    public void setJson_data(String json_data) {
        this.json_data = json_data;
    }

    @Override
    public String toString() {
        return "Map{" +
                "json_data='" + json_data + '\'' +
                '}';
    }
}
