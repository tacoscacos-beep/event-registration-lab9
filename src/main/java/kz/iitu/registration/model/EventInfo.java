package kz.iitu.registration.model;

import jakarta.persistence.*;

@Entity
@Table(name = "events")
public class EventInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String location;

    public EventInfo() {
    }

    public EventInfo(int id, String title, String location) {
        this.id = id;
        this.title = title;
        this.location = location;
    }

    public EventInfo(String title, String location) {
        this.title = title;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}