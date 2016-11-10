
public class Round09_Ex08 {
  int x[]=new int[4];
  float av;
		  
  
  void disp(){
	  for(int i=0;i<x.length;i++){
		  System.out.println(x[i]);
	  }
	  System.out.println(av);
	  
  }
	
	Round09_Ex08(){
		/*for(int i=0;i<3;i++){     
			x[3]+=x[i];
		}                                  생성자 메소드 작동시 총점은 0이 되어버림.*/
		av=x[3]/3.0f;
	}
}
