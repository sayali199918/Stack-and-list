class stack
{

	int top=-1;
	int size;
	char arr[];
	char a[];
	stack(int length)
	{
		size =length;
		 arr= new char[size];
		
	}

	boolean isFull()
	{
		if(top==size-1)
			return true;
		return false;
	}
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		return false;
		
	}
	public void push(char x)
	{
		//System.out.println(size);
		if(isFull())
		{
			System.out.println("Stack is full");
		}
		else
		{
		
			top=top+1;
		arr[top] =x;
		
		}
	}
	public char pop()
	{   char x=' ';
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		
		else
		{
		
		x=arr[top];
		top--;
		
		}
		return x;
	}
	
	public void display()
	{
		isEmpty();
		for(int i=0;i<=top;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
	public void DeleteMid(int count)
	{   
		int n=count/2;
		 a =new char[n];
		for(int i=0;i<n;i++)
		{
			a[i]=pop();
			System.out.println(a[i]);     
		}
		pop();
	
		for(int i=a.length-1;i>=0;i--)
		{
			push(a[i]);
			
		}
		display();
	}
	
	public void MaxEle()
	{
		char max=0;
		for(int i=top;i>=0;i--)
		{
			if(max<arr[i])
			{
				max=arr[i];
				
			}
		}
		System.out.print("max is= "+max);
	}
	
	
}


public class stackreverse
{
	public static void main(String a[])
	{
//		System.out.println("enter a string");
//		Scanner sc=new Scanner();
//		sc.next();
		String str="Madam";
		int count=0;
		stack sd=new stack(str.length());
		
		for(int i=0;i<str.length(); i++)
		{
			
			char ptr=str.charAt(i);
			sd.push(ptr);
			count++;
			
		}
		sd.display();
		System.out.println(" ");
		sd.DeleteMid(count);
		System.out.println(" ");
		sd.MaxEle();
		System.out.println(" ");
//		System.out.print(sd.pop());
//		System.out.print(sd.pop());
//		System.out.print(sd.pop());
//		System.out.print(sd.pop());
		

		
	}

}
