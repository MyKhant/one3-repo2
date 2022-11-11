package com.jdc.mkk;

public class WildCardDemo {

	public static void main(String[] args) {
//		ContainerOne<? extends B> c1=new ContainerOne<>();
//		//c1.setT(new B());
//		c1.getT().show();
//		
//		ContainerOne<? super B> c2=new ContainerOne<>();
//		c2.setT(new B());
		
		ContainerOne<C> c3=new ContainerOne<>();
		c3.setT(new C());
		
		upperBound(c3);
		
		ContainerOne<A> c4=new ContainerOne<>();
		c4.setT(new A());
		
		lowerBound(c4);
	}
	static void upperBound(ContainerOne<? extends B> upper) {
//		upper.setT(new B);
		upper.getT().show();
	}
	static void lowerBound(ContainerOne<? super B> lower) {
		lower.setT(new B());
		((A)lower.getT()).show();
	}

}
class ContainerOne<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
class A{
	void show() {
		System.out.println("Show something");
	}
}
class B extends A{}class C extends B{}
class D extends C{}