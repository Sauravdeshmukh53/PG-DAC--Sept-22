


class PatternPyramid1{
	public static void main(String args[]){
		for(int i=1; i<10; i++){
			for(int j=0; j<10; j++){
				if(j>9-i){
					System.out.print(i+" ");   
				}
				else{
					System.out.print(" ");   
				}
			}
			System.out.println();   
		}
	}
}