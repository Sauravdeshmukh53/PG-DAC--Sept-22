



class PatternStar6{
	public static void main(String args[]){
		int c=0;
		for(int i=5; i>0; i--){
			for(int j=0; j<5; j++){
				if(j<c){
					System.out.print(" ");
					
				}
				else{
					System.out.print("*");
				}
			}
			for(int k=0; k<5; k++){
				if(k<i-1){
					System.out.print("*");
				}
			}
			c++;
			System.out.println();   
		}
	}
}