package sk.stuba.fei.oop;

import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<>();
    static ArrayList<Integer> cpuPositions = new ArrayList<>();

    public static void main(String[] args) {

        char[][] gameboard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        while(true){
        System.out.println("Zadaj tvoju poziciu: ");
        int pozicia = KeyboardInput.readInt();
        while(playerPositions.contains(pozicia) || cpuPositions.contains(playerPositions)){
            System.out.println("position taken, enter again");
            pozicia = KeyboardInput.readInt();
        }
            placePiece(gameboard, pozicia, "player");
            String result = checkWinnger();
            if(result.length() > 0){
                System.out.println(result);
                break;

            }
        Random random = new Random();
        int cpuPos = random.nextInt(9) + 1 ;
            while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)){

                cpuPos = random.nextInt(9) + 1 ;
            }


        placePiece(gameboard,cpuPos,"cpu");
        printGameBoard(gameboard);

         result = checkWinnger();
        if(result.length() > 0){
            System.out.println(result);
            break;

        }
            System.out.println(result);
        }

    }



        public static void printGameBoard(char[][] gameboard) {
            for(char[] row : gameboard){
                for(char c : row){
                    System.out.print(c);
                }
                System.out.println();
            }

        }

        public static void placePiece(char[][] gameboard, int pozicia, String user){

        char symbol = ' ';
        if(user.equals("player")){
            symbol = 'X';
            playerPositions.add(pozicia);
        } else if (user.equals("cpu")){
            symbol = 'O';
            cpuPositions.add(pozicia);
        }

            switch (pozicia){
                case 1:
                    gameboard[0][0] = symbol;
                    break;
                case 2:
                    gameboard[0][2] = symbol;
                    break;
                case 3:
                    gameboard[0][4] = symbol;
                    break;
                case 4:
                    gameboard[2][0] = symbol;
                    break;
                case 5:
                    gameboard[2][2] = symbol;
                    break;
                case 6:
                    gameboard[2][4] = symbol;
                    break;
                case 7:
                    gameboard[4][0] = symbol;
                    break;
                case 8:
                    gameboard[4][2] = symbol;
                    break;
                case 9:
                    gameboard[4][4] = symbol;
                    break;
                default:
                    break;

            }
        }

        public static String checkWinnger(){

            List topRow = Arrays.asList(1, 2, 3);
            List midRow = Arrays.asList(4, 5, 6);
            List botRow = Arrays.asList(7, 8, 9);
            List leftCol = Arrays.asList(1, 4, 7);
            List midCol = Arrays.asList(2, 5, 8);
            List rightCol = Arrays.asList(3, 6, 9);
            List cross1 = Arrays.asList(1, 5, 9);
            List cross2 = Arrays.asList(7, 5, 3);

            List<List> winning = new ArrayList<>();
            winning.add(topRow);
            winning.add(midRow);
            winning.add(botRow);
            winning.add(leftCol);
            winning.add(midCol);
            winning.add(rightCol);
            winning.add(cross1);
            winning.add(cross2);

            for(List l : winning){
                if (playerPositions.contains(l)){
                    return "Cogratulations you won!";
                } else if (cpuPositions.contains(l)){
                    return "You lost!";
                } else if(playerPositions.size() + cpuPositions.size() == 9){
                    return "Tie";
                }
            }


            return "";
        }



    }

