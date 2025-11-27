import java.util.*;

class DoublyLinkedList{
private class Node{
int data;
Node prev;
Node next;
Node(int data){
this.data=data;
}
}
private Node head;

public void add(int data){
 Node newNode=new Node(data);
 if(head==null){
 head=newNode;
 return;
 }
  Node current=head;
  while(current.next!=null)
  {
   current=current.next;
   }
   current.next=newNode;
   newNode.prev=current;
}


public boolean delete(int data){
  Node current=head;
  while(current!=null){
  if(current.data==data){
  if(current==head)
  {
   head=current.next;
   if(head!=null){
   head.prev=null;
}
}
else
{
current.prev.next=current.next;
if(current.next!=null){
current.next.prev=current.prev;
}
}
return true;
}
current=current.next;
}
return false;
}


public void display(){
Node current=head;

if(current==null){
System.out.println("List is empty.");
return;
}

System.out.println("Doubly Linked List:");
while(current!=null)
{
System.out.print(current.data+" ");
current=current.next;
}
System.out.println();
}



public static void main(String[] args)
 {

DoublyLinkedList dll=new DoublyLinkedList();

dll.add(10);
dll.add(20);
dll.add(30);
dll.add(40);
dll.add(50);

System.out.println("original List:");
dll.display();

int elementToDelete=30;
if(dll.delete(elementToDelete)){
System.out.println("after deleting element"+ elementToDelete +":");
dll.display();
}
else{
 System.out.println("element"+elementToDelete+"not found in list");
 }
 }
 }