package org.example.coderun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Петя собрал массив a 1 , a 2 , … , a n a 1 ​ ,a 2 ​ ,…,a n ​ длины n n, изначально состоящий из нулей, втайне от вас
 * промодифицировал его и стал задавать сложные вопросы про получившийся массив.
 * <p>
 * Вы знаете, что к массиву было применено подмножество таких операций, как прибавление на отрезке. Формально Петя
 * применил некоторое подмножество из q q операций, i i-я операция задаётся тремя целыми числами l i l i ​ , r i r i ​ и
 * x i x i ​ ( 1 ≤ l i ≤ r i ≤ n 1≤l i ​ ≤r i ​ ≤n), ( 1 ≤ x i ≤ n 1≤x i ​ ≤n) и означает, что к элементам a l i , a l i
 * + 1 , … , a r i a l i ​
 * <p>
 * ​ ,a l i ​ +1 ​ ,…,a r i ​
 * <p>
 * ​ прибавили число x i x i ​ .
 * <p>
 * Петя спрашивает, какие существуют целые числа от 1 1 до n n, которые могут соответствовать максимуму в массиве a i a
 * i ​ . Ответьте ему на этот вопрос.
 * <p>
 * Формат ввода В первой строке находятся два целых числа n n и q q ( 1 ≤ n , q ≤ 1 0 4 1≤n,q≤10 4 ) — длина массива и
 * количество операций.
 * <p>
 * В следующих q q строках описаны операции, по одной в строке. i i-я из этих строк содержит три целых числа l i l i ​ ,
 * r i r i ​ и x i x i ​ ( 1 ≤ l i ≤ r i ≤ n 1≤l i ​ ≤r i ​ ≤n, 1 ≤ x i ≤ n 1≤x i ​ ≤n), что обозначает операцию
 * добавления числа x i x i ​ на отрезке с l i l i ​ -го по r i r i ​ -й элемент включительно.
 * <p>
 * Формат вывода В первую строку выведите единственное число k k, обозначающее количество возможных целых чисел от 1 1
 * до n n, которым может быть равен максимум в массиве после применения некоторого (возможно, пустого) подмножества
 * данных операций.
 * <p>
 * В следующей строке выведите через пробел все k k чисел от 1 1 до n n — возможные значения максимума. Выводите эти
 * числа в возрастающем порядке.
 * <p>
 * Примечание Если в первом тестовом примере оставить только первый запрос, то максимум будет равен 1 1. Если оставить
 * только второй запрос, то максимум будет равен 2 2. Если оставить первые два запроса, то максимум будет равен 3 3.
 * Если оставить только третий запрос, то максимум будет равен 4 4. Но если оставить третий запрос и ещё какой-то,
 * максимум будет больше n n, поэтому его выводить не требуется.
 * <p>
 * Во втором тестовом примере, оставив только первый запрос, можно получить 1 1. Оставив только второй, можно получить 2
 * 2. А если оставить все запросы, максимум будет равен 3 3.
 * <p>
 * В третьем тестовом примере можно получить максимумы так:
 * <p>
 * Можно получить максимум 2 2, оставив запросы: ( 1 ) (1). Можно получить максимум 3 3, оставив запросы: ( 2 ) (2).
 * Можно получить максимум 5 5, оставив запросы: ( 1 , 2 ) (1,2). Можно получить максимум 6 6, оставив запросы: ( 3 )
 * (3). Можно получить максимум 8 8, оставив запросы: ( 1 , 3 ) (1,3).
 */
public class QuestMaximum {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] firstLine = reader.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int q = Integer.parseInt(firstLine[1]);
        int max = n;
        String[][] ops = new String[3][q];
        int idx = 0;
        while (idx < q) {
            String[] s = reader.readLine().split(" ");
            ops[idx++] = s;
        }
        System.out.println(ops);

        reader.close();
        writer.close();
    }

    private static boolean isIntervalsIntersected(String[] intrvl1, String[] intrvl2) {
        return !(Integer.parseInt(intrvl1[0]) > Integer.parseInt(intrvl2[1]) || Integer.parseInt(intrvl1[1]) < Integer.parseInt(intrvl2[0]));
    }
}
