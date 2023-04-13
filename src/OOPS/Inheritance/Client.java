package OOPS.Inheritance;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("-----Case1-------");
		Parent ob=new Parent();
		System.out.println(ob.d);
		System.out.println(ob.d1);
		ob.fun();
		ob.fun1();
		
		System.out.println("-----Case2-------");
		Parent ob1=new Child();
		System.out.println(ob1.d);
		System.out.println(ob1.d1);
		System.out.println(((Child)ob1).d2);
		ob1.fun();
		ob1.fun1();
		((Child)ob1).fun2();
		
		System.out.println("-----Case3-------");
		/* Child ob3=new Parent();    This case is not allowed in java to avoid run time error.       
		System.out.println(ob3.d);
		System.out.println(ob3.d1);
		System.out.println(ob3.d2); */ 
		

	}

}
