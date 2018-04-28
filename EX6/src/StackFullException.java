
@SuppressWarnings("serial")
public class StackFullException extends Exception{
	@SuppressWarnings("unused")
	private  String msg;
	
	StackFullException(String msg){
		this.msg=msg;	
	}

	public String getMsg() {
		return "The Stack is full, cannot push more data into it";
	}
	
	

}
