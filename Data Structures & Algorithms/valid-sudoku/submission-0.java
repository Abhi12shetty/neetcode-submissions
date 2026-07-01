class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean res = true;
        Map<Integer,  Set<Character>> map = new HashMap<>();
        //ROWS CHECK
        for(int i=0;i<board.length;i++){
            Set<Character> rowSet = new HashSet<Character>();
            Set<Character> columnSet = new HashSet<Character>();
            for(int j=0;j<board[i].length;j++){
                //ROWS
                if(rowSet.contains(board[i][j])){
                    res=false;
                    System.out.println("break point 1");
                    break;
                }else if(Character.isDigit(board[i][j])){
                    rowSet.add(board[i][j]);
                }

                //COLUMNS
                if(columnSet.contains(board[j][i])){
                    res=false;
                    System.out.println("break point 2");
                    break;
                }else if(Character.isDigit(board[j][i])){
                    columnSet.add(board[j][i]);
                }

                //3x3 GRID
                int reg = ((i/3)*3)+j/3;
                if(map.containsKey(reg)){
                    Set<Character> s = map.get(reg);
                    if(s.contains(board[i][j])){
                        res=false;
                        break;
                    }
                    if(Character.isDigit(board[i][j])){
                        System.out.println("update"+i + " " + j + "-" + board[i][j]);
                        s.add(board[i][j]);
                        map.put(reg, s);
                    }
                }else{
                    
                    if(Character.isDigit(board[i][j])){
                        System.out.println("insert"+i + " " + j + "-" + board[i][j]);
                        map.put(reg, new HashSet<Character>(List.of(board[i][j])));
                    }
                }
            }
            if(res==false)
                break;
            //System.out.println();
        }
       
        for (Map.Entry<Integer, Set<Character>> entry : map.entrySet()) {
            Integer mapKey = entry.getKey();
            Set<Character> setValues = entry.getValue();
            System.out.println("Key: " + mapKey);
            for (Character setValue : setValues) {
                System.out.println("  HashSet Value: " + setValue);
            }
        }
        
        
        
        return res;
    }
}
