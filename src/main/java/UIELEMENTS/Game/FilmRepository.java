package UIELEMENTS.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
    public interface FilmRepository extends JpaRepository<Film, Integer> {

    @Query(value = "SELECT film.film_id, film.title, actor.actor_id, actor.first_name, actor.last_name " +
            "from film " +
            "INNER JOIN film_actor ON film.film_id = film_actor.film_id " +
            "INNER JOIN actor ON film_actor.actor_id = actor.actor_id; ", nativeQuery = true)
    Iterable<Film_ActorIntf> getAll();

    @Query(value = "SELECT film.film_id, film.title, actor.actor_id, actor.first_name, actor.last_name " +
            "from film " +
            "INNER JOIN film_actor ON film.film_id = film_actor.film_id " +
            "INNER JOIN actor ON film_actor.actor_id = actor.actor_id " +
            "WHERE film.film_id = :film_search_id " , nativeQuery = true)
    Iterable<Film_ActorIntf> getFilm_ActorByID(@Param("film_search_id")int film_search_id);

    @Query(value = "SELECT film.title, category.name " +
            "from film " +
            "INNER JOIN film_category ON film.film_id = film_category.film_id " +
            "INNER JOIN category ON film_category.category_id = category.category_id " +
            "WHERE category.category_id = :category_search_id", nativeQuery = true)
    Iterable<FilmCatIntf> getFilm_CatByID(@Param("category_search_id")int category_search_id);


    @Query(value = "SELECT * " +
           "FROM film " +
           "WHERE film.description LIKE %:film_desc%", nativeQuery = true)
            Iterable<Film> getFilmBy_Desc(@Param("film_desc")String film_desc);
//
    @Query(value = "SELECT * " +
            "FROM film " +
            "WHERE film.title LIKE %:film_name%", nativeQuery = true)
    Iterable<Film> getFilmBy_Name(@Param("film_name")String film_name);





}

