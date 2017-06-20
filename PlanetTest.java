import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class PlanetTest{
  Planet planet;

  @Before
  public void before(){
    planet = new Planet ("Kepler22b", 6371);
  }

  @Test
  public void planetName(){
    assertEquals("Kepler22b", planet.getName());
  }

  @Test
  public void planetSize(){
    assertEquals(6371, planet.getSize());
  }

  @Test
  public void boom(){
    assertEquals("Boom! Kepler22b has exploded.", planet.boom());
  }
}


