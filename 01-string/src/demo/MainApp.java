package demo;

public class MainApp {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Mg Mg", "mgmg@gmail.com", "ygn");
		Student s2 = new Student(1, "Mg Mg", "mgmg@gmail.com", "ygn");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println("== " + (s1 == s2));

		System.out.println("equals()" + s1.equals(s2));
		System.out.println(s1);
		System.out.println(s2);
	}

}
