package ru.gorshckov;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Arrays;
public class Weather {


    private Object weather;
    private Object coord;
    private Object sys;
    private Object base;
    private Object main;
    private Object wind;
    private Object clouds;
    private Object dt;
    private Object id;
    private Object name;
    private Object cod;

    public Object getWeather() {
        return weather;
    }
      public void setWeather(Object weather) {
        this.weather = weather;
    }

    public Object getCoord() {
        return coord;
    }
    @JsonIgnore
    public void setCoord(Object coord) {
        this.coord = coord;
    }

    public Object getSys() {
        return sys;
    }
    @JsonIgnore
    public void setSys(Object sys) {
        this.sys = sys;
    }

    public Object getBase() {
        return base;
    }
    @JsonIgnore
    public void setBase(Object base) {
        this.base = base;
    }

    public Object getMain() {
        return main;
    }

    public void setMain(Object main) {
        this.main = main;
    }

    public Object getWind() {
        return wind;
    }
    @JsonIgnore
    public void setWind(Object wind) {
        this.wind = wind;
    }

    public Object getClouds() {
        return clouds;
    }
    @JsonIgnore
    public void setClouds(Object clouds) {
        this.clouds = clouds;
    }

    public Object getDt() {
        return dt;
    }
    @JsonIgnore
    public void setDt(Object dt) {
        this.dt = dt;
    }

    public Object getId() {
        return id;
    }
    @JsonIgnore
    public void setId(Object id) {
        this.id = id;
    }

    public Object getName() {
        return name;
    }
    @JsonIgnore
    public void setName(Object name) {
        this.name = name;
    }

    public Object getCod() {
        return cod;
    }
    @JsonIgnore
    public void setCod(Object cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "main=" + main +
                '}';
    }
}
