/*
[0,0]
[1,0][1,1]
[2,0][2,1][2,2]
[3,0][3,1][3,2][3,3]
[4,0][4,1][4,2][4,3][4,4]
*/
class Pattern3{
	public static void main(String []args){
		for(int i = 0;i<6; i++){
			for(int j = 0 ; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
Output
*
**
***
****
*****
******
*/