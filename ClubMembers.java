import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    public ClubMembers(ArrayList<MemberInfo> memberList) {
        this.memberList = memberList;
    }

    public void addMembers(String[] names, int gradYear) {
        for (int i = 0; i<names.length; i++) {
            memberList.add(
                new MemberInfo(names[i], gradYear, true));
        }
    }

    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> arr = new ArrayList<MemberInfo>();
        for (int i = 0; i< memberList.size(); i++) {
            if (memberList.get(i).inGoodStanding() && memberList.get(i).getGradYear() <= year) {
                arr.add(memberList.get(i));
            }
            if (memberList.get(i).getGradYear() <= year) {
                memberList.remove(i);
                i--;
            }
        }
        return arr;
    }

    public String toString() {
        String out = "";
        for (MemberInfo item: memberList) {
            out+= item.getName() + ", " + item.getGradYear() + ", " + item.inGoodStanding();
            out+= "\n";
        }
        return out;
    }
}