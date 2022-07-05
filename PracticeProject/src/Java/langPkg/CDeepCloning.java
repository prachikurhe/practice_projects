package Java.langPkg;
class Cat1 implements Cloneable{
	int j;
	Cat1(int j){
		this.j=j;
	}
}
class Dog1 implements Cloneable{
	Cat1 c;
	int i;
	Dog1(Cat1 c, int i){
		this.c=c;
		this.i=i;
	}
	public Object clone() throws CloneNotSupportedException{
		Cat1 c1=new Cat1(c.j);
		Dog1 d=new Dog1(c1,i);
		return d;
		
	}
}

public class CDeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Cat1 c=new Cat1(10);
		Dog1 d1=new Dog1(c,20);
		System.out.println(d1.i+" "+d1.c.j);
		Dog1 d2=(Dog1)d1.clone();
		d2.i=888;
		d2.c.j=999;
		System.out.println(d1.i+" "+d1.c.j);
		

	}

}
