package stringBuffer;

public class MethodStringBuffer {

	public static void main(String[] args) {
		StringBuffer obj=new StringBuffer("Hello ");
		obj.append("World");
		System.out.println(obj);
		StringBuffer obj1=new StringBuffer("Hello");
		obj1.replace(1, 4, "ai");
		System.out.println(obj1);
		StringBuffer obj3=new StringBuffer("Hello");
		obj3.delete(2, 4);
		System.out.println(obj3);
		StringBuffer obj4=new StringBuffer("Hello");
		obj4.reverse();
		System.out.println(obj4);
		StringBuffer obj5=new StringBuffer("My name is");
		obj5.insert(0, "Iam");
        System.out.println(obj5);

	}

}
