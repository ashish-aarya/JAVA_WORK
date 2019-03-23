package L16;

public class DSClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack ds = new DynamicStack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.push(60);
		ds.display();
		ds.pop();
		ds.display();
		ds.push(70);
		ds.display();
		System.out.println("GO \n \n dis");
		displayReverse(ds);
		System.out.println("\n org");
		ds.display();
		 actualReverse(ds,new DynamicStack());
		 System.out.println("on rev");
		 ds.display();
	}

	public static void displayReverse(DynamicStack Stack) throws Exception // throws
																			// Exception
	{
		int n;
		if (Stack.isempty())
			return;
		n = Stack.pop();
		displayReverse(Stack);
		System.out.print(n + " ");
		Stack.push(n);

	}

	public static void actualReverse(DynamicStack Stack, DynamicStack helper) throws Exception {
		if (Stack.isempty()) {
			actualReverseHelper(Stack, helper);
			return;
		}
		int temp = Stack.pop();
		helper.push(temp);
		actualReverse(Stack, helper);
	}

	public static void actualReverseHelper(DynamicStack Stack, DynamicStack helper) throws Exception {
		if (helper.isempty()) {
			return;
		}
		int temp = helper.pop();
		actualReverseHelper(Stack, helper);
		Stack.push(temp);
	}
}