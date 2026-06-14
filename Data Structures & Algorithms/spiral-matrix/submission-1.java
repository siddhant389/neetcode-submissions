class Solution {

    private  void dfs(int r, int c, int dir, int[][] matrix, Set<String> visited, int[][] dirs, List<Integer> result) {

        if(r < 0 || r > matrix.length -1 || c < 0 || c > matrix[0].length  || 
        result.size() == matrix.length * matrix[0].length) return;

        visited.add(r+","+c);
        result.add(matrix[r][c]);

        for(int i=0; i < 4; i++){
            int nextDir = (dir+i) % 4;
            int nextR = r + dirs[nextDir][0];
            int nextC = c + dirs[nextDir][1];
            if( nextR >=0 && nextR <= matrix.length -1 && nextC >=0 && nextC <= matrix[0].length -1 &&
            !visited.contains(nextR+","+nextC)) {
                dfs(nextR, nextC, nextDir, matrix, visited, dirs, result);
                break;
            }             
        }
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        
        Set<String> visited = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        int[][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}};

        dfs(0,0,0,matrix,visited,dirs,result);

        return result;
     }
}
