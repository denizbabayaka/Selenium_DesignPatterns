package org.denizbabayaka.AbstractComponents;

public interface SearchFlightAvail {

    //we create this interface and method because all the class that implement this interface
    // will implement their own logic to checkAvail() method based on the requirements
    void checkAvail(String origin,String destination);



}
