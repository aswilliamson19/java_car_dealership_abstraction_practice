import org.junit.Before;
import org.junit.Test;
import people.Manager;
import people.Salesperson;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;
    Salesperson salesperson;
    Salesperson salesperson1;

    @Before
    public void before() {
        manager = new Manager("Bob");
        salesperson = new Salesperson("Simon", 600, 10);
        salesperson1 = new Salesperson("Allan", 1500, 4);
        manager.addStaffMember(salesperson);
        manager.addStaffMember(salesperson1);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void addStaffMemberToTeam() {
        assertEquals(2, manager.countTeam());
    }

    @Test
    public void isInStaffMemberList() {
        assertEquals(salesperson, manager.getTeamMember("Simon"));
    }

    @Test
    public void canPickAnEmployeeOfTheMonth(){
        assertEquals(salesperson, manager.getEmployeeOfTheMonth());
    }
}
