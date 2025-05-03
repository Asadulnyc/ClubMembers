import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MemberInfo> people = new ArrayList<MemberInfo>();
        people.add(new MemberInfo("SMITH, JANE", 2019, false));
        people.add(new MemberInfo("FOX, STEVE", 2018, true));
        people.add(new MemberInfo("XIN, MICHAEL", 2017, false));
        people.add(new MemberInfo("GARCIA, MARIA", 2020, true));

        ClubMembers a = new ClubMembers(people);
        System.out.println(a);

        System.out.println(a.removeMembers(2018));
        System.out.println(a);
    }
}