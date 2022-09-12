import java.util.Scanner;

public class Detail01
{
	long sum=0,b,tmp=1;	
		String a = null;
		Scanner sc = new Scanner(System.in);
		a = sc.next();

		for(int i=a.length()-1;i >= 0;i--){
			b = a.charAt(i);
			if(b>='0' && b<='9'){
				b = (b - '0') * tmp;
				sum = sum + b;
				tmp = tmp * 16;
			}
			else if(b>='A' && b<='F'){
				b = (b - 'A' + 10) * tmp;
				sum = sum + b;
				tmp = tmp * 16;
			}
		}
		System.out.println(sum);

}

