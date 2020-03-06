package com.example.locationupdatebackground;

import android.location.Location;

class SendLocationActivity {

    private Location location;

    public SendLocationActivity(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
