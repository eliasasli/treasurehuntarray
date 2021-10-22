package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] board = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = "[ ]";
                System.out.print(board[i][j]);

            }
            System.out.println(" ");
        }
        Random random = new Random();
        int coins = random.nextInt();
        int xGuess = 0;
        int yGuess = 0;
    }

    public static int getX(int x) {
        Random random = new Random();
        int xNum = random.nextInt(x);
        return xNum;
    }

    public static int getY(int y) {
        Random random = new Random();
        int yNum = random.nextInt(y);
        return yNum;


        }

                }


            }

