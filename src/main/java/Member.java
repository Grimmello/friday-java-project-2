import java.util.*;

public class Member {
  private String mMemberName;
  private int mMemberID;
  private List<Member> mAllMembers = new ArrayList<Member>();

  public Member(String memberName) {
    mMemberName = memberName;
    mAllMembers.add(this);
    mMemberID = mAllMembers.size();
  }
  public String getMemberName() {
    return mMemberName;
  }
  public int getMemberID() {
    return mMemberID;
  }
}
