package InnerClasses;

public class MethodLocalInnerClassEx {
	 private int data =20;
	 void display() {
		 class Local{
			 void msg() {
				 System.out.println(data);
			 }
		 }
			 Local l=new Local();
			 l.msg();
		 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodLocalInnerClassEx l=new MethodLocalInnerClassEx();
		l.display();

	}

}

