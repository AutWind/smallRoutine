package demo01;

import java.util.Scanner;

public class HuaWeiMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		
		int[][] d = new int[n][n];	//d[i][j]��ʾ�ӵ�i����������j����������Ծ����
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				int min = d[i][j-1] + 1;
				for(int k = 2;k <= j; k++){		//�ҳ���i��j-1��i��j-k���������ٵģ�Ȼ��+1����i��j��С��
					if(k <= a[j-k]){		//����kҪС�ڵ�j-k�����������Ծ���ȣ�����һ�ε���j��
						if(min > d[i][j-k] + 1){
							min = d[i][j-k] + 1;
						}
					}
				}
				d[i][j] = min;
			}
		}
		System.out.println(d[0][n-1]);
	}
}
