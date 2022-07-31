package org.example;

import javax.persistence.*;

@Entity
@Table(name="tablet")
public class Tablet {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int id;
    private String tname;
    private int price;
    private String purpose;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
