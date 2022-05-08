package ques_1;

import java.util.LinkedList;
import java.util.Scanner;

public class driver_Class {

    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int no_of_floors;

            System.out.println("Enter the total no of floors in the building");
            no_of_floors=sc.nextInt();

            LinkedList<Integer> floors=new LinkedList<>();

            //entry of the floors
            for(int i=1;i<=no_of_floors;i++) {
                System.out.println("Enter the floor size given on day : "+i);
                floors.add(sc.nextInt());
            }

            //calling the function
            functional_Class obj=new functional_Class();
            obj.floorConstruction(floors);
            sc.close();

        }
    }

