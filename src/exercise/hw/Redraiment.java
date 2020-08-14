package exercise.hw;

import java.util.LinkedList;
import java.util.Scanner;

/*
题目描述
   Redraiment是走梅花桩的高手。Redraiment总是起点不限，从前到后，往高的桩子走，但走的步数最多，不知道为什么？你能替Redraiment研究他最多走的步数吗？
样例输入
6
2 5 1 5 4 5
样例输出
3
提示
Example:
6个点的高度各为 2 5 1 5 4 5
如从第1格开始走,最多为3步, 2 4 5
从第2格开始走,最多只有1步,5
而从第3格开始走最多有3步,1 4 5
从第5格开始走最多有2步,4 5

所以这个结果是3。
 */
public class Redraiment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int count = scanner.nextInt();
            LinkedList<Integer> listA = new LinkedList<>();
            for (int i = 0; i < count; i++) {
                listA.add(scanner.nextInt());
            }
            LinkedList<Integer> listB = new LinkedList<>();
            for (int i = 0; i < count; i++) {
                if (i == 0) {
                    listB.add(listA.get(i));
                } else {
                    int key = listA.get(i);
                    if (listB.size() == 1) {
                        if (key < listB.get(0)) {
                            listB.set(0, key);
                        } else {
                            listB.add(key);
                        }
                    } else {
                        for (int j = 0; j < listB.size(); j++) {
                            if (j == listB.size()-1) {
                                if (key <= listB.get(j) && key > listB.get(j-1)) {
                                    listB.set(j, key);
                                } else {
                                    listB.add(key);
                                }
                            } else {
                                if (listB.get(j)<key && listB.get(j + 1) > key) {
                                    listB.set(j+1, key);
                                    break;
                                }else if(listB.get(j)>key && listB.get(j + 1) > key){
                                    listB.set(j, key);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(listB.size());
        }
    }
}
