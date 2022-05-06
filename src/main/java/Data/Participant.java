package Data;

import java.util.ArrayList;

public abstract class Participant {
    String name;
    int YOE;
    int id;
    ArrayList<String> skills = new ArrayList<>();
    Boolean connected;
    Boolean employedInTech;

    public Participant(String name, int YOE, Boolean connected) {
        this.name = name;
        this.YOE = YOE;
        this.connected = connected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYOE() {
        return YOE;
    }

    public void setYOE(int YOE) {
        this.YOE = YOE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public Boolean getConnected() {
        return connected;
    }

    public void setConnected(Boolean connected) {
        this.connected = connected;
    }

    public Boolean getEmployedInTech() {
        return employedInTech;
    }

    public void setEmployedInTech(Boolean employedInTech) {
        this.employedInTech = employedInTech;
    }
}
