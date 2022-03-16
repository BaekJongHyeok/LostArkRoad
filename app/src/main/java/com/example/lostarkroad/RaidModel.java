package com.example.lostarkroad;
import android.graphics.Bitmap;

public class RaidModel {
    Bitmap image; // 사진
    String raidname; // 샵이름

    public RaidModel(Bitmap image, String raidname) {
        this.image = image;
        this.raidname = raidname;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getRaidname() {
        return raidname;
    }

    public void setRaidname(String raidname) {
        this.raidname = raidname;
    }
}
