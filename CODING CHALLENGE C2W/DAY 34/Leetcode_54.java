class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> list= new ArrayList<Integer>();


        int n=matrix.length;
        int m=matrix[0].length;

        int startRow=0;
        int startCol=0;
        int endRow=n-1;
        int endCol=m-1;

        while(startRow<=endRow && startCol<=endCol){
            // printing top part of matrix...
            

            for(int j=startCol;j<=endCol;j++){

                list.add(matrix[startRow][j]);
            }

            // printing RIGHT part of the matrix...

            for(int i=startRow+1;i<=endRow;i++){
                list.add(matrix[i][endCol]); 
            }

            // printing BOTTOM part of the matrix...

            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                break;
            }
                list.add(matrix[endRow][j]);

            }

            //printing LEFT part of matrix....

            for(int i=endRow-1;i>startRow;i--){

                if(startCol==endCol){
                    break;
                }
                list.add(matrix[i][startCol]);
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }

        return list;
        
    }
}