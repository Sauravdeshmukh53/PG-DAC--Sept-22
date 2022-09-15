


class PatternStar15{
	public static void main(String args[]){
		for(int i=1; i<=5; i++){
			for(int j=0; j<i; j++){
				if(i==5){
					System.out.print("*"); 
				}
				else{
					if(j==0||j==i-1){
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