
public class Round09_Ex03 {
		int a,b,c;
	
		
		Round09_Ex03(int x, int y, int z){
			a=x;b=y;c=z;
			
		}
	public static void main(String ar[]){
	Round09_Ex03 kor=new Round09_Ex03(1,2,3);
	Round09_Ex03 kor1=new Round09_Ex03(3,4,5);
	kor1=kor;
	
	System.out.println(kor.a+","+kor.b+","+kor.c);
	System.out.println(kor1.a+","+kor1.b+","+kor1.c);
	
		
		
	} 
	}

