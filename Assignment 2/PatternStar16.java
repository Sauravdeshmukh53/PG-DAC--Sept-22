




class PatternStar15{
	public static void main(String args[]){
		for(int i=5; i>=1; i--){
			for(int j=0; j<5; j++){
				if(i==1){
					System.out.print("*"); 
				}
				else{
					if(j==4||j==i-1){
						System.out.print("*"); 
					}
					else{
						System.out.print(" "); 
					}
				}
			}
			System.out.println();   
		}
	}
}