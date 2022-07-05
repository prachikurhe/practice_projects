package Practice;
class Demo{
	private String name;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
		
	}
}
public class GetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.setName("Prachi");
		System.out.println(d.getName());
		

	}

}
