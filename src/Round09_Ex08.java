
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
		}                                  ������ �޼ҵ� �۵��� ������ 0�� �Ǿ����.*/
		av=x[3]/3.0f;
	}
}
