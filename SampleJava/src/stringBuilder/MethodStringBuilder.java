package stringBuilder;

public class MethodStringBuilder {

	public static void main(String[] args) {
		StringBuilder obj=new StringBuilder("Hello ");
		obj.append("World");
		System.out.println(obj);
		StringBuilder obj1=new StringBuilder("Hello");
		obj1.replace(1, 4, "ai");
		System.out.println(obj1);
		StringBuilder obj3=new StringBuilder("Hello");
		obj3.delete(2, 4);
		System.out.println(obj3);
		StringBuilder obj4=new StringBuilder("Hello");
		obj4.reverse();
		System.out.println(obj4);
		StringBuilder obj5=new StringBuilder("My name is");
		obj5.insert(0, "Iam");
        System.out.println(obj5);


	}

}
