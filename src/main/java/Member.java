import java.util.*;

public class Member {
  private String mMemberName;
  private int mMemberID;
  private static List<Member> mAllMembers = new ArrayList<Member>();

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

  public static List<Member> all() {
    return mAllMembers;
  }

  public static void clearList() {
    mAllMembers.clear();
  }

  public int getID() {
    return mMemberID;
  }

  public static Member find(int id) {
    return mAllMembers.get(id - 1);
  }
}
