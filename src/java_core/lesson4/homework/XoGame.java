package java_core.lesson4.homework;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class XoGame {
    public static final char FILL_EMPTY = '_';
    public static final char FILL_X = 'X';
    public static final char FILL_0 = '0';
    static int fieldSize = 5; // от 3ех до любых адекватных размеров
    public static char[][] tab = new char[fieldSize][fieldSize];
    static int[] playerAnswer = {0, 0, 0}; //player number,
    static boolean PCinGame = true;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        if (args != null && args.length != 1) { //todo CMD args
//            new XoGame().startGame(Integer.parseInt(args[0]));
//        } else {
        new XoGame().startGame(fieldSize);
        //    }

    }

    private static void checkForWinVertical(int column, int cell) {
        for (int i = column; i <= column + 3; i++) {
            if (tab[cell][i] == FILL_X
                    && tab[cell + 1][i] == FILL_X
                    && tab[cell + 2][i] == FILL_X
                    && tab[cell + 3][i] == FILL_X) {
                System.out.println("<<< X WiN >>>");
                System.exit(1);
            } else if (tab[cell][i] == FILL_0
                    && tab[cell + 1][i] == FILL_0
                    && tab[cell + 2][i] == FILL_0
                    && tab[cell + 3][i] == FILL_0) {
                System.out.println("<<< 0 WiN >>>");
                System.exit(1);
            }
        }
    }

    private static void checkForWinHorizontal(int row, int cell) {
        for (int i = row; i <= row + 3; i++) {
            if (tab[i][cell] == FILL_X
                    && tab[i][cell + 1] == FILL_X
                    && tab[i][cell + 2] == FILL_X
                    && tab[i][cell + 3] == FILL_X) {
                System.out.println("X WiN");
                System.exit(0);
            } else if (tab[i][cell] == FILL_0
                    && tab[i][cell + 1] == FILL_0
                    && tab[i][cell + 2] == FILL_0
                    && tab[i][cell + 3] == FILL_0) {
                System.out.println("0 WiN");
                System.exit(0);
            }
        }


    }

    private static void checkForWinDiagonal(int string, int column) {
        //   System.out.println("CFD STR_COL= "+ string+" "+column);
        // System.out.println();
        if ((tab[string][column] == FILL_X
                && tab[string + 1][column + 1] == FILL_X
                && tab[string + 2][column + 2] == FILL_X
                && tab[string + 3][column + 3] == FILL_X)
                || (tab[string][column + 3] == FILL_X
                && tab[string + 1][column + 2] == FILL_X
                && tab[string + 2][column + 1] == FILL_X
                && tab[string + 3][column] == FILL_X)) {
            System.out.println("<<< X WiN Diagonally>>>");
            System.exit(0);
        }
        if ((tab[string][column] == FILL_0
                && tab[string + 1][column + 1] == FILL_0
                && tab[string + 2][column + 2] == FILL_0
                && tab[string + 3][column + 3] == FILL_0)
                || (tab[string][column + 3] == FILL_0
                && tab[string + 1][column + 2] == FILL_0
                && tab[string + 2][column + 1] == FILL_0
                && tab[string + 3][column] == FILL_0)) {
            System.out.println("<<< 0 WiN Diagonally>>>");
            System.exit(0);
        }
    }

    public static void printTab(char[][] tab) {
        int counter = 1;
        System.out.println();
        System.out.print("[] ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (char[] chars : tab) {
            System.out.print(counter + " ");
            counter++;
            for (char sym : chars) {
                System.out.print("|" + sym);
            }
            System.out.println("|");

        }
    }

    public static void fillTab(char[][] tab) {
        for (char[] chars : tab) {
            Arrays.fill(chars, FILL_EMPTY);
        }
    }

    public static void fillCell(int playerNumber, int positionY, int positionX) {
        char cell = FILL_0;
        if (playerNumber == 1) {
            cell = FILL_X;
        }
        if (positionY > 0 && positionX > 0
                && positionY <= tab.length && positionX <= tab.length
                && tab[positionY - 1][positionX - 1] == FILL_EMPTY) {
            tab[positionY - 1][positionX - 1] = cell;
        } else {
            System.out.println("Вы ввели неверные данные. Ход переходит к следующему игроку");
        }
    }

    public static void askForTurn(int playerNumber) {
        if (PCinGame && playerNumber == 2) {
            System.out.print("Компьютер совершает ход");
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(".");

            }
            playerAnswer = movePC(tab);
            return;
        }
        while (true) {
            int x, y;
            try {
                x = in.nextInt();
                y = in.nextInt();
                playerAnswer[0] = x;
                playerAnswer[1] = y;
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Вы ввели не цифры! Введите цифры");
                in.next();
            }
        }
    }

    private static int[] movePC(char[][] tab) {
        Random rand = new Random();
//        int x = rand.nextInt(tab.length);
//        int y = rand.nextInt(tab.length);
//        int[] result = {x, y};
        boolean isValid = true;
        int[] result = {0, 0};
        while (isValid) {
            int x1 = 1 + rand.nextInt(tab.length);
            int y1 = 1 + rand.nextInt(tab.length);
            System.out.println(x1 + " " + y1);
            if (x1 != 0 && y1 != 0) {
                if (tab[x1 - 1][y1 - 1] == FILL_EMPTY) {
                    result[0] = x1;
                    result[1] = y1;
                    return result;
                }
            }
        }

        System.out.println("PC move > " + Arrays.toString(result));
        return result;
    }

    private void startGame(int boardSize) {
        fieldSize = boardSize;
        boolean inGame = true;

        fillTab(tab);
        System.out.println("Игра крестики нолики. Игрок 1 играет за Х");
        printTab(tab);
        System.out.println("Для того, чтобы совершить" +
                " ход введите номер строки" +
                "и номер столбца таблицы через пробел." +
                " Игра ведется до '3 в ряд' при поле 3х3 и до '4 в ряд' " +
                " при поле 4х4 и более.");
        int turn = 1;
        while (inGame) {
            int player = 1;
            if (turn % 2 == 0) player = 2;
            if (isNoEmptyCellExist()) {
                System.out.println("No more available moves");
                System.out.println("Endgame");
                System.exit(0);
            }
            askForTurn(player);
            fillCell(player, playerAnswer[0], playerAnswer[1]);
            printTab(tab);
            calculateVictory(tab.length);
            turn++;
        }
    }

    private void calculateVictory(int tabSize) {
        if (tabSize == 3) {
            int string = 0;
            int column = 0;
            if ((tab[string][column] == FILL_X                  //Diagonal check
                    && tab[string + 1][column + 1] == FILL_X
                    && tab[string + 2][column + 2] == FILL_X)
                    || (tab[string][column + 2] == FILL_X
                    && tab[string + 1][column + 1] == FILL_X
                    && tab[string + 2][column] == FILL_X)) {
                System.out.println("<<< X WiN Diagonally>>>");
                System.exit(0);
            }
            if ((tab[string][column] == FILL_0                  //Diagonal check
                    && tab[string + 1][column + 1] == FILL_0
                    && tab[string + 2][column + 2] == FILL_0)
                    || (tab[string][column + 2] == FILL_0
                    && tab[string + 1][column + 1] == FILL_0
                    && tab[string + 2][column] == FILL_0)) {
                System.out.println("<<< 0 WiN Diagonally>>>");
                System.exit(0);
            }

            for (int i = 0; i < tabSize; i++) {
                if (pattern3column(i) == 1) {
                    System.out.println("X WiN");
                    System.exit(0);
                } else if (pattern3column(i) == 0) {
                    System.out.println("0 WiN");
                    System.exit(0);
                }
                if (pattern3row(i) == 1) {
                    System.out.println("X WiN");
                    System.exit(0);
                } else if (pattern3row(i) == 0) {
                    System.out.println("0 WiN");
                    System.exit(0);
                }
            }
        } else if (tabSize > 3) {
            //System.out.println("TS>3");
            for (int string = 0; string < tab.length - 3; string++) {
                for (int column = 0; column < tab.length - 3; column++) {
                    checkForWinHorizontal(string, column);
                    checkForWinVertical(column, string);
                    checkForWinDiagonal(string, column);
                }
            }
        }
    }

    public int pattern3column(int column) {             //1- X, 0 - 0, -1 - none match
        if (tab[0][column] == FILL_X
                && tab[1][column] == FILL_X
                && tab[2][column] == FILL_X) {
            System.out.println("X match");
            return 1;

        } else if (tab[0][column] == FILL_0
                && tab[1][column] == FILL_0
                && tab[2][column] == FILL_0) {
            System.out.println("0 match");
            return 0;
        }
        return -1;
    }

    public int pattern3row(int row) {             //1- X, 0 - 0, -1 - none match
        if (tab[row][0] == FILL_X
                && tab[row][1] == FILL_X
                && tab[row][2] == FILL_X) {
            System.out.println("X match");
            return 1;

        } else if (tab[row][0] == FILL_0
                && tab[row][1] == FILL_0
                && tab[row][2] == FILL_0) {
            System.out.println("0 match");
            return 0;
        }
        return -1;
    }

    private boolean isNoEmptyCellExist() {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (tab[i][j] == FILL_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
