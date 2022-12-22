package UIELEMENTS.Game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;


import java.util.ArrayList;
import java.util.Optional;

@SpringBootApplication
@RestController
@RequestMapping("/home")
@CrossOrigin
public class GameApplication {

	@Autowired
	private ActorRepository actorRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private FilmRepository filmRepository;

	@Autowired
	private FilmActorRepository filmActorRepository;

	@Autowired
	public GameApplication(ActorRepository ar, CategoryRepository cr, FilmRepository fr) {
		actorRepository = ar;
		categoryRepository = cr;
		filmRepository = fr;
	}


	public static void main(String[] args) {
		SpringApplication.run(GameApplication.class, args);
	}

	@GetMapping("/allactors")
	public @ResponseBody Iterable<Actor> getAllActors() {
		return actorRepository.findAll();
	}

	@GetMapping("/getActor/{actorID}")
	public @ResponseBody
	ArrayList<Actor> getActorByID(@PathVariable("actorID") long actorID) {
		ArrayList<Actor> actors = new ArrayList<Actor>();
		Actor actor = actorRepository.findById(actorID)
				.orElseThrow(() -> new ResourceAccessException("Actor ID does not exist" + actorID));
		actors.add(actor);
		return actors;
	}

	@PutMapping("/putActor/{actorID}")
	public ResponseEntity<Actor> updateActor(@PathVariable long actorID, @RequestBody Actor actorDetails) {
		Actor updateActor = actorRepository.findById(actorID)
				.orElseThrow(() -> new ResourceAccessException("Actor not exist with id: " + actorID));

		updateActor.setActorid(actorDetails.getActorid());
		updateActor.setFirstname(actorDetails.getFirstname());
		updateActor.setLastname(actorDetails.getLastname());


		actorRepository.save(updateActor);

		return ResponseEntity.ok(updateActor);
	}

	@GetMapping("/allcategories")
	public @ResponseBody Iterable<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	@GetMapping("/getCategory/{categoryID}")
	public @ResponseBody
	ArrayList<Category> getCategoryByID(@PathVariable("categoryID") int categoryID) {
		ArrayList<Category> categorys = new ArrayList<Category>();
				Category category = categoryRepository.findById(categoryID)
				.orElseThrow(() -> new ResourceAccessException(("Category ID does not exist in: ") + categoryID));
				categorys.add(category);
		return categorys;

	}

	@PutMapping("/putCategory/{categoryID}")
	public ResponseEntity<Category> updateCategory(@PathVariable int categoryID, @RequestBody Category categoryDetails) {
		Category updateCategory = categoryRepository.findById(categoryID)
				.orElseThrow(() -> new ResourceAccessException("Actor not exist with id: " + categoryID));

		updateCategory.setCategoryid(categoryDetails.getCategoryid());
		updateCategory.setCategoryname(categoryDetails.getCategoryname());


		categoryRepository.save(updateCategory);

		return ResponseEntity.ok(updateCategory);
	}

	@GetMapping("/allfilms")
	public @ResponseBody Iterable<Film> getAllFilms() {
		return filmRepository.findAll();
	}

	@GetMapping("/getFilm/{filmID}")
	public @ResponseBody
		ArrayList<Film> getFilmByID(@PathVariable("filmID") int filmID) {
		ArrayList<Film> films = new ArrayList<Film>();
		Film film = filmRepository.findById(filmID)
					.orElseThrow(() -> new ResourceAccessException("Film ID does not exist" + filmID));
			films.add(film);
			return films;
	}

	@GetMapping("/allfilms_actors")
	public @ResponseBody Iterable<Film_ActorIntf> getAllFilm_Actors() {
		return filmRepository.getAll();
	}

	@GetMapping("/allfilms_actors/{id}")
	public @ResponseBody Iterable<Film_ActorIntf> getAllFilmsActorByID(@PathVariable int id) {
		return (Iterable<Film_ActorIntf>) filmRepository.getFilm_ActorByID(id);
	}

	@GetMapping("/allfilms_cat/{id}")
	public @ResponseBody Iterable<FilmCatIntf> getAllFilmCatByID(@PathVariable int id) {
		return (Iterable<FilmCatIntf>) filmRepository.getFilm_CatByID(id);
	}

	@GetMapping("/allfilms_desc/{desc}")
	public @ResponseBody Iterable<Film> getFilmDesc(@PathVariable String desc) {
		return (Iterable<Film>) filmRepository.getFilmBy_Desc(desc);
	}

	@GetMapping("/allfilms_name/{name}")
	public @ResponseBody Iterable<Film> getFilmName(@PathVariable String name) {
		return (Iterable<Film>) filmRepository.getFilmBy_Name(name);
	}

	@PutMapping("/putFilm/{filmID}")
	public ResponseEntity<Film> updateFilm(@PathVariable int filmID, @RequestBody Film filmDetails) {
		Film updateFilm = filmRepository.findById(filmID)
				.orElseThrow(() -> new ResourceAccessException("Film does not exist with id: " + filmID));

		updateFilm.setFilmid(filmDetails.getFilmid());
		updateFilm.setTitle(filmDetails.getTitle());
		updateFilm.setDescription(filmDetails.getDescription());
		updateFilm.setRelease_Year(filmDetails.getRelease_Year());
		updateFilm.setLanguage_ID(filmDetails.getLanguage_ID());
		updateFilm.setRental_Duration(filmDetails.getRental_Duration());
		updateFilm.setRental_Rate(filmDetails.getRental_Rate());
		updateFilm.setLength(filmDetails.getLength());
		updateFilm.setReplacement_Cost(filmDetails.getReplacement_Cost());
		updateFilm.setRating(filmDetails.getRating());
		updateFilm.setSpecial_Features(filmDetails.getSpecial_Features());
		updateFilm.setLast_Update(filmDetails.getLast_Update());

		filmRepository.save(updateFilm);

		return ResponseEntity.ok(updateFilm);
	}

	@DeleteMapping("/deleteActor/{actorID}")
	public void deleteActor(@PathVariable long actorID) {
		Actor actor = actorRepository.findById(actorID)
				.orElseThrow(() -> new ResourceAccessException("Actor does not exist with ID: " + actorID));
		actorRepository.deleteById(actorID);
	}

	@PostMapping("/actors")
	public ResponseEntity<Actor> createActor(@RequestBody Actor actor) {
		Actor actor1 = actor;
		//int id, String firstname, String lastname
		Actor actor2 = actorRepository.save(actor);
		return ResponseEntity.ok(actor1);
	}
}









