public class Main {
    final static int ROWS = 4;
    final static int COLS = 4;

    public static double neighborAverage(int[][] values, int row, int column) {
        int i = row;
        int j = column;
        double total = 0;
        int count = 0;

        if (i == 0) {
            if (j == 0) {
                total = values[i][j + 1]
                        + values[i + 1][j]
                        + values[i + 1][j + 1];
                count = 3;
            }


            if ((j > 0) && (j != COLS - 1)) {
                total = values[i][j - 1]
                        + values[i][j + 1]
                        + values[i + 1][j]
                        + values[i + 1][j + 1]
                        + values[i + 1][j - 1];
                count = 5;
            }
            if ((j > 0) && (j == COLS - 1)) {
                total = values[i][j - 1]
                        + values[i + 1][j]
                        + values[i + 1][j - 1];
                count = 3;
            }
        } else if (i == ROWS - 1) {
            if (j == 0) {
                total = values[i - 1][j]
                        + values[i - 1][j + 1]
                        + values[i][j + 1];
                count = 3;
            }

            if ((j > 0) && (j != COLS - 1)) {
                total = values[i][j - 1]
                        + values[i][j + 1]
                        + values[i - 1][j]
                        + values[i - 1][j + 1]
                        + values[i - 1][j - 1];
                count = 5;
            }

            if ((j > 0) && (j == COLS - 1)) {
                total = values[i][j - 1]
                        + values[i - 1][j]
                        + values[i - 1][j - 1];
                count = 3;
            }
        } else if (j == 0) {
            if (i == 0) {
                total = values[i][j + 1]
                        + values[i + 1][j]
                        + values[i + 1][j + 1];
                count = 3;
            }

            if ((i > 0) && (i != ROWS - 1)) {
                total = values[i - 1][j]
                        + values[i][j + 1]
                        + values[i - 1][j + 1]
                        + values[i + 1][j + 1]
                        + values[i + 1][j];
                count = 5;
            }

            if ((i > 0) && (i == ROWS - 1)) {
                total = values[i - 1][j + 1]
                        + values[i - 1][j]
                        + values[i][j + 1];
                count = 3;
            }
        } else if (j == COLS - 1) {
            if (i == 0) {
                total = values[i][j - 1]
                        + values[i + 1][j - 1]
                        + values[i + 1][j];
                count = 3;
            }

            if ((i > 0) && (i != ROWS - 1)) {
                total = values[i - 1][j]
                        + values[i][j - 1]
                        + values[i - 1][j - 1]
                        + values[i + 1][j - 1]
                        + values[i + 1][j];
                count = 5;
            }

            if ((i > 0) && (i == ROWS - 1)) {
                total = values[i - 1][j]
                        + values[i - 1][j - 1]
                        + values[i][j - 1];
                count = 3;
            }
        } else {
            total = total +
                    +values[i + 1][j]
                    + values[i + 1][j + 1]
                    + values[i + 1][j - 1]
                    + values[i][j - 1]
                    + values[i][j + 1]
                    + values[i - 1][j]
                    + values[i - 1][j + 1]
                    + values[i - 1][j - 1];
            count = 8;
        }

        return total / count;

    }
}