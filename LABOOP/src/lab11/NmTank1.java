package lab11;

public class NmTank1 implements ClassicTank{
	
	public int HP;
	public int Str;
	public int Vit;
	public int BaseDamage;
	
	@Override
	public void SetHP(int x) {
		HP = x;
	}

	@Override
	public void GetHP() {
		System.out.println("Tank 1 Have HP " + HP);
	}

	@Override
	public void Attack(int x) {
		System.out.println("Tank 1 Take DMG " + x);
		HP = HP - x;
	}

}//end class

