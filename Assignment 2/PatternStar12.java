

class PatternStar12{
	public static void main(String args[]){
		int c=0;
		for(int i=0; i<9; i++){
			c=i;
			if(c>4){
				c=8-i;
			}
			for(int j=5; j>c; j--){
				System.out.print("*");   
			}
			
			System.out.println();   
		}
	}
}