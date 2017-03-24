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
  @Test
  public void all_returnsAllInstancesOfTeam_true() {
    Team firstTest = new Team("Test1","Test1","Test1");
    Team secondTest = new Team("Test2","Test2","Test2");
    assertEquals(true, Team.getAll().contains(firstTest));
    assertEquals(true, Team.getAll().contains(secondTest));
  }
  @Test
  public void clear_emptiesAllTeamsFromList_0() {
    Team testTeam = new Team("Test","Test","Test");
    Team.clearList();
    assertEquals(Team.getAll().size(), 0);
  }
}
