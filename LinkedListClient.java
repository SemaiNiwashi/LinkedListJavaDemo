public class LinkedListClient
{  
  public static void main(String[] args)
  {
    LinkedList a = new LinkedList();
    a.addRear(5);
    a.addRear(4);
    a.addRear(7);
    a.insertNode(2,9);
    a.display();
    a.deleteRear();
    a.display();
    a.deleteRear();
    a.display();
    a.deleteRear();
    a.display();
    a.deleteRear();
    a.display();
    int b = a.deleteRear();
    a.display();
    System.out.println(b);
  }
}
