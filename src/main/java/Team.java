import java.util.*;

public class Team {
  private String mTeamName;
  private String mProjectName;
  private String mProgramLanguage;
  private int mID;
  private List<Member> mTeamMembers;
  public static List<Team> allTeams = new ArrayList<Team>();

  public Team(String teamName, String projectName, String programLanguage) {
    mTeamName = teamName;
    mProjectName = projectName;
    mProgramLanguage = programLanguage;
    mTeamMembers = new ArrayList<Member>();
    allTeams.add(this);
    mID = allTeams.size();
  }

  public String getTeamName() {
    return mTeamName;
  }

  public String getProjectName() {
    return mProjectName;
  }

  public String getProgramLanguage() {
    return mProgramLanguage;
  }

  public int getID() {
    return mID;
  }

  public static Team find(int id) {
   try {
     return allTeams.get(id - 1);
    } catch (IndexOutOfBoundsException exception) {
     return null;
    }
  }

  public static List<Team> getAll() {
    return allTeams;
  }

  public List<Member> getTeamMembers () {
    return mTeamMembers;
  }

  public void addTeamMember(Member member) {
    mTeamMembers.add(member);
  }

  public static void clearList() {
    allTeams.clear();
  }
}
