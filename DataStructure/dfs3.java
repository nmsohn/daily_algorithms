public class DFS{
    static int E;
    static int V;
    static int[][] adj;
    static boolean[] visit;

    public static void dfs(int i){
        visit[i] = true;
        System.out.print(i + " ");

        for(int j = 1; j < V + 1; j++){
            if(adj[i][j] == 1 && visit[j] == false){
                dfs(j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        nV = scan.nextInt();
        nE = scan.nextInt();
        ad = new int[nV+1][nV+1]; // 변수 초기화
        visit = new boolean[nV+1]; // 변수 초기화
        
        for(int i = 0; i < nE; i++){
            int t1 = scan.nextInt();
            int t2 = scan.nextInt();
            
            ad[t1][t2] = ad[t2][t1] = 1;
        }
        
        dfs(1); // 1번부터 탐색 시작
        
    }
}