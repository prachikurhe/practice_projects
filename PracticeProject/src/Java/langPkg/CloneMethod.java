package Java.langPkg;

public class CloneMethod implements Cloneable{
	int i=10;
	int j=20;
	

	public static void main(String[] args) throws CloneNotSupportedException  {
		CloneMethod c1=new CloneMethod();
		CloneMethod c2=(CloneMethod)c1.clone();
		c2.i=888;
		c2.j=999;
		System.out.println(c1.i+" "+c1.j);
		System.out.println(c2.i+"  "+c2.j);
		

	}

}