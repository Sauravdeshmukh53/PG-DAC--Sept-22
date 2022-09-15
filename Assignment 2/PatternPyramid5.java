



class PatternPyramid5{
	public static void main(String args[]){
		int c;
		for(int i=10; i>1; i--){
			c=i-1;
			for(int j=0; j<10; j++){
				if(j<i-1){
					System.out.print("  ");   
				}
				else{
					System.out.print(c+" "); 
					c++;
				}
			}
			c=8;
			for(int k = 0; k<10-i; k++){
				System.out.print(c+" "); 
				c--;
			}
			c=0;
			System.out.println();   
		}
	}
}