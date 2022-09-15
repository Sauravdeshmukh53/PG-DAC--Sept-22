



class PatternPyramid4{
	public static void main(String args[]){
		int c= 0;
		for(int i=10; i>1; i--){
			for(int j=0; j<10; j++){
				if(j<i-1){
					System.out.print("  ");   
				}
				else{
					c++;
					System.out.print(c+" "); 
				}
			}
			c=10-i;
			for(int k = 0; k<10-i; k++){
				System.out.print(c+" "); 
				c--;
			}
			c=0;
			System.out.println();   
		}
	}
}