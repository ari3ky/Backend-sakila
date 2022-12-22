package UIELEMENTS.Game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;


class GameApplicationTests {

	@Test
	public void testActorGettersAndSetters(){
		Actor actor1 = new Actor();
		actor1.setActorid(5);
		Assertions.assertEquals(5,actor1.getActorid(), "Actor id error");
		actor1.setFirstname("Firstnametest");
		Assertions.assertEquals("Firstnametest",actor1.getFirstname(), "First name error");
		actor1.setLastname("Lastnametest");
		Assertions.assertEquals("Lastnametest",actor1.getLastname(), "Last name error");
		actor1.setLastname("Lastnametest");
		Assertions.assertEquals("Lastnametest",actor1.getLastname(), "Last name error");

	}

	@Test
	public void testFilmGettersAndSetters(){
		Film film1 = new Film();
		film1.setFilmid(5);
		Assertions.assertEquals(5,film1.getFilmid(), "Actor id error");
		film1.setTitle("Title1");
		Assertions.assertNotEquals("Title",film1.getTitle(), "Title error");
		film1.setDescription("Description");
		Assertions.assertEquals("Description",film1.getDescription(), "Description error");
		film1.setRelease_Year(new Date(2006-02-15));
		Assertions.assertNotEquals(2006-02-15,film1.getRelease_Year(), "Release Year error");
		film1.setLanguage_ID(1);
		Assertions.assertNotEquals("Languagetest",film1.getLanguage_ID(), "Language ID error");
		film1.setRental_Duration(2);
		Assertions.assertNotEquals("RentalDurationtest",film1.getRental_Duration(), "Rental duration error");
		film1.setRental_Rate(3);
		Assertions.assertNotEquals("RentalRatetest",film1.getRental_Rate(), "Rental rate error");
		film1.setLength(5);
		Assertions.assertEquals(5,film1.getLength(), "Length error");
		film1.setReplacement_Cost(15);
		Assertions.assertEquals(15,film1.getReplacement_Cost(), "Replacement cost error");
		film1.setRating("PG");
		Assertions.assertEquals("PG",film1.getRating(), "Rating error");
		film1.setSpecial_Features("Deleted Scenes");
		Assertions.assertEquals("Deleted Scenes",film1.getSpecial_Features(), "Special features error");
		film1.setLast_Update(new Date());
		Assertions.assertNotEquals(2006-02-15,film1.getLast_Update(), "Last update error");



	}

	@Test
	public void testCategoryGettersAndSetters(){
		Category category1 = new Category();
		category1.setCategoryid(2);
		Assertions.assertEquals(2,category1.getCategoryid(), "Category ID error");
		category1.setCategoryname("Action");
		Assertions.assertEquals("Action",category1.getCategoryname(), "Category name error");
		category1.setLastupdate(new Date());
		Assertions.assertNotEquals(2008,category1.getLastupdate(), "Date error");

	}


}
