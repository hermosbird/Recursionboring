/**
 * Complete all methods to recursive solutions
 */
public class LinkedList<E extends Comparable<E>> {

  private class Node {
    private E data;
    private Node next;

    public Node(E element) {
      data = element;
      next = null;
    }

    public Node(E element, Node nextRef) {
      data = element;
      next = nextRef;
    }
  }

  private Node first;

  public LinkedList() {
    first = null;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public void addFirst(E element) {
    first = new Node(element, first);
  }

  @Override
  // Return a textual version of this list using recursion, no loops
  public String toString() {
    Node ref=first;
    String s="";

    	
    	s= string(ref);
  
    return "["+s+"]";
  }
  private String string(Node p){
	  if(p==null){
		  return "";
	  }
	  else if(p.next==null){
		  return (String) p.data;
	  }
	  else{
	  return (String) p.data+", "+string(p.next);}
	  

  }

  // Return the index of first (closest to first) element that equals el
  public int indexOf(E el) {
    // TODO: Implement this method using a private helper
    return -99;
  }

  // Add an element to this list in its natural location.  This method 
  // keeps elements sorted according to the type E's compareTo method.
  public void addInOrder(E element) {
    Node ref=first;
    
    
  }

  // Return the number of elements in this list. This runs O(n).  
  // Do not add a variable n to track the size of this list.
  public int size() {
    // TODO: Implement this method using a private helper
    int n=0;
    Node ref=first;
    while(ref.next!=null){
    	n++;
    	ref=ref.next;
    }
	  return n;
  }

  // Remove all elements in this list that equals el
  public void removeAll(E el) {
	  remove(first,el);
  
  }
  private void remove(Node ref,E el){
	  if(ref==null)
		  return;
	  else if(el.equals(first.data)){
		  first=first.next;
		  
	  }
	  else if(el.equals(ref.next.data)){
		  ref.next=ref.next.next;
		  
	  }
	  remove(ref.next,el);
  }

  public void reverse() {
	  return;
  }
  

  
  
  
}