package InnerClasses;

public class InterfaceInsideClassVehicleTypes {
	public static void main(String[] args) {
		Bus b=new Bus();
		System.out.println(b.getNoOfWheels());
		//Auto a=new Auto();
		
		
}
}

class VehicleaTypes{
	interface Vehicle{
		public int getNoOfWheels();
	}
	class Bus implements Vehicle{

		@Override
		public int getNoOfWheels() {
			// TODO Auto-generated method stub
			return 6;
		}
		
	}
	class Auto implements Vehicle{

		@Override
		public int getNoOfWheels() {
			// TODO Auto-generated method stub
			return 3;
		}
		
	}
}

