package com.peopledata;

public class WestBengal extends CountryDetails{
    private int cityId;
    private String cityName;

    public WestBengal(String countryName, int cityId, String cityName) {
        super(countryName);
        this.cityId = cityId;
        this.cityName = cityName;
    }

    public int getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }
}
