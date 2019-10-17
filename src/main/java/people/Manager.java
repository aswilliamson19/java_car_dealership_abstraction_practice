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

    public Salesperson getEmployeeOfTheMonth() {
        int trophyCount = 0;
        Salesperson employeeOfTheMonth = null;
        for(Salesperson salesperson : this.team){
            if(salesperson.getTrophies() > trophyCount){
                trophyCount = salesperson.getTrophies();
                employeeOfTheMonth = salesperson;
            }
        }
        return employeeOfTheMonth;
    }
}
