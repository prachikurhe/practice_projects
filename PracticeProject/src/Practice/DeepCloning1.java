package Practice;
class Cat11{
	String name;
	Cat11(String name){
		this.name=name;
	}
	
}
class  Dog11 implements Cloneable{
	Cat11 cat;
	int id;
	Dog11(Cat11 cat,int id){
		this.cat=cat;
		this.id=id;
	}
	public Object clone() throws CloneNotSupportedException{
		Cat11 c2=new Cat11(cat.name);
		Dog11 d2=new Dog11(c2, id);
		return d2;
		
	}
	}

public class DeepCloning1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Cat11 c=new Cat11("rosie");
		Dog11 d=new Dog11(c,111);
		//System.out.println(d.id+" "+d.cat.name);
		Dog11 d2=(Dog11)d.clone();
		d2.id=101;
		d2.cat.name="manny";
		System.out.println(d.id+" "+d.cat.name);
		System.out.println(d2.id+" "+d2.cat.name);
		

	}

}
