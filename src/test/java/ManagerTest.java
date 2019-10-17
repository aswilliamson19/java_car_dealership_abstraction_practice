import org.junit.Before;
import org.junit.Test;
import people.Manager;
import people.Salesperson;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;
    Salesperson salesperson;

    @Before
    public void before() {
        manager = new Manager("Bob");
        salesperson = new Salesperson("Simon", 600, false, 6);
        manager.addStaffMember(salesperson);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void addStaffMemberToTeam() {
        assertEquals(1, manager.countTeam());
    }

    @Test
    public void isInStaffMemberList() {
        assertEquals(salesperson, manager.getTeamMember("Simon"));
    }
}
