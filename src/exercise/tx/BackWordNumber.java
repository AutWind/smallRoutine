package exercise.tx;

/**
 * 作为程序员的小Q，他的数列和其他人的不太一样，他有个数。
 * 老板问了小Q一共 m次，每次给出一个整数, 要求小Q把这些数每分为一组，然后把每组进行翻转，小Q想知道每次操作后整个序列中的逆序对个数是多少呢？
 * 逆序对：对于一个包含N个非负整数的数组A[1..n]，如果有i < j，且A[ i ]>A[ j ]，则称(A[ i] ,A[ j] )为数组A中的一个逆序对
 * 例如:
 * 对于序列1 3 4 2，逆序对有(4, 2),(3, 2),总数量为2。
 * 翻转之后为2 4 3 1，逆序对有(2, 1),(4, 3), (4, 1), (3, 1),总数量为4。
 * 输入描述:
 * 第一行一个数
 * 第二行个数，表示初始的序列()
 * 第三行一个数
 * 第四行m个数表示
 * 输出描述:
 * m行每行一个数表示答案。
 * 输入例子1:
 * 2
 * 2 1 4 3
 * 4
 * 1 2 0 2
 * 输出例子1:
 * 0
 * 6
 * 6
 * 0
 * 例子说明1:
 * 初始序列2 1 4 3
 * 2^{q_1} = 2 ->
 * 第一次：1 2 3 4 -> 逆序对数为0
 * 2^{q_2} = 4 ->
 * 第二次：4 3 2 1 -> 逆序对数为6
 * 2^{q_3} = 1 ->
 * 第三次：4 3 2 1 -> 逆序对数为6
 * 2^{q_4} = 4 ->
 * 第四次：1 2 3 4 -> 逆序对数为0
 */
public class BackWordNumber {
}
