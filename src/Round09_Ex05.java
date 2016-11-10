
public class Round09_Ex05 {
	int a,b;
 Round09_Ex05(){
	 a=2;
	 b=3;
 }
  void disp(){
	  System.out.println(a);
	  System.out.println(b);
  }
 
 public static void main(String ar[]){
	 Round09_Ex05 aa=new Round09_Ex05();
	 aa.disp();
	 Round09_Ex05 bb=aa;
	 bb.disp();
	 bb.a=10;
	 bb.b=100;
	 aa.disp();
	 bb.disp();
	 
	 
	 Round09_Ex05 cc=new Round09_Ex05();
	 cc=aa;
	 cc.disp();
	 aa.a=123123;
	 aa.b=432423;
	 cc.disp();
	 
	 
 }
}
