import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testLen() {

      LinkedList list = new LinkedList();
      list.append(1);
      list.append(2);
      list.append(3);
      list.append(4);


      
      assertEquals(4, list.length());
    }

    // @Test
    // public void testReverseInPlaceCorre() {

    //   LinkedList list = new LinkedList();
    //   list.append(1);
    //   list.append(2);
    //   list.append(3);
    //   list.append(4);
      
    //   assertEquals("1234", list.toString());
    // }



  }


