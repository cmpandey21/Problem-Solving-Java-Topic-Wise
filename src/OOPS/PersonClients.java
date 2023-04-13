package OOPS;

public class PersonClients {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person(26);
		Person p4 = new Person(26,"Pandey");

		// p2.name="Mohan";
		// p2.age=26;

		/*
		 * System.out.println("P1 name:"+p1.name); System.out.println("P1 age:"
		 * +p1.age); System.out.println("P2 name:"+p2.name);
		 * System.out.println("P2 age:" +p2.age);
		 */

		System.out.println("P1 name:" + p1.getName());
		System.out.println("P1 age:" + p1.getAge());

		p2.setName("Mohan");
		p2.setAge(26);
		System.out.println("P2 name:" + p2.getName());
		System.out.println("P2 age:" + p2.getAge());
		System.out.println("P3 age:" + p3.getAge());
		System.out.println("P4 age and name:" + p4.getAge() + p4.getName());

	}

}
