import java.util.*;

public class Team {
  private String mTeamName;
  private String mProjectName;
  private String mProgramLanguage;
  private List<String> mTeamMembers;
  public List<Team> allTeams = new ArrayList<Team>();

  public Team(String teamName, String projectName, String programLanguage) {
    mTeamName = teamName;
    mProjectName = projectName;
    mProgramLanguage = programLanguage;
    mTeamMembers = new ArrayList<String>();
    allTeams.add(this);
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
  public static Team find(int id) {
   try {
     return allTeams.get(id - 1);
    } catch (IndexOutOfBoundsException exception) {
     return null;
    }
  }
  public List<String> getTeamMembers () {
    return mTeamMembers;
  }
  public void addTeamMember(Member member) {
    mTeamMembers.add(member);
  }
}
