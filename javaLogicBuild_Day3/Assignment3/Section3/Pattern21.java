/*
[0,0]
[1,0]*[1,1]
[2,0]*[2,1]*[2,2]
[3,0]*[3,1]*[3,2]*[3,3]
[4,0]*[4,1]*[4,2]*[4,3]*[4,4]
*/
class Pattern23{
	public static void main(String []args){

		int count = 1;
		for(int i = 0; i<5 ; i++){
			for(int j = 0; j<5; j++){
				if(j<i){
					
					System.out.print(count + "*");
					count+=2;
				}
				if(j==i){
					
					System.out.print(count);
					count+=2;
				}

			}
			count =1;
			System.out.println();
			
		}
		
	}
}

/*Ouput
1
1*3
1*3*5
1*3*5*7
1*3*5*7*9
*/