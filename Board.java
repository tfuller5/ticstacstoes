package tictactoe;

public class Board {
    private int rows;
    private int columns;
    private String naughts = "O";
    private String crosses = "X";
    private String empty = " _ ";

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public String displayBoard(int columns, int rows) {
        // loops have 1 rule: any code inside a loop gets repeated

        //below loops for each row
        for (int i = 1; i <= rows; i++) {
            //below prints one row
            for(int f = 1; f <= columns; f++) { // entire loop happens 3 times
                System.out.print(empty); // 5 times: 20 times total, how many new lines?
            }
            System.out.println();
        }
        String move_message = 1 + " and " + rows + " for the rows, and between " + 1 + " and " + columns + " for the colums ";
        return move_message; // start new line
    }
}
