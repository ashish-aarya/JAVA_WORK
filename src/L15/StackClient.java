package L15;

public class StackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Stack s=new Stack();
		s.push (10);
		s.push (20);
		s.push (30);
		s.push (40);
		s.push (50);
		//s.push (60);
		s.display();
		
		System.out.println(s.pop());
		s.display();
		System.out.println(s.peek());
		s.display();
		
	}

}
