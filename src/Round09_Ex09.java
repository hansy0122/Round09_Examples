import java.io.*;
public class Round09_Ex09 {

	
	public static void main(String ar[])throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		Round09_Ex08 score=new Round09_Ex08();
		String subn[]={"����","����","����"};
		
		for(int i=0;i<3;i++){
			System.out.println(subn[i]+"������ �Է��ϼ���");
			score.x[i]=Integer.parseInt(in.readLine());
			score.x[3]+=score.x[i];
		}
		
		score.av=score.x[3]/3.0f;
		score.disp();
		
	}
}
