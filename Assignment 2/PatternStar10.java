


class PatternStar10{
	public static void main(String args[]){
		int c = 0;
		for(int i=0; i<5; i++){
			c=i;
			for(int j=5; j>c; j--){
				if(j>c+1){
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