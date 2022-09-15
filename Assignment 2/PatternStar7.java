
class PatternStar7{
	public static void main(String args[]){
		int c = 0;
		int k = 0;
		for(int i=0; i<10; i++){
			c=i;
			for(int j=5; j>0; j--){
				if(c>4){
					c=9-c-1;
				}
				if(j>c+1){
					System.out.print(" "); 
				}
				else{
					if(j==c+1){
						System.out.print("*"); 
					}
					else{
						System.out.print("**"); 
					}
				}
			}
			
			System.out.println();   
		}
	}
}