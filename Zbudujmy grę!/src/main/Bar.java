package main;

import java.util.Scanner;

public class Bar {
    public static void whatDoYouWant() {
        Scanner scanner = new Scanner(System.in);
        String orderInformation = null;
        int shotInformation;
        String somethingElse;
        final double BEER = 4.50;
        final int SHOT = 10;
        final int WHISKY = 15;
        final int CHEESBURGER = 5;
        final int BOURBON = 15;
        final int PARADISE = 30;

        System.out.println("What do you want to order?");
        orderInformation = scanner.next();
        switch (orderInformation) {
            case "beer": {
                System.out.println("Here you are, your " + orderInformation);
                System.out.println("Do you want something else?");
                somethingElse = scanner.next();
                if (somethingElse.equals("yes") || somethingElse.equals("Yes")) {

                    whatDoYouWant();
                    System.out.println("It will be: " + BEER);

                    break;
                } else {
                    System.out.println("It will be: " + BEER);
                }
            }
            case "shot": {
                System.out.println("How many shot’s do you want?");
                shotInformation = scanner.nextInt();
                System.out.println("Do you want something else?");
                somethingElse = scanner.next();
                if (somethingElse.equals("yes") || somethingElse.equals("Yes")) {

                    whatDoYouWant();

                    System.out.println("It will be: " + SHOT * shotInformation);
                    break;
                } else {
                    System.out.println("It will be: " + SHOT * shotInformation);
                    break;
                }
            }

            case "whisky": {
                System.out.println("Here you are, your " + orderInformation);
                System.out.println("Do you want something else?");
                somethingElse = scanner.next();
                if (somethingElse.equals("yes") || somethingElse.equals("Yes")) {

                    whatDoYouWant();

                    System.out.println("It will be: " + WHISKY);
                    break;
                } else {
                    System.out.println("It will be: " + WHISKY);
                    break;
                }
            }
            case "bourbon": {
                System.out.println("Here you are, your " + orderInformation);
                System.out.println("Do you want something else?");
                somethingElse = scanner.next();
                if (somethingElse.equals("yes") || somethingElse.equals("Yes")) {

                    whatDoYouWant();
                    System.out.println("It will be: " + BOURBON);
                    break;
                } else {
                    System.out.println("It will be: " + BOURBON);
                    break;
                }
            }
            case "cheesburger": {
                System.out.println("Here you are, your " + orderInformation);
                System.out.println("Do you want something else?");
                somethingElse = scanner.next();
                if (somethingElse.equals("yes") || somethingElse.equals("Yes")) {

                    whatDoYouWant();
                    System.out.println("It will be: " + CHEESBURGER);
                    break;
                } else {
                    System.out.println("It will be: " + CHEESBURGER);
                    break;
                }
            }
            default:{
                System.out.println("We don’t have " + orderInformation);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String orderInformation = null;
        int shotInformation;
        String somethingElse;

        // Price of items //

        final double BEER = 4.50;
        final int SHOT = 10;
        final int WHISKY = 15;
        final int CHEESBURGER = 5;
        final int BOURBON = 15;

        // Price of drinks //

        final int PARADISE = 30;
        System.out.println("Welcome in our bar");
        whatDoYouWant();
        System.out.println("Thanks for your order!\nReally appreciate that");
    }
}

