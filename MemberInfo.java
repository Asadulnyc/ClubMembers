public class MemberInfo {
    String name;
    int  gradYear;
    boolean hasGoodStanding;

    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }

    public int getGradYear() {
        return gradYear;
    }

    public boolean inGoodStanding() {
        return hasGoodStanding;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.getName() + ", " + this.getGradYear() + ", " + this.inGoodStanding();
    }
}