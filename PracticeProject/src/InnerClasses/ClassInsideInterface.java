package InnerClasses;
interface Vehicle{
	public int getNoOfWheels();
	class DefaultVehicle implements Vehicle{

		@Override
		public int getNoOfWheels() {
			// TODO Auto-generated method stub
			return 2;
		}
		
	}
}
class Bus implements Vehicle{

	@Override
	public int getNoOfWheels() {
		// TODO Auto-generated method stub
		return 6;
	}
	
}
public class ClassInsideInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle.DefaultVehicle d=new Vehicle.DefaultVehicle();
		System.out.println(d.getNoOfWheels());
		Bus b=new Bus();
		System.out.println(b.getNoOfWheels());

	}

}
