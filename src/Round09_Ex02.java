
public class Round09_Ex02 {
int a;
double b;
Round09_Ex02(){
	a=100;
	b=200.0;
	
}

Round09_Ex02(int x){
	a=x;
	b=200.0;
	
}

Round09_Ex02(double x){
	a=100;
	b=x;
}
Round09_Ex02(int x,double y){
	a=x;
	b=y;
}


public static void main(String ar[]){
	Round09_Ex02 kor=new Round09_Ex02();
	Round09_Ex02 kor1=new Round09_Ex02(11);
	Round09_Ex02 kor2=new Round09_Ex02(11.0);
	Round09_Ex02 kor3=new Round09_Ex02(123,22.03);
	
	
	System.out.println(kor.a+","+kor.b);
	System.out.println(kor1.a+","+kor1.b);System.out.println(kor2.a+","+kor2.b);System.out.println(kor3.a+","+kor3
			.b);
}
}
