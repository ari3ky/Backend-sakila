package UIELEMENTS.Game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


class GameApplicationTests {

	@Test
	public void testGettersAndSetters(){
		Actor actor1 = new Actor();
		actor1.setActorid(5);
		Assertions.assertEquals(5,actor1.getActorid(), "Actor id error");
		actor1.setFirstname("Firstnametest");
		Assertions.assertEquals("Firstnametest",actor1.getFirstname(), "First name error");
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
//		film1.set("Lastnametest");
//		Assertions.assertEquals("Lastnametest",film1.getLastname(), "Last name error");
	}


}
