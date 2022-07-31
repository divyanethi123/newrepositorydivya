package org.example;


import javax.persistence.*;

@Entity
@Table(name="travelling25")
public class Travelling {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @PrimaryKeyJoinColumn
    private int pid;
    private String place;
    private int price;
    @OneToOne(targetEntity=Destination.class,cascade=CascadeType.ALL)
    private Destination distination;
    public int getPid() {

        return pid;
    }
    public void setPid(int pid) {

        this.pid = pid;
    }

    public String getPlace() {

        return place;
    }

    public void setPlace(String place) {

        this.place = place;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public Destination getDistination() {
        return distination;
    }

    public void setDistination(Destination distination) {
        this.distination = distination;
    }
}
