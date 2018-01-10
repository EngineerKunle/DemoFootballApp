package com.engineerkunle.demofootballapp.api.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class DemoApiResponse implements Serializable {

    @SerializedName("records")
    @Expose
    private List<RecordClass> records = null;

    public List<RecordClass> getRecords() {
        return records;
    }

    public void setRecords(List<RecordClass> records) {
        this.records = records;
    }
}
