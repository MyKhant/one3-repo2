package com.jdc.mkk;

public class GenericDemo {

	public static void main(String[] args) {
		Data<String> da=new Data<>();
		da.setValue("Hello Java");
		String s=da.getValue();
		
		Data<Integer>data=new Data<>();
		data.setValue(23);
		int i=data.getValue();
		
		System.out.println(String.format("String :%s ,Integer :%d", s,i));
	}

}

class Data<T>{
	
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
