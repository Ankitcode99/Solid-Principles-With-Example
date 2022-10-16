package org.example.AnkitCode99.LiskovSubstitution.BadDesign;

public class AudioBookDelivery extends BookDelivery{
    @Override
    void getDeliveryLocations() {

        /* can't be implemented since

         * Audio book doesn't have

         * a physical location. */

    }
}
