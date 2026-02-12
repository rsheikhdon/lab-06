package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 * It implements Comparable to allow sorting by city name.
 */
public class City implements Comparable<City> { // 1. Added implements clause

    private final String city;
    private final String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This returns the city name
     * @return The name of the city
     */
    public String getCityName(){
        return this.city;
    }

    /**
     * This returns the province name
     * @return The name of the province
     */
    public String getProvinceName(){
        return this.province;
    }

    /**
     * Required for Collections.sort() in CityList.
     * Compares cities alphabetically by name.
     */
    @Override
    public int compareTo(City o) { // 2. Changed Object to City for type safety
        return this.city.compareTo(o.getCityName());
    }

    /**
     * Required for cities.contains() in CityList.
     * Determines if two city objects represent the same city.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) &&
                Objects.equals(province, city1.province);
    }

    /**
     * Required for cities.contains() in CityList.
     * Generates a hash code for the city object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
