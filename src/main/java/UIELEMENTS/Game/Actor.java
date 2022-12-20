package UIELEMENTS.Game;

import jakarta.persistence.*;

@Entity
@Table(name="actor")

public class Actor {
    @Id //basically the primary key for this class attribute
    @Column(name="actor_id")
    @GeneratedValue(strategy=GenerationType.TABLE)
    private long actorid;

    @Column(name="first_name")
    String firstname;

    @Column(name="Last_name")
    String lastname;

    public long getActorid() {
        return actorid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setActorid(long actorid) {
        this.actorid = actorid;
    }


   }
