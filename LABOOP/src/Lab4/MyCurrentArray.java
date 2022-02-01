package Lab4;

public class MyCurrentArray extends MyClassicalArray {
	
	//Properties
	
	
	//Method
	public void Rand(){
		
		for(int i = 0 ; i <= 9 ; i ++) {
			
		this.MyArray[i] = rand.nextInt(100);
		

		System.out.println(" Array = " + this.MyArray[i]);
		
		}//end
		
	}//end
	
	public void Sort() {
		
		for (int i = 0 ; i < 9 ; i++) {
			for (int j = 0 ; j < 9-i ; j++) {
				if (this.MyArray[j] > this.MyArray[j+1]) {
					int temp = this.MyArray[j];
					this.MyArray[j] = this.MyArray[j+1];
					this.MyArray[j+1] = temp;
				}//end if
			}//end for2
		}//end for 1
		System.out.print("Sort min --- Max : ");
		for(int i = 0 ; i <= 9 ; i++) {
		System.out.print(" "+this.MyArray[i]+" ");
		 }//end for
		System.out.print(" ");	
	}//end Sort
	
	public int Search(int n) {
		int pos = 0 ;
		for(int i = 0 ; i <= 9 ; i++) {
			if(n == this.MyArray[i] )
				pos = i+1 ;		
		    }//end
		return pos;
	 }//end

}//end