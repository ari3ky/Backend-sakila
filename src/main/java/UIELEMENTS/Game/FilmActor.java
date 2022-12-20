package UIELEMENTS.Game;

import jakarta.persistence.*;

@Entity
@Table (name = "film_actor")
@IdClass(FilmActorId.class)


public class FilmActor {
    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "actor_id", referencedColumnName = "actor_id")
    Actor actor;
    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "film_id", referencedColumnName = "film_id")
    Film film;

    public FilmActor() {

    }




}
