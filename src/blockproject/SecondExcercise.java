package blockproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondExcercise {
    public static void main(String[] args) {
        // initialize the variables and rules of the app
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡HOW MANY BLOCKS WE NEED!");
        System.out.println("Enter the number of blocks per column remember\n" +
                "that at the end the sum all the blocks must be\na multiple of the number of columns you add, " +
                "to\nfinish adding columns you must write QUIT\n");
        int totalSum = 0;
        ArrayList<Integer> blocksList = new ArrayList<>();
        String input = "";
        int columnId = 1;

        // Get the data and handle errors
        while (!input.equals("quit")){
            try{
                System.out.print("Number of blocks per colum("+columnId+") o type quit=> ");
                input = scanner.next().toLowerCase();
                if(input.equals("quit")){
                    break;
                }
                int item = Integer.parseInt(input);
                totalSum += item;
                blocksList.add(item);
                columnId += 1;
            }catch (Exception e){
                System.out.println("Please enter a valid number");
            }
        }

        // With the data do the operations to know the blocks missing
        try{
            if(blocksList.size() == 1) {
                System.out.println("the number of colums is not a multiple of the total amount of blocks");
            }
            else{
                int max_value = Collections.max(blocksList);
                System.out.println(max_value);
                int amountBlocksToMove = 0;
                for(Integer item :blocksList){
                    int checkNumber = item -max_value;
                    if(checkNumber < 0){
                        amountBlocksToMove += Math.abs(checkNumber);
                    }
                }
                if(amountBlocksToMove > 0){
                    System.out.println("\n You have to move " + amountBlocksToMove + " blocks");
                }else {
                    System.out.println("All your columns are equals");
                }
            }
        }catch (Exception e){
            System.out.println("Please add at least one column");
        }

    }
}
