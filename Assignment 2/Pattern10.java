class Pattern10{
	public static void main(String args[]){
		char i,j;
		for(i='E';i>='A';i--){
			for(j='B';j<=i;j++){
				System.out.print(" ");
			}
			for(j=i;j<='E';j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}