public class multipleTable {
    public static void main(String[] args) {
        int row = Integer.parseInt(args[0]);
        int column = Integer.parseInt(args[1]);
        int[][] table = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        // for(int i=0;i<row;i++){
        // for(int j=0;j<column;j++){
        // System.out.print(table[i][j]+"\t");
        // }
        // System.out.println();
        // }
        for (int sda[] : table) {
            for (int prod : sda) {
                System.out.print(prod+"\t");
            }
            System.out.println();
        }
        
    }
}
