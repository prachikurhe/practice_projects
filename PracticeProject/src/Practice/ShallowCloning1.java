package Practice;
class Cat{
	String name;
	Cat(String name){
		this.name=name;
	}
	
}
class  Dog6 implements Cloneable{
	Cat cat;
	int id;
	Dog6(Cat cat,int id){
		this.cat=cat;
		this.id=id;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
}
public class ShallowCloning1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Cat c=new Cat("rosie");
		Dog6 d=new Dog6(c,111);
		//System.out.println(d.id+" "+d.cat.name);
		Dog6 d2=(Dog6)d.clone();
		d2.id=101;
		d2.cat.name="manny";
		System.out.println(d.id+" "+d.cat.name);
		System.out.println(d2.id+" "+d2.cat.name);
		

	}

}
