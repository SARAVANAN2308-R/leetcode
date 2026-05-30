class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        int row= grid.length;
        int coloumn= grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
                if(grid[i][j]=='1'){
                    count++;
                    bfs(grid,i,j);
                } 
            }
        }
        return count;
    }
    void bfs(char[][] grid ,int i,int j){
        if(i<0 ||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]== '0'){
          return;
        }
        grid[i][j]='0';
        bfs(grid,i+1,j);
        bfs(grid,i-1,j);
        bfs(grid,i,j+1);
        bfs(grid,i,j-1);
    }
}