class Node
{
  int elem;
  Node next;
}

public class LinkedList
{
  Node front;
  Node rear;
  int count;
  
  LinkedList()
  {
    front = null;
    rear = null;
    count = 0;
  }
  
  boolean isEmpty()
  {
    return front == null && rear == null;
  }
  
  void display()
  {
    if (count == 0)
    {
      System.out.println("[Empty]");
    }
    else
    {
    Node temp = front;
    while(temp != null)
    {
      System.out.print(temp.elem);
      System.out.print(", ");
      temp = temp.next; 
    }
    System.out.println("");
    }
  }
  
  void addRear(int e)
  {
    if (isEmpty())
    {
      Node temp = new Node();
      temp.elem = e;
      front = temp;
      rear = temp;
    }
    else
    {
      Node temp = new Node();
      temp.elem = e;
      rear.next = temp;
      rear = rear.next;
    }
    count++;
  }
  
  void insertNode(int pos, int e)
  {
    if (pos < 0 || pos > count-1) //Out of range
    {
      System.out.println("Out of range error!\n");
    }
    else
    {
      Node temp = front;
      for(int i = 0; i < pos-2; i++)
      {
        temp = temp.next; 
      }
      Node oldNext = temp.next;
      Node newNode = new Node();
      newNode.elem = e;
      temp.next = newNode;
      newNode.next = oldNext;
      count++;
    }
  }
  
  int deleteRear()
  {
    if (isEmpty())
    {
      return -1; 
    }
    else if (count == 1)
    {
      int elRet = front.elem;
      //delete front;
      front = null;
      rear = null;
      count--;
      return elRet;
    }
    else
    {
      Node temp = front;
      while(temp.next != rear)
      {
        temp = temp.next; 
      }
      int elRet = rear.elem;
      temp.next = null;
      //delete rear;
      rear = temp;
      count--;
      return elRet;
    }
  }
  
}
