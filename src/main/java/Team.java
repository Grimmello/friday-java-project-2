import java.util.*;

public class Team {
  private String mTeamName;
  private String mProjectName;
  private String mProgramLanguage;
  private List<String> mTeamMembers;

  public Team(String teamName, String projectName, String programLanguage) {
    mTeamName = teamName;
    mProjectName = projectName;
    mProgramLanguage = programLanguage;
    mTeamMembers = new ArrayList<String>();
  }
}
