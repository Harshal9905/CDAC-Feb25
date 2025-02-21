/*
[5,5]
[4,5]*[4,4]
[3,5]*[3,4]*[3,3]
[2,5]*[2,4]*[2,3]*[2,2]
[1,5]*[1,4]*[1,3]*[1,2]*[1,1]

*/
class Pattern20{
	public static void main(String []args){
		
		for(int i = 5; i>0 ; i--){
			for(int j = 5; j>0; j--){
				if(i<j){
					System.out.print(j + "*");
				}
				if(j==i){
					System.out.print(j);
				}
			}
			
			System.out.println();
			
		}
		
	}
}

/*Ouput
5
5*4
5*4*3
5*4*3*2
5*4*3*2*1


*/