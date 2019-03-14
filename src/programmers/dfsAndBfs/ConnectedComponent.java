package programmers.dfsAndBfs;

import java.util.ArrayList;

public class ConnectedComponent {
    public static void dfs(ArrayList<Integer>[] a, boolean[] c, int x){
        if(c[x])
            return ;
        c[x] = true;
        for(int y : a[x]){
            if(c[y] = false)
                dfs(a,c,y);
        }
    }

    public static void main(String[] args) {

    }
}
