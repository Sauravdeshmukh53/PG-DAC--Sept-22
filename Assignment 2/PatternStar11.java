


class PatternStar11{
	public static void main(String args[]){
		
		for(int i=1; i<=5; i++){
			
			for(int j=0; j<i; j++){
				if(j<i-1){
					System.out.print(" ");   
				}  
				else{
					System.out.print("****");   
				}
			}
			
			System.out.println();   
		}
	}
}