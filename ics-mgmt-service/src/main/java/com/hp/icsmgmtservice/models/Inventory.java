package com.hp.icsmgmtservice.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "inventory")
public class Inventory {
    @Id
    private String id;
    private int rooms;
    private int parking;

    @Override
    public String toString() {
        return "Inventory{" +
                "id='" + id + '\'' +
                ", rooms=" + rooms +
                ", parking=" + parking +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getParking() {
        return parking;
    }

    public void setParking(int parking) {
        this.parking = parking;
    }
}
