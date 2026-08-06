class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<Integer> list= new ArrayList<>();
        int m=grid.length;
        int n= grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                list.add(grid[i][j]);
            }
        }
         k %= list.size();
        for (int i = 0; i < k; i++) {
            list.add(0, list.remove(list.size() - 1));
        }
         List<List<Integer>> ans = new ArrayList<>();

        int index = 0;

        for (int i = 0; i < m; i++) {
        List<Integer> row = new ArrayList<>();

         for (int j = 0; j < n; j++) {
        row.add(list.get(index++));
    }

    ans.add(row);
}
return ans;
    }}