import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

  @Test
  public void testAddFirstAndToString() {
    LinkedList<String> list = new LinkedList<String>();
    assertEquals("[]", list.toString());
    list.addFirst("Y");
    assertEquals("[Y]", list.toString());
    list.addFirst("M");
    assertEquals("[M, Y]", list.toString());
    list.addFirst("A");
    list.addFirst("G");
    assertEquals("[G, A, M, Y]", list.toString());
  }

  @Test
  public void testIsSortedWhenSizeIsFive_() {
    LinkedList<String> list = new LinkedList<String>();
    //  assertTrue(list.isSorted());
    list.addFirst("Y");
    list.addFirst("M");
    list.addFirst("G");
    list.addFirst("A");
    assertEquals("[A, G, M, Y]", list.toString());
  }

  @Test
  public void testAddInOrderWithSizeAndTostring() {
    LinkedList<Integer> list = new LinkedList<Integer>();
    assertEquals(0, list.size());
    list.addInOrder(99);
    assertEquals(1, list.size());
    list.addInOrder(0);
    assertEquals(2, list.size());
    list.addInOrder(50);
    assertEquals(3, list.size());
    list.addInOrder(-99);
    list.addInOrder(87);
    list.addInOrder(87);
    assertEquals(6, list.size());
    assertEquals("[-99, 0, 50, 87, 87, 99]", list.toString());
  }

  @Test
  public void testIndexOf() {
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.addInOrder(5);
    list.addInOrder(7);
    list.addInOrder(9);
    list.addInOrder(12);
    assertEquals(0, list.indexOf(5));
    assertEquals(1, list.indexOf(7));
    assertEquals(2, list.indexOf(9));
    assertEquals(3, list.indexOf(12));
  }

  @Test
  public void testIndexOf2() {
    LinkedList<String> list = new LinkedList<String>();
    list.addInOrder("A");
    list.addInOrder("B");
    list.addInOrder("C");
    list.addInOrder("D");
    list.addInOrder("E");
    assertEquals(0, list.indexOf("A"));
    assertEquals(2, list.indexOf("C"));
    assertEquals(4, list.indexOf("E"));
    assertEquals(-1, list.indexOf("No"));
  }

  @Test
  public void testReverse() {
    LinkedList<String> list = new LinkedList<String>();
    
    // Test when the list is empty
    assertEquals("[]", list.toString());
    list.reverse();
    assertEquals("[]", list.toString());
       
    list.addInOrder("X");
    list.addInOrder("A");
    list.addInOrder("C");
    list.addInOrder("B");
    list.addInOrder("Y");
    assertEquals("[A, B, C, X, Y]", list.toString());
    list.reverse();
    assertEquals("[Y, X, C, B, A]", list.toString());
  }

  @Test
  public void testRemoveAll() {
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.addInOrder(8);
    list.addInOrder(2);
    list.addInOrder(8);
    list.addInOrder(3);
    list.addInOrder(8);
    assertEquals("[2, 3, 8, 8, 8]", list.toString());
    list.removeAll(8);
    assertEquals("[2, 3]", list.toString());
  }

  @Test
  public void testRemoveAllWithStrings() {
    LinkedList<String> list = new LinkedList<String>();
    list.removeAll("B"); // get code coverage for empty lists
    list.addFirst("B");
    list.addFirst("A");
    list.addFirst("B");
    assertEquals("[B, A, B]", list.toString());
    list.removeAll("B");
    assertEquals("[A]", list.toString());
  }

  @Test
  public void testRemoveAllWhenAtFront() {
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.addInOrder(8);
    list.addInOrder(2);
    list.addInOrder(9);
    list.addInOrder(2);
    list.addInOrder(7);
    list.addInOrder(2);
    assertEquals(6, list.size());
    assertEquals("[2, 2, 2, 7, 8, 9]", list.toString());
    list.removeAll(2);
    assertEquals(3, list.size());
    assertEquals("[7, 8, 9]", list.toString());
  }

  @Test
  public void testRemoveAllWhenThereIsOnlyTheFirst() {
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.addInOrder(8);
    list.addInOrder(8);
    assertEquals("[8, 8]", list.toString());
    list.removeAll(8);
    assertEquals(0, list.size());
    assertEquals("[]", list.toString());
  }
  
  
  @Test
  public void remove(){
	  LinkedList<String> list = new LinkedList<String>();
	  list.addFirst("Y");
	  list.addFirst("Y");
	  list.addFirst("X");
	  assertEquals("[X, Y, Y]", list.toString());
	  list.removeAll("X");
	  assertEquals("[Y, Y]", list.toString());
	  
  }
  
  
}