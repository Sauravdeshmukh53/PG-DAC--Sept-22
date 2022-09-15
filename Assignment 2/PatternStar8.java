
class PatternStar8{
	public static void main(String args[]){
		int c = 0;
		for(int i=0; i<10; i++){
			c=i;
			if(c>4){
				c=9-c-1;
			}
			for(int j=0; j<c+1; j++){
				System.out.print("*");   
			}
			
			System.out.println();   
		}
	}
}