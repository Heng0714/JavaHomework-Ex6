
@SuppressWarnings("serial")
public class StackEmptyException extends Exception{
	@SuppressWarnings("unused")
	private  String msg;
	
	StackEmptyException(String msg){
		this.msg=msg;	
	}

	public String getMsg() {
		return "The Stack is empty, cannot pop more data out of it";
	}
}
