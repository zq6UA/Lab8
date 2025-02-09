package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private static CustomList list;

    public CustomList MockCityList(){
        list = new CustomList( null, new ArrayList<City>());
        return list;
    }
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(listSize + 1, list.getCount());
    }

    @Test
    public void deleteCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        list.delete(city);
        assertEquals(listSize, list.getCount());
    }

    @Test
    public void hasCityTest(){
        list = MockCityList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(true, list.hasCity(city));
    }
    @Test
    public void getCitiesTest(){
        list = MockCityList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(1, list.getCities().size());
    }

}
