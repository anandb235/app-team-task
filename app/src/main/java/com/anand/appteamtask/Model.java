package com.anand.appteamtask;

public class Model {
    int image;
    String timing,name,address,type;
    String rating;

    public Model(int image, String timing, String name, String address, String type,String rating) {
        this.image = image;
        this.timing = timing;
        this.name = name;
        this.address = address;
        this.type = type;
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }

    public String getTiming() {
        return timing;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public String getRating() {
        return rating;
    }
}
