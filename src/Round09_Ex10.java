import java.io.*;
class sungjuk{
	int[] sub=new int[4];
	float avg;
	
	void disp(){
		System.out.println(sub[0]);
		System.out.println(sub[1]);
		System.out.println(sub[2]);
		System.out.println(sub[3]);
		System.out.println(avg);
	}
	sungjuk() throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String[] str={"국어","영어","수학"};
		for(int a=0;a<str.length;a++){
			System.out.println(str[a]+"=");
			sub[a]=Integer.parseInt(in.readLine());
			sub[str.length]+=sub[a];
			
		}
		avg=sub[str.length]/(float)(str.length);
		
		
	}
	

}
public class Round09_Ex10 {
	
	public static void main(String ar[])throws IOException{
		sungjuk sc=new sungjuk();
		sc.disp();
	}
	
}
