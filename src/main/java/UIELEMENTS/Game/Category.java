package UIELEMENTS.Game;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="category")

public class Category {
    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int categoryid;
    @Column(name = "name")
    String categoryname;
    @Column(name = "lastUpdate")
    Date lastupdate;

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

//    public Date getLastupdate() {
//        return lastupdate;
//    }
//
//    public void setLastupdate(Date lastupdate) {
//        this.lastupdate = lastupdate;
//    }
}

