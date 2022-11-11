package com.jdc.mkk;

public class BoundedTypeDemo {

	public static void main(String[] args) {
		Pair<Integer,String> p=new Pair();
		p.setK(1);
		p.setV("MMA");
		
		System.out.println(String.format("Key :%d , Value :%s", p.getK(),p.getV()));
		
		Pair<Double, Integer>p2=new Pair<>();
		p2.setK(2.0);
		p2.setV(333);
		
		System.out.println(String.format("Key :%s , Value :%d", p2.getK(),p2.getV()));
	}

}
class Pair<K extends Number,V>{
	private K k;
	private V v;
	public K getK() {
		return k;
	}
	public void setK(K k) {
		this.k = k;
	}
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
	
}