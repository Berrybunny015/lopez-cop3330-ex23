package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //variable declarations
        String yesResponse = "y";
        String noResponse = "n";

        System.out.println("\nIs the car silent when you turn the key? (y for yes / n for no) "); //ask for the first question
        Scanner responseOneInput = new Scanner(System.in); //scan for the first response
        String responseOne = responseOneInput.next();

        if (responseOne.equals(yesResponse)) { //if the user responds with yes
            System.out.println("\nAre the battery terminals corroded? (y / n) "); //ask for the second question
            Scanner responseTwoInput = new Scanner(System.in); //scan for the second response
            String responseTwo = responseTwoInput.next();

            if (responseTwo.equals(yesResponse)) { //if the user responds with yes
                System.out.println("\nClean terminals and try starting again.");
            }
            else if (responseTwo.equals(noResponse)) { //if the user responds with no
                System.out.println("\nReplace cables and try again.");
            }
        }
        else if (responseOne.equals(noResponse)) { //if the user responds with no
            System.out.println("\nDoes the car make a slicking noise? (y / n) "); //ask for the second question
            Scanner responseTwoInput = new Scanner(System.in); //scan for the second response
            String responseTwo = responseTwoInput.next();

            if (responseTwo.equals(yesResponse)) { //if the user responds with yes
                System.out.println("\nReplace the battery.");
            }
            else if (responseTwo.equals(noResponse)) { //if the user responds with no
                System.out.println("\nDoes the car crank up but fail to start? (y / n) "); //ask for the third question
                Scanner responseThreeInput = new Scanner(System.in); //scan for the third response
                String responseThree = responseThreeInput.next();

                if (responseThree.equals(yesResponse)) { //if the user responds with yes
                    System.out.println("\nCheck spark plug connections.");
                }
                else if (responseThree.equals(noResponse)) { //if the user responds with no
                    System.out.println("\nDoes the engine start and then die? (y / n) "); //ask for the fourth question
                    Scanner responseFourInput = new Scanner(System.in); //scan for the fourth response
                    String responseFour = responseFourInput.next();

                    if (responseFour.equals(yesResponse)) { //if the user responds with yes
                        System.out.println("\nDoes your car have a fuel injection? (y / n) "); //ask for the fifth question
                        Scanner responseFiveInput = new Scanner(System.in); //scan for the fifth response
                        String responseFive = responseFiveInput.next();

                        if (responseFive.equals(yesResponse)) { //if the user responds with yes
                            System.out.println("\nGet it in for service.");
                        }
                        else if (responseFive.equals(noResponse)) { //if the user responds with no
                            System.out.println("\nCheck to ensure the choke is opening and closing.");
                        }
                    }
                    else if (responseFour.equals(noResponse)) { //if the user responds with no
                        System.out.println("\nThis should not be possible.");
                    }
                }
            }
        }
    }
}