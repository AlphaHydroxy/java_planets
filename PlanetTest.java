import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class PlanetTest{
  Planet planet;

  @Before
  public void before(){
    planet = new Planet ("Kepler", 6371);
  }

  @Test
  public void planetName(){
    assertEquals("Kepler", planet.getName());
  }

  @Test
  public void planetSize(){
    assertEquals(6371, planet.getSize());
  }

  @Test
  public void boom(){
    assertEquals("Boom! Kepler has exploded.", planet.boom());
  }
}


