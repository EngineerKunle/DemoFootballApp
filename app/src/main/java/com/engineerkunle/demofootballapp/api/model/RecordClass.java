package com.engineerkunle.demofootballapp.api.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class RecordClass implements Serializable {

    @SerializedName("Name")
    @Expose
    private String name;

    @SerializedName("Appearance")
    @Expose
    private Integer appearance;

    @SerializedName("Goals")
    @Expose
    private Integer goals;

    @SerializedName("Assist")
    @Expose
    private Integer assist;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAppearance() {
        return appearance;
    }

    public void setAppearance(Integer appearance) {
        this.appearance = appearance;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Integer getAssist() {
        return assist;
    }

    public void setAssist(Integer assist) {
        this.assist = assist;
    }
}
