
public class Round09_Ex04 {
int a,b,c,d,e,f;

Round09_Ex04(){
	a=1;b=2;c=3;d=4;e=5;f=6;
}

Round09_Ex04(int x){
	this();
	a=x;

}
Round09_Ex04(int x,int y){
	this(x);
	b=y;
}
Round09_Ex04(int x,int y,int z){
	this(x,y);
	c=z;
}


public static void main(String ar[]){
	Round09_Ex04 x=new Round09_Ex04();
	Round09_Ex04 y=new Round09_Ex04(100);
	Round09_Ex04 z=new Round09_Ex04(200,300);
	
	
	System.out.println(x.a);
	System.out.println(x.b);
	System.out.println(x.c);
	System.out.println(x.d);
	System.out.println(x.e);
	System.out.println(x.f);
	
	System.out.println(y.a);
	System.out.println(y.b);
	System.out.println(y.c);
	System.out.println(y.d);
	System.out.println(y.e);
	System.out.println(y.f);
	
	System.out.println(z.a);
	System.out.println(z.b);
	System.out.println(z.c);
	System.out.println(z.d);
	System.out.println(z.e);
	System.out.println(z.f);
	
}
}
