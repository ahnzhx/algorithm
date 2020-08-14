package programmersPaidClass.week1;

public class Quest67679 {

    public int solution(String dirs) {
        char[] dirsArray = dirs.toCharArray();
        boolean[][] visited = new boolean[11][11];
        int row = 5;
        int col = 5;
        int answer = 0;

        for(char direction : dirsArray){
            switch (direction){
                case 'U':
                    if(row-1 >= 0){
                        if(!visited[--row][col]){
                            visited[row][col] = true;
                            answer++;
                        }
                    }
                    break;
                case 'D':
                    if(row+1 >= 0 ){
                        if(!visited[++row][col]){
                            visited[row][col] = true;
                            answer++;
                        }

                    }
                    break;
                case 'L':
                    if( col-1 >= 0){
                        if(!visited[row][--col]){
                            visited[row][col] = true;
                            answer++;
                        }

                    }
                    break;
                case 'R':
                    if(col+1 >= 0){
                        if(!visited[row][++col]){
                            visited[row][col] = true;
                            answer++;
                        }
                    }
                    break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Quest67679().solution("ULURRDLLU"));
        //System.out.println(new Quest67679().solution("LULLLLLLU"));
    }
}
