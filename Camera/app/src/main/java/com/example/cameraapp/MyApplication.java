package com.example.cameraapp;

import android.app.Application;
import android.net.Uri;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application {

    List<Uri> uriList;

    public MyApplication() {
        this.uriList = new ArrayList<>();
    }

    public List<Uri> getUriList() {
        return uriList;
    }

    public void setUriList(List<Uri> uriList) {
        this.uriList = uriList;
    }
}
