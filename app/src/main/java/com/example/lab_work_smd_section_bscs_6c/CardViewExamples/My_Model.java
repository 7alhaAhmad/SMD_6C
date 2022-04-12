package com.example.lab_work_smd_section_bscs_6c.CardViewExamples;

public class My_Model {
    public String Name;
    public int totalDownloads;
    public int thumbnails;

    public My_Model(String name, int totalDownloads, int thumbnails) {
        Name = name;
        this.totalDownloads = totalDownloads;
        this.thumbnails = thumbnails;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getTotalDownloads() {
        return totalDownloads;
    }

    public void setTotalDownloads(int totalDownloads) {
        this.totalDownloads = totalDownloads;
    }

    public int getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(int thumbnails) {
        this.thumbnails = thumbnails;
    }
}
