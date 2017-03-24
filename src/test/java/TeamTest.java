import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class TeamTest {
  @After
  public void clearEverything(){
    Team.clearList();
  }
  @Test
  public void team_instantiatesCorrectly_true() {
    Team testTeam = new Team("Test", "Test", "Test");
    assertEquals(true, testTeam instanceof Team);
  }
  @Test
  public void getName_teamInstantiatesWithName_Test() {
    Team testTeam = new Team("Test","Test", "Test");
    assertEquals("Test", testTeam.getTeamName());
  }
}
