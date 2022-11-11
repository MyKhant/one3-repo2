package com.jdc.mkk;

public class UpperBoundDemo {

	public static void main(String[] args) {

		 ContainerTwo<G> three=new ContainerTwo<>();
		 three.setData(new G());
		 setUpper(three);
		
		 ContainerThree<G> c1=new ContainerThree<>();
		 ContainerTwo<G> c2=new ContainerTwo<>();
		 
		 System.out.println(c1.equals(c2));
		 
	}
	static void setUpper(ContainerTwo<? extends G> c) {
		//c.setData(new G());
		System.out.println(c.getData());
	}
	static void setLower(ContainerTwo<? super G> c) {
		c.setData(new G());
	}
}
class ContainerThree<T>extends ContainerTwo<T>{
	
}
class ContainerTwo<T>{
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
class E{}
class F extends E{}
class G extends F{}
class H extends G{}

