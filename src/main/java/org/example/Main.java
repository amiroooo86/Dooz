package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        boolean win = false;
        boolean FullTable = true;
        int player = 1;
        boolean GameOver = false;
        int[][] jadval = new int[5][5];

        while(!GameOver) {
            for(int i = 0; i < 5; ++i) {
                for(int b = 0; b < 5; ++b) {
                    if (jadval[i][b] == 0) {
                        System.out.print(". ");
                    } else if (jadval[i][b] == 1) {
                        System.out.print("x ");
                    } else {
                        System.out.print("0 ");
                    }
                }

                System.out.println();
            }

            for(int i = 0; i < 5; ++i) {
                System.out.print(i + " ");
            }

            System.out.println("enter your columns player" + player);
            int players = in.nextInt();

            for(int b = 4; b >= 0; --b) {
                if (jadval[b][players] == 0) {
                    jadval[b][players] = player;
                    break;
                }
            }

            for(int i = 0; i < 5; ++i) {
                for(int j = 0; j < 2; ++j) {
                    if (jadval[i][j] == player && jadval[i][j + 1] == player && jadval[i][j + 2] == player && jadval[i][j + 3] == player) {
                        win = true;
                    }
                }
            }

            for(int i = 0; i < 2; ++i) {
                for(int j = 0; j < 5; ++j) {
                    if (jadval[i][j] == player && jadval[i + 1][j] == player && jadval[i + 2][j] == player && jadval[i + 3][j] == player) {
                        win = true;
                    }
                }
            }

            for(int i = 0; i < 2; ++i) {
                for(int j = 0; j < 2; ++j) {
                    if (jadval[i][j] == player && jadval[i + 1][j + 1] == player && jadval[i + 2][j + 2] == player && jadval[i + 3][j + 3] == player) {
                        win = true;
                    }
                }
            }

            for(int i = 4; i > 2; --i) {
                for(int j = 0; j < 2; ++j) {
                    if (jadval[i][j] == player && jadval[i - 1][j + 1] == player && jadval[i - 2][j + 2] == player && jadval[i - 3][j + 3] == player) {
                        win = true;
                    }
                }
            }

            if (win) {
                if (player == 1) {
                    player = 1;
                    System.out.println("player " + player + " is winner");
                    GameOver = true;
                } else if (player == 2) {
                    player = 2;
                    System.out.println("player " + player + " is winner");
                    GameOver = true;
                }
            } else if (player == 1) {
                player = 2;
            } else {
                player = 1;
            }

            for(int i = 0; i < 5; ++i) {
                for(int j = 0; j < 5; ++j) {
                    if (jadval[i][j] == 0) {
                        System.out.print(". ");
                    } else if (jadval[i][j] == 1) {
                        System.out.print("x ");
                    } else {
                        System.out.print("0 ");
                    }
                }

                System.out.println();
            }
        }



        }
    }
