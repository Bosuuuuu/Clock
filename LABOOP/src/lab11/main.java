package lab11;

import java.lang.Math;

public class main {
	public static float random(double d, double e) {
		return (float) ( (float)(Math.random() * (e - d )) +d);
    }
	public static void main(String[] args) {
 
		int turn = 1;
		int DamagePoint = 0;
		
		NmTank1 Nt1 = new NmTank1();
		NmTank2 Nt2 = new NmTank2();
		
		//Tank A
		Nt1.SetHP(200);
		Nt1.Str = 12;
		Nt1.Vit = 9;
		Nt1.BaseDamage = 11;
		
		//Tank B
		Nt2.SetHP(250);
		Nt2.Str = 8;
		Nt2.Vit = 10;
		Nt2.BaseDamage = 10;
		
		System.out.println("////////////////////////////");
		Nt1.GetHP();
		Nt2.GetHP();
		
		System.out.println("////////////////////////////");
		System.out.println("Start");
			
		do {
			System.out.println("////////////////////////////");
			System.out.println("Round = "+ turn);
			if(turn%2 == 0) {
				//Tank1 ATTACK
				DamagePoint = (int) (Nt1.BaseDamage * Math.floorDiv( Nt1.Str , Nt2.Vit ) * random(0.7, 0.9) ) ;
				Nt2.Attack(DamagePoint);
				Nt2.GetHP();
			} else {
				//Tank2 ATTACK
				//floor(8/9) = 0 Tank2 DamagePoint == 0 ?
						DamagePoint = (int) (Nt2.BaseDamage * 
								Math.floorDiv( Nt2.Str , Nt1.Vit ) * random(0.7, 0.9) ) ;
				Nt1.Attack(DamagePoint);
				Nt1.GetHP();
			}
			turn++;
			if( Nt1.HP <= 0 || Nt2.HP <= 0) {
				break;
			}
			System.out.println("////////////////////////////");
		}while(turn !=0 );
		System.out.println("////////////////////////////");
		if(Nt1.HP <= 0 ) {
			System.out.println("Tank 2 WIN!!!!!!");
		}else if(Nt2.HP <= 0) {
			System.out.println("Tank 1 WIN!!!!!!");
		}
		System.out.println("////////////////////////////");
	}
}//end class


