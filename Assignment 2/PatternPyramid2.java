


class PatternPyramid2{
	public static void main(String args[]){
		int c=0;
		for(int i=1; i<10; i++){
			for(int j=0; j<10; j++){
				if(j>9-i){
					c++;
					System.out.print(c+" ");   
				}
				else{
					System.out.print(" ");   
				}
			}
			c=0;
			System.out.println();   
		}
	}
}