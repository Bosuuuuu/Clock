package lab77;

public class main {



	public static void main(String[] args) {
		
		Vehicle a = new Vehicle();
		Motorbike c = new Motorbike() ;
		c.Move();
	
		car b = new car();
		b.Move();
		balloon d = new balloon();
		d.Move();
		b.Move("fluke");
		super_car s = new super_car();
		s.Move(10);
		
		drone r = new drone(); 
		r.Movechar("H");
	}//end method

	
}//end class
