
public class Stack {
	private int[] num = new int [4];
	int top=0;
	
	private void push(int x) throws StackFullException {
		if(top >= num.length) {
			throw new StackFullException("baka");
		}
		num[top]=x;
		top++;
	}
	
	private int pop() throws StackEmptyException {
		if(top <= 0) {
			throw new StackEmptyException("baka");
		}
		top--;
		return num[top];
		
		
	}
	
	
	public static void main(String[] args) {
		
		try {
		Stack s=new Stack();
		s.push(11);
		s.push(22);
		s.push(33);
		s.push(44);
//		s.push(55);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		} catch(StackFullException f) { // end of try
			System.out.println(f.getMsg());
		} catch(StackEmptyException e) {
			System.out.println(e.getMsg());
		}
		

	}

}
