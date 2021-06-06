/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Gracie Bliss
 */
import java.util.*;
public class apps {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("How many people? ");
        String people=in.nextLine();
        System.out.print("How many pizzas do you have? ");
        String pizzas=in.nextLine();
        System.out.print("How many slices per pizza? ");
        String slices=in.nextLine();

        int peopleNum=Integer.parseInt(people);
        int pizzasNum=Integer.parseInt(pizzas);
        int slicesNum=Integer.parseInt(slices);

        int totalSlices=pizzasNum*slicesNum;

        System.out.println(people+" people with "+pizzas+" pizzas. ("+totalSlices+" slices)");

        int slicesPerPerson=totalSlices/peopleNum;
        int slicesLeftover=totalSlices%peopleNum;

        System.out.println("Each person gets "+slicesPerPerson+" pieces of pizza.");
        System.out.print("There are "+slicesLeftover+" leftover pieces.");
    }
}
