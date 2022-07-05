package Cumulus_System;

public class SingletonDemo {
	public static void main(String[] args) throws InterruptedException {

//		Singleton s1= Singleton.getInstance();
//		Singleton s2= Singleton.getInstance();
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s1.equals(s2));

		Runnable r1 = () -> {
			try {
				System.out.println(Singleton.getInstance() +" by "+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		for (int i = 0; i <= 50; i++) {
			new Thread(r1,i+" Thread").start();
			if((i+1)%10 == 0)
				Thread.sleep(1000);
		}
		
	}
}

/**
 * Singleton class means , the have only one instance. we restricting class from
 * getting created multiple object.
 * 
 * 1) making constructor private , so no one can create instance outside the
 * class. 2) providing factory or static method to create object. 3) creating
 * private static variable to store created object.
 * 
 * @author win10
 *
 */
class Singleton {

	private static Singleton object;

	private Singleton() {

	}

	// to make method sychronize or use synchronized block
	public static Singleton getInstance() throws InterruptedException {

		if (object == null)
			synchronized (Singleton.class) {
				Thread.sleep(1000);
				if (object == null)
					object = new Singleton();
			}
		return object;
	}

}