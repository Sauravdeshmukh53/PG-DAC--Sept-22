

class PatternStar5{
	public static void main(String args[]){
		
		for(int i=5; i>0; i--){
			for(int j=0; j<5; j++){
				if(j<i-1){
					System.out.print(" ");     
				}							   
				else{						  
					System.out.print("*");   
					if(j<4){
						System.out.print("*");   
					}
				}
			}
			System.out.println();   
		}
	}
}