class Pattern9{
	public static void main(String args[]){
		char i,j;
		for(i='A';i<='E';i++){
			for(j='D';j>=i;j--){
				System.out.print(" ");
			}
			for(j='A';j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}