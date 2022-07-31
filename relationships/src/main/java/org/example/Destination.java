package org.example;

import javax.persistence.*;

@Entity
@Table(name="destination25")
public class Destination {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int did;
    private String dplace;

    private int distance;
    @OneToOne(targetEntity=Travelling.class)
    private Travelling travell;
    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDplace() {
        return dplace;
    }

    public void setDplace(String dplace) {
        this.dplace = dplace;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Travelling getTravell() {
        return travell;
    }

    public void setTravell(Travelling travell) {
        this.travell = travell;
    }
}
