package org;

import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    private final Scanner scan = new Scanner(System.in);

    public UI(){

    }

    public static void UIfForPart1(){
        
    }

    public static void UIfForPart2(){
        System.out.print("Please enter your universe size :");
        int universeSize = scan.nextInt();

        System.out.println("------------------------------------------------");
        System.out.printf("Please enter your universe (%d Strings) : \n",universeSize);

        ArrayList<String> universe = new ArrayList<>();
        for (int i = 0; i < universeSize; i++) {
            String element = scan.next();
            universe.add(element);
        }

        MySet set = new MySet(universe);

        System.out.println("------------------------------------------------");
        System.out.print("Please enter number of sets :");

        int setsSize = scan.nextInt();
        System.out.printf("Please enter your sets (%d Sets) : \n",setsSize);
        System.out.println("---------------------------------");

        ArrayList<ArrayList<String>> sets = new ArrayList<>();
        for (int i = 0; i < setsSize; i++) {
            System.out.printf("Please enter set %d size :",i+1);
            int setSize = scan.nextInt();
            ArrayList<String> setI = new ArrayList<>();

            System.out.printf("Please enter set (%d Strings) :\n",setsSize);
            for (int j = 0; j < setSize; j++) {
                String s = scan.next();
                setI.add(s);
            }
            sets.add(setI);
        }

        set.setSets(sets);

        while(true){
            System.out.println("------------------------------------------------");

            System.out.print("Universe = ");
            System.out.println(set.getUniverse());
            for (int i = 0; i < set.getSets().size(); i++) {
                System.out.printf("Set %d = ",i+1);
                System.out.println(set.getSets().get(i));
            }

            System.out.println();
            System.out.println("Operations");
            System.out.println("1- Union");
            System.out.println("2- Intersection");
            System.out.println("3- Complement");
            System.out.println("4- End Program");
            System.out.print("Choose an Operation : ");

            int operation = scan.nextInt();
            switch (operation){
                case 1 :
                    System.out.println("Enter 2 Indexes :");
                    int index1 = scan.nextInt();
                    int index2 = scan.nextInt();
                    System.out.println(set.Union(index1-1,index2-1));
                    break;
                case 2 :
                    System.out.println("Enter 2 Indexes :");
                    index1 = scan.nextInt();
                    index2 = scan.nextInt();
                    System.out.println(set.Intersection(index1-1,index2-1));
                    break;
                case 3 :
                    System.out.println("Enter an Index :");
                    int index = scan.nextInt();
                    System.out.println(set.Complement(index-1));
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Error , Enter a Valid Input");
            }

            try {
                Thread.sleep(1500);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void UIfForPart3(){

    }
}
