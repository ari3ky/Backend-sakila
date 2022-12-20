package UIELEMENTS.Game;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.ResourceAccessException;
import org.yaml.snakeyaml.events.Event;

@ScenarioScope

public class ShowSingleActorStepDef {
    @Autowired
    ActorRepository actorRepository;

    long actorID;
    Actor chosenActor;
    @Given("an actor exists with id {int}")

    public void an_actor_exists_with_id (long id) {
        actorID = id;
        actorRepository.findById(id)
                .orElseThrow(() -> new ResourceAccessException("Actor ID does not exist" + actorID));


    }
    @When("i request an actors details")

    public void i_request_an_actors_details() {
        chosenActor = actorRepository.findById(actorID)
                .orElseThrow(() -> new ResourceAccessException("Actor ID does not exist" + actorID));
        Assertions.assertNotEquals(null, chosenActor, "Actor was not retrieved");
    }
    @Then("the webpage should show the actors {string} and {string}")

    public void the_webpage_should_show_the_actors_firstname_and_lastname(String firstname, String lastname){
        String correctDetails = firstname + " " + lastname;
        String testDetails = chosenActor.getFirstname() + " " + chosenActor.getLastname();
        Assertions.assertEquals(correctDetails, testDetails, "Actor details do not match");

        //Actor testActor = mock(Actor.class);
       // when(testActor.getFirstName()).thenReturn(first);
       // when(testActor.getLastName()).thenReturn(last);

    }



}
