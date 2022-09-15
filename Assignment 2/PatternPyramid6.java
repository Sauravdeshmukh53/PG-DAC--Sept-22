


class PatternPyramid6{
	public static void main(String args[]){
		int c;
		for(int i=9; i>0; i--){
			for(int j=0; j<i; j++){
				System.out.print(i+" ");
			}
			System.out.println();   
			for(int k=0; k<10-i;k++){
				System.out.print(" ");
			}
		}
	}
}