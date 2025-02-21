/*
[0,0]
[1,0]*[1,1]
[2,0]*[2,1]*[2,2]
[3,0]*[3,1]*[3,2]*[3,3]
[4,0]*[4,1]*[4,2]*[4,3]*[4,4]
new loop
[5,0]*[5,1]*[5,2]*[5,3]*[5,4]
[4,0]*[4,1]*[4,2]*[4,3]
[3,0]*[3,1]*[3,2]
[2,0]*[2,1]
[1,0]
*/
class Pattern2{
	public static void main(String []args){
		for(int i = 0; i<5 ; i++){
			for(int j = 0; j<5; j++){
				if(j<i){
					System.out.print(i+1 + "*");
				}
				if(j==i){
					System.out.print(i+1);
				}
			}
			System.out.println();
			
		}
		for(int i = 5; i>0 ; i--){
			for(int j = 0; j<5; j++){
				if(j<i-1){
					System.out.print(i + "*");
				}
				if(j==i-1){
					System.out.print(i);
				}
			}
			System.out.println();
			
		}
	}
}

/*Ouput
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1
*/