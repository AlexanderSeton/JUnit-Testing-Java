import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear1;
    Bear bear2;

    @Before
    public void before() {
        bear1 = new Bear("Baloo", 7, 95.62, 'm');
        bear2 = new Bear("Whinnie The Pooh", 7, 69.62, 'f');
    }

    @Test
    public void hasName() {
        assertEquals("Baloo", bear1.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(7, bear1.getAge());
    }

    @Test
    public void hasWeight() {
        assertEquals(95.62, bear1.getWeight(), 0.0);
    }

    @Test
    public void hasSex() {
        assertEquals('m', bear1.getSex());
    }

    @Test
    public void canSetName() {
        bear1.setName("Balu");
        assertEquals("Balu", bear1.getName());
    }

    @Test
    public void canSetAge() {
        bear1.setAge(8);
        assertEquals(8, bear1.getAge());
    }

    @Test
    public void canSetWeight() {
        bear1.setWeight(96.45);
        assertEquals(96.45, bear1.getWeight(), 0.0);
    }

    @Test
    public void ReadyToHibernateIfWeightGreaterThan80() {
        assertEquals(true, bear1.readyToHibernate());
    }

    @Test
    public void NotReadyToHibernateIfWeightLessThan80() {
        assertEquals(false, bear2.readyToHibernate());
    }

}
