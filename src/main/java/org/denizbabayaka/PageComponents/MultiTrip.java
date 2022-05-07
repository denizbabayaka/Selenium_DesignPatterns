package org.denizbabayaka.PageComponents;

import org.denizbabayaka.AbstractComponents.SearchFlightAvail;

public class MultiTrip implements SearchFlightAvail {
    // we are onverriding this smethod from SearchFlightAvail interface
    @Override
    public void checkAvail(String origin, String destination) {

        System.out.println("Multi class");
    }
}
