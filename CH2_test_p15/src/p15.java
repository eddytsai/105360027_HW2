import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class p15 {
	public static void main(String[] args)throws IOException{

	
	System.out.println("�п�J�@�Ӿ��");
	
	BufferedReader br=
		new BufferedReader(new InputStreamReader(System.in));
		
	int num= Integer.parseInt(br.readLine());	
	
	switch(num)
	{
	case 1:
	{
		System.out.println("�A��J���Ʀr�O1");
	
	}
	case 2:
	{
		System.out.println("�A��J���Ʀr�O2");

	}
	default:
	{
		System.out.println("�п�J���Ʀr1��2");
	
	}
	}
}
}