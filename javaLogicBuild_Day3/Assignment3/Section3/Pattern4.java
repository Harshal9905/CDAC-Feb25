/*
[0,0][0,1][0,2][0,3][0,4]
[1,0][1,1][1,2][1,3][1,4]
[2,0][2,1][2,2][2,3][2,4]

*/
class Pattern4{
	public static void main(String []args){
		int half = (10-1)/2;
		for(int i = 0; i<half+1; i++){
			for(int j = 0 ; j < 10 ; j++){
				if(j == half - i || j == half+i || (j > half-i && j< half+i)){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
			}
			System.out.println();
		}
	}
}