package demo01;

import java.util.Scanner;

public class HuaWeiMain3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int n = a.length();
		int m = b.length();
		
		//�ð���ʽ���ķ�ʽ
		int[] c = new int[n + m];	//������ˣ�������ȿ϶�С�������������
		for(int i = n-1; i >= 0; i--){
			for(int j = n-1; j >= 0; j--){
				int num1 = a.charAt(i) - 48;
				int num2 = b.charAt(j) - 48;
				c[i+j+1] += num1 * num2;	//��ǰ��һλ���ŷ���ǰ��Ľ�λ
			}
		}
		
		//��c�еĽ�λ
		for(int i = c.length-1; i > 0; i--){
			if(c[i] > 9){	//�н�λ
				int tmp = c[i];
				c[i] = c[i] % 10;	//��λ=ԭ������10ȡ��
				c[i-1] += tmp / 10;	//����λ�ӵ�ǰһλȥ
			}
		}
		String result = "";
		int s = 0;
		while(c[s] == 0){
			s++;
		}
		for(int i = s; i < c.length; i++){
			result += String.valueOf(c[i]);
		}
		System.out.println(result);
	}
}
