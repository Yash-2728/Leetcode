class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rowlist = new ArrayList<>();
        ArrayList<Integer> colist = new ArrayList<>();
        
        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                if(matrix[j][i]==0){
                    rowlist.add(i);
                    colist.add(j);
                }
            }
        }

        for(int k=0; k<rowlist.size(); k++){
           int a =  rowlist.get(k);
            for(int i=0; i<matrix[0].length; i++){
                for(int j=0; j<matrix.length; j++){
                    if(i==a){
                        matrix[j][i] =0;
                    }
                }
            }
        }


        for(int k=0; k<colist.size(); k++){
           int a =  colist.get(k);
            for(int i=0; i<matrix[0].length; i++){
                for(int j=0; j<matrix.length; j++){
                    if(j==a){
                        matrix[j][i] =0;
                    }
                }
            }
        }


    
    }
}