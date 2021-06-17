

class Node {
	int data;
	Node next; //self referntial structure

}
class LinkedList {
	Node head;
	
	public void insert(int data)        //insert at end
	{
		Node node=new Node();          //create a new node
		node.data=data;                //assign data
		node.next=null;               //assign null
		
		if(head==null) 
		{
			head=node;
		}
		else
		{   
			Node n=head;              //for traverse
			while(n.next!=null)       //check n.next is null or not
			{
				n=n.next;             //n points to next node
			}
			n.next=node;              //if null, n.next points to node
		}
	}
	public void insertAt(int index,int data)     //insert at in between
	{
		Node node = new Node();                  //new node
		node.data = data;
		node.next = null;
		
		if(index==0)
		{
			insertAtStart(data);
		}
		else{
		Node n = head;              
		for(int i=0;i<index-1;i++)
		{
			n = n.next;                   //n points to next (node)
		}
		node.next = n.next;                //this node points to which next points
		n.next = node;                      //next points to this node
		}
	}
	
	public void insertAtStart(int data)    //insert at start
	{
		Node node=new Node();              //new node
		node.data=data;
		node.next=null;
		node.next=head;                   //node.next points to which head points
		head=node;                        //head points to this node
	}
	
	public void deleteList() {
		head=null;
	}
	
	public void deleteAt(int index)
	{
		if(index==0)
		{
			head=head.next;
			
		}
		else
		{
			Node n=head;              
			Node n1=null;
			for(int i=0;i<index-1;i++)  
			{
				n=n.next;                  //n points to next node
			}
			n1=n.next;
			n.next=n1.next;                //this node points to which next points
			n1=null;                       //it is eligible fir garbage collection
		}
	}
	public void reverse()
	{
		Node n=null;
		Node prev=null;
		Node curr=head;
		
		while(curr!=null)
		{
			n=curr.next;
			curr.next=prev;
			prev=curr;
			curr=n;
		}
		head=prev;
	}
	/*public void evenodd()
	{
		Node n=head;
		int x=show();
		for(int i=0;i<=x;i++)
		{
			if(n.data%2==0)
			{
				System.out.print("Even No."+n.data+" ");
				
			}
			else
			{
				System.out.println("Odd No."+n.data);
			}
			n=n.next;
		}*/
	public void toFindOddEven()
	{
		Node n = head ;
		Node m = head ;
		int cnt1 = 1 ;
		int cnt2 = 1;
		while(n!=null)
		{
			if(cnt1 % 2 == 1)
				System.out.print("Odd pos : "+n.data+" ");
			
			n=n.next;
			cnt1++;
		}

		System.out.println();
		while(m != null)
		{			
			if (cnt2 % 2 == 0)
			{
				System.out.print("Even pos : "+m.data+" ");
			}
			m=m.next;
			cnt2++;				 
		}	
	}	
	
	
	
	public void show()
	{
		//int count=0;
	
		Node node=head;                                  //reference for traverse
		while(node.next!=null)                          // prints till n!=null
		{
			System.out.print(node.data + " ");
			node=node.next;                            //node points to next(node)
			//count++;
		}
		System.out.print(node.data + " ");
		//return count;
	}
}
public class EvenOdd {

	public static void main(String[] args) {
		LinkedList list =new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(5);
		list.insert(6);
		list.insert(10);
		//list.insert(100);
		list.insertAt(1,30);
		list.insertAtStart(101);	
		//list.deleteAt(5);	
		list.show();
		System.out.println();
		list.reverse();
		System.out.println("Reverse LinkedList: ");
		list.show();
		System.out.println();
		list.toFindOddEven();
		//list.show();
		
		
	}

}


