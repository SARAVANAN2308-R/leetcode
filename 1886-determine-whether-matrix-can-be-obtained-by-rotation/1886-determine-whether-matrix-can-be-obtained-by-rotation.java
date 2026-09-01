class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        for(int k=0;k<4;k++){

            boolean same=true;

            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[0].length;j++){
                    if(mat[i][j]!=target[i][j]){
                        same=false;
                    }
                }
            }

            if(same){
                return true;
            }

            int[][] temp=new int[mat.length][mat.length];

            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[0].length;j++){
                    temp[j][mat.length-1-i]=mat[i][j];
                }
            }

            mat=temp;
        }

        return false;
    }
}