//import java.util.*;
public class SortedDoublyLinkedList
implements LinkedList{

class Node{
  public Node next=null;
  public Node prev=null;
  public Warrior W;
  public Node(Warrior Brave){
    this.W=Brave;
  }
}
public Node head;
public Node tail;
private int count;

 public void insert(Warrior person){
   Node newNode= new Node(person);
   if(count==0){
     head =newNode;
     tail= newNode;

   }
  else if(head.W.getSpeed()<newNode.W.getSpeed()){
     newNode.next=head;
     head.prev=newNode;
     head=newNode;

   }

   //int c=0;
   else
   {Node current=this.head;
     Node save=null;
   while((current!=null)&&(current.W.getSpeed()>=newNode.W.getSpeed())){
     //System.out.println(current.W.getName());
     save=current; //saving the intermediate greater object in the list
    current=current.next; //next comparing element
     //System.out.println(current.W.getName());
    //System.out.println(count);
//c++;
     }
     Node temp=current;
     current=newNode; //replacing the position of the smaller element
     //System.out.println(current.W.getName());
     current.prev=save; //previous element is in the save is assigned to new element's previous node
     save.next=current; //next element of old element is new element.
     //System.out.println(current.prev.W.getName());
     //System.out.println(temp);
     current.next=temp;} //temp is another old element which is smaller than new element or null.
     //It is now assigned to the next node of new element.
     count++;
   }
  /* int velocity=person.getSpeed();
   Node newnode= new Node;
   Node tempnode=new Node;
   newnode.value=person.getSpeed();
   if(velocity>start.value){
     tempnode=start;
     start=newnode;
     start.next=tempnode;
     }
     if(start.value==null){
       start.value=person.getSpeed();
     }
     Node current= new Node;
     if(velocity<start.value){

       if(start.next<velocity){

       }
     }*/
     public String toString(){
       Node current=this.head;
       String statement;
       //int count=0;
       statement="[ ";
       while(current!=null){
       //current=current.next;
      // System.out.println(current.W.getHp()+ "jake");
       statement=statement+current.W.getName()+"("+current.W.getSpeed()+") ";
       current=current.next;

}
statement=statement+"]";
return statement;
     }

 }
