class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=9;
        HashSet<Character>[]  rowSet = new HashSet[n];
        HashSet<Character>[]  colSet = new HashSet[n];
        HashSet<Character>[]  boxSet = new HashSet[n];
        for(int x=0;x<n;x++){
            rowSet[x]=new HashSet<Character>();
            colSet[x]=new HashSet<Character>();
            boxSet[x]=new HashSet<Character>();
        }

        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                char val = board[i][j];
                if(val=='.'){
                    continue;
                }
                if(rowSet[i].contains(val)){
                    return false;
                }
                rowSet[i].add(val);

                if(colSet[j].contains(val)){
                    return false;
                }
                colSet[j].add(val);

                int index = (i/3)*3+(j/3);
                if(boxSet[index].contains(val)){
                    return false;
                }
                boxSet[index].add(val);
            }
        }
        
        return true;
    }
}
