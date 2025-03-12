import java.util.ArrayList;
public class MemberInfo {
    private String name;
    private int gradYear;
    public boolean hasGoodStanding;
    
    public Memberinfo(String n, int g, boolean gs) {
        name = n;
        gradYear = g;
        hasGoodStanding = gs;
    }

    public int getGradYear() {
        return gradYear;
    }

    public boolean inGoodStanding() {
        return hasGoodStanding;
    }
}