package org.example;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="medical")
public class Medical {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int id;
    private String mname;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="mid")
    @OrderColumn(name="type")
    private List<Tablet> tablets;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public List<Tablet> getTablets() {
        return tablets;
    }

    public void setTablets(List<Tablet> tablets) {
        this.tablets = tablets;
    }
}
