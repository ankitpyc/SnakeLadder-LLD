package org.example.domain;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String id;

    private List<String> movesHistory;

    private Point userPosition;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
        movesHistory = new ArrayList<>();
        userPosition = new Point(0,0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Point getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(Point userPosition) {
        this.userPosition = userPosition;
    }
}
