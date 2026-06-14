class Solution {
    private void dfs(int r, int c, char[][] grid, Set<String> visited, int[][] directions) {

        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length) return;
        String key = r+","+c;
        if(visited.contains(key)) return;
        if(grid[r][c] == '0') return;

        visited.add(key);

        for(int[] d : directions) {
            dfs(r+d[0], c+d[1], grid, visited, directions);
        }
            
       
    }
    public int numIslands(char[][] grid) {

        int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        int result = 0;
        Set<String> visited = new HashSet<>();

        for(int r=0; r < grid.length; r++) {
            for(int c=0; c < grid[0].length; c++){
                String key = r +","+c;
                if(!visited.contains(key) && grid[r][c] == '1') {
                    dfs(r, c, grid, visited, directions);
                    result++;
                }
            }
        }
        return result;
    }
}
