package com.MarqueBurgess;

import java.net.URL;

public class ShowCar {

    private String modelBrand;
    private String modelName;
    private int modelYear;
    private String modelEngine;
    private URL webLink;

    public ShowCar(String modelBrand, String modelName, int modelYear, String modelEngine, URL webLink) {
        this.modelBrand = modelBrand;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.modelEngine = modelEngine;
        this.webLink = webLink;
    }

    public String getModelBrand() {
        return modelBrand;
    }

    public void setModelBrand(String modelBrand) {
        this.modelBrand = modelBrand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getModelEngine() {
        return modelEngine;
    }

    public void setModelEngine(String modelEngine) {
        this.modelEngine = modelEngine;
    }

    @Override
    public String toString() {
        return modelYear + " " + modelBrand + " " + modelName + " with a/an " + modelEngine + " take a look at \n" + webLink;
    }
}
