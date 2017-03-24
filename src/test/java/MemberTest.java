import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @After
  public void tearDown() {
    Member.clearList();
  }

  @Test
  public void MemberItem_instantiatesCorrectly_true() {
    Member myMember = new Member("John");
    assertEquals(true, myMember instanceof Member);
  }

  @Test
  public void all_returnsAllInstancesOfMember_true() {
    Member firstMember = new Member("John");
    Member secondMember = new Member("Jack");
    assertEquals(true, Member.all().contains(firstMember));
    assertEquals(true, Member.all().contains(secondMember));
  }

  @Test
  public void clear_emptiesAllMembersFromArrayList_0() {
    Member myMember = new Member("John");
    Member.clearList();
    assertEquals(Member.all().size(), 0);
  }
  // test if assigning id is working
  @Test
  public void getId_MembersInstantiateWithAnID_1() {
    Member myMember = new Member("John");
    assertEquals(1, myMember.getID());
  }
  //
  @Test
  public void find_returnsTaskWithSameId_secondTask() {
    Member firstMember = new Member("John");
    Member secondMember = new Member("Jack");
    assertEquals(Member.find(secondMember.getID()), secondMember);
  }
}
