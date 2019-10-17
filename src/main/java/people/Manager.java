package people;

import java.util.ArrayList;

public class Manager extends Person {

    private ArrayList<Salesperson> team;

    public Manager(String name) {
        super(name);
        this.team = new ArrayList<Salesperson>();
    }


    public Salesperson getTeamMember(String name) {
        for (Salesperson staffMember : this.team) {
            if (staffMember.getName() == name) {
                return staffMember;
            }
        }
        return null;
    }

    public void addStaffMember(Salesperson staffMember) {
        this.team.add(staffMember);
    }

    public int countTeam() {
        return this.team.size();
    }
}
