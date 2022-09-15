


class PatternPyramid7{
	public static void main(String args[]){
		
		for(int i=9; i>0; i--){
			for(int j=0; j<i; j++){
				System.out.print("* ");
			}
			System.out.println();   
			for(int k=0; k<10-i;k++){
				System.out.print(" ");
			}
		}
	}
}