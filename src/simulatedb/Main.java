package simulatedb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // initialize the variables and instructions
        System.out.println("DUMMY DATABASES");
        System.out.println("Please enter first id(integer) and then Name(String)\n");

        ArrayList<HashMap<Integer,String>> myDummyDB = new ArrayList<>();
        HashMap<Integer, String> myFillDummyDataDB = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        myFillDummyDataDB.put(0, "test name 0");
        myFillDummyDataDB.put(1, "test name 1");
        myFillDummyDataDB.put(2, "test name 2");

        myDummyDB.add(myFillDummyDataDB);

        HashMap<Integer, String> myDummyCacheDB = new HashMap<>();

        String input = "";

        //get the data with a infinite loop
        while (!input.equals("quit")){
            System.out.print("Enter an option Quit, Query, Add  => ");
            input = scanner.next().toLowerCase();
            switch (input){
                // add operation to the database
                case "add":
                    int id;
                    String name;
                    while (true){
                        try{
                            System.out.print("Enter an id=> ");
                            input = scanner.next().toLowerCase();
                            id = Integer.parseInt(input);
                            break;
                        }catch (Exception e){
                            System.out.println("Please enter a valid number");
                        }
                    }
                    if(myDummyCacheDB.get(id) == null){
                        for(HashMap<Integer,String> item:myDummyDB){
                            if(item.get(id) == null){
                                System.out.print("Enter a name=> ");
                                name = scanner.next().trim();
                                myDummyCacheDB.put(id,name);
                                System.out.println("New user add id= "+ id +" name= "+myDummyCacheDB.get(id));
                            }else {
                                System.out.println("User with id= "+id +" and name= "+ item.get(id) + " already in DB");
                            }
                        }
                    }else{
                        System.out.println("User with the= "+id +" and name= " + myDummyCacheDB.get(id) + "already in DB");
                    }
                    break;
                case "query":
                    // query operation
                    while (true){
                        try{
                            System.out.print("Enter an id=> ");
                            input = scanner.next().toLowerCase();
                            id = Integer.parseInt(input);
                            break;
                        }catch (Exception e){
                            System.out.println("Please enter a valid id");
                        }
                    }
                    if(myDummyCacheDB.get(id) == null){
                        for(HashMap<Integer,String> item:myDummyDB){
                            if(item.get(id) == null){
                                System.out.println("the user is not in the DB please add");
                                System.out.print("Enter a name=> ");
                                name = scanner.next().trim();
                                myDummyCacheDB.put(id,name);
                                System.out.println("New user add id= "+ id +" name= "+myDummyCacheDB.get(id));
                            }else {
                                System.out.println("User with id= "+id +" and name= "+ item.get(id) + " already in DB");
                            }
                        }
                    }else{
                        System.out.println("User with the id= "+id +" and name= " + myDummyCacheDB.get(id) + "already in DB");
                    }
                    break;
                case "quit":
                    System.out.println("disconnect from DB");
                    break;
            }
        }
    }
}
