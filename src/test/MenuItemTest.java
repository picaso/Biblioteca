package test;


import main.MenuItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: Osaide Ogbeifun
 * Date: 1/15/12
 * Time: 1:59 PM
 * To change this template use File | Settings | File Templates.
 */

@RunWith(Parameterized.class)
public class MenuItemTest {
    private String item = "";
    private int id = 0;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = Parameter.MOCK_MENUITEM;
        return Arrays.asList(data);
    }

    public MenuItemTest(int id, String item) {
        this.item = item;
        this.id = id;
    }



    @Test
    public void testGetQuestionID() throws Exception {
        MenuItem menuitem = new MenuItem(id, item);
        assertEquals(menuitem.getQuestionID(), id);

    }

    @Test
    public void testGetQuestion() throws Exception {
        MenuItem menuitem = new MenuItem(id, item);
        assertEquals(item, menuitem.getQuestion());

    }
}
