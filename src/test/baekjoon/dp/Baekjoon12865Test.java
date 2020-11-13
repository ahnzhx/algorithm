package baekjoon.dp;

import junit.framework.TestCase;

public class Baekjoon12865Test extends TestCase {
    public void test(){
        Baekjoon12865 bj = new Baekjoon12865();
//        Baekjoon12865.Product[] products = new Baekjoon12865.Product[4];
//        products[0] = new Baekjoon12865.Product(6, 13);
//        products[1] = new Baekjoon12865.Product(4, 8);
//        products[2] = new Baekjoon12865.Product(3, 6);
//        products[3] = new Baekjoon12865.Product(5, 12);
//
//        assertEquals(14, bj.solution(products, 7));

        Baekjoon12865.Product[] products2 = new Baekjoon12865.Product[4];
        products2[0] = new Baekjoon12865.Product(4, 8);
        products2[1] = new Baekjoon12865.Product(6, 13);
        products2[2] = new Baekjoon12865.Product(3, 6);
        products2[3] = new Baekjoon12865.Product(5, 12);

        assertEquals(14, bj.solution(products2, 7));

    }

}