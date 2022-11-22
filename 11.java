// https://leetcode.com/problems/pascals-triangle/
class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> allrows = new ArrayList<List<Integer>>();
         ArrayList<Integer> row = new ArrayList<>();
         for(int i=0;i<numRows;i++){
             row.add(0,1);
            // System.out.println("row: "+row);
             for(int j=1;j<row.size()-1;j++){
                 row.set(j,row.get(j)+row.get(j+1));
              //   System.out.println("row set: "+row);
             }
                 allrows.add(new ArrayList<>(row));
                // System.out.println("allRows: "+allrows);
        }
        return allrows;
    }
}

/*row: [1]
allRows: [[1]]
row: [1, 1]
allRows: [[1], [1, 1]]
row: [1, 1, 1]
row set: [1, 2, 1]
allRows: [[1], [1, 1], [1, 2, 1]]
row: [1, 1, 2, 1]
row set: [1, 3, 2, 1]
row set: [1, 3, 3, 1]
allRows: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1]]*/
