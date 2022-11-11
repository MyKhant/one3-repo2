package com.jdc.mkk;

public class GenericsDemoTwo {

	public static void main(String[] args) {
		Product p=new Product();
		p.setKey(2);
		p.setValue("Barbie");
		
		Toy toy=p.getResult();
		System.out.println(toy.getToy());
	}

}
class Toy{
	private int key;
	private String value;
	
	public Toy(int key,String value ) {
		super();
		this.value = value;
		this.key = key;
	}

	String getToy() {
		if(key==1) {
			return value+" toy with key 1";
		}else if(key==2) {
			return value+" toy with key 2";
		}else {
			return value+" toy with key other";
		}
	}
}
interface Container<K,V,R>{
	void setKey(K key);
	void setValue(V value);
	
	R getResult();
	
}
class Product implements Container<Integer,String,Toy>{
	private int key;
	private String value;
	@Override
	public void setKey(Integer key) {
		this.key=key;
	}

	@Override
	public void setValue(String value) {
		this.value=value;
	}

	@Override
	public Toy getResult() {
		return new Toy(key,value);
	}

	
	
}