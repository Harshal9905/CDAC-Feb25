/*
[0,0]
[1,0]*[1,1]
[2,0]*[2,1]*[2,2]
[3,0]*[3,1]*[3,2]*[3,3]
[4,0]*[4,1]*[4,2]*[4,3]*[4,4]
*/
class Pattern19{
	public static void main(String []args){
		for(int i = 0; i<5 ; i++){
			for(int j = 0; j<5; j++){
				if(j<i){
					System.out.print(j+1 + "*");
				}
				if(j==i){
					System.out.print(j+1);
				}
			}
			System.out.println();
			
		}
		
	}
}

/*Ouput
1
1*2
1*2*3
1*2*3*4
1*2*3*4*5
*/