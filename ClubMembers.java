import java.util.ArrayList;
public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    public void addMembers(String[] names, int gradYear) {
        for (String s : names) {
            memberList.add(new MemberInfo(s, gradYear, true));
        }
    }

    public ArrayList<MemberInfo> getMemberList() {
        return memberList;
    }

    public ArrayList<MemberInfo> removeMembers(int year) {
        return null;
    }    
}