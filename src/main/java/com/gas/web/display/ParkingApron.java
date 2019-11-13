package com.gas.web.display;

import java.util.List;

public class ParkingApron {
    private List<String> dimensions;
    private List<List<Object>> data;

    public ParkingApron() {

    }

    public ParkingApron(List<String> dimensions, List<List<Object>> data) {
        this.dimensions = dimensions;
        this.data = data;
    }

    public List<String> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<String> dimensions) {
        this.dimensions = dimensions;
    }

    public List<List<Object>> getData() {
        return data;
    }

    public void setData(List<List<Object>> data) {
        this.data = data;
    }
}
