package prob5;

public class MyStack {
	
	private int length;
	private String[] array;
	
	public MyStack(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String[] getArray() {
		return array;
	}
	public void setArray(String[] array) {
		this.array = array;
	}
	
	public String pop() throws MyStackException{
	if(array.length==0) {
		throw new MyStackException("stack is empty");
	}
	else {
		String value = array[array.length-1];	
		String[] newArray = new String[array.length-1];		
		for(int i=0; i<newArray.length; i++) {
			newArray[i] = array[i];
		}
		array = newArray;
		return value;
		}
	}
		
	public void push(String value) {
	if(array==null) {
		array = new String[1];
		array[0] = value;
	}
	else {
		String[] newArray = new String[array.length+1];		
		for(int i=0; i<array.length; i++) {
			newArray[i] = array[i];
		}
		newArray[newArray.length-1] = value;
		array = newArray;
	}
}
	
	public boolean isEmpty() {
		if(array.length>0) {
			return false;
		}
		else {
			return true;
		}
	}
}
