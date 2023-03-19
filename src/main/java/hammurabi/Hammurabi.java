package hammurabi;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Hammurabi {

    static int totalDeaths = 0;
    int percentDied = 0;
    int year = 0;
    int population = 95;
    int stores = 2800;
    int immigrants = 5;
    int deaths;
    int harvest = 3000;
    int yeild = 3, acres = harvest / yeild;
    int eaten = harvest - stores;
    int landPrice;
    int fullPeople;
    int temp;
    int plagueDeaths;
    static boolean plague = false;
    final static String FINK = "DUE TO THIS EXTREME MISMANAGEMENT YOU HAVE NOT ONLY\n" +
            "BEEN IMPEACHED AND THROWN OUT OF OFFICE BUT YOU HAVE\n" +
            "ALSO BEEN DECLARED PERSONA NON GRATA!!\n";
    static Random random = new Random();
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        new Hammurabi().playGame();

    }

    void playGame() {
        year += 1;
        population += immigrants;

        int landprice = newCostOfLand();
        System.out.println("O great Harambe!\n" +
                        "You are in year " + year + " of your ten year rule.\n" +
                        "In the previous year " + totalDeaths + " people starved to death.\n" +
                        "In the previous year " + immigrants +" people entered the kingdom.\n" +
                        "The population is now " + population + ".\n" +
                        "We harvested" + harvest + " bushels at " + yeild + " bushels per acre.\n" +
                        "Rats destroyed 200 bushels, leaving " + stores + " bushels in storage.\n" +
                        "The city owns 1000 acres of land.\n" +
                        "Land is currently worth 19 bushels per acre.");

        //initial variables
        int population = 100;
        int bushels = 2800;
        int acresOfLand = 1000;
        int bushelsPerAcre = 19; //price

        while (year <= 10 && population > 0 && bushels > 0){

        }


    }


    public int askHowManyAcresToBuy(int price, int bushels) {
        int acresToBuy = 0;
        while (true) {
            System.out.print("How many acres would you like to purchase?");
            try {
                acresToBuy = input.nextInt();
                if(acresToBuy*price <= bushels){
                    return acresToBuy;
                }
                System.out.println("You don't have enough bushels!");
            }
            catch (InputMismatchException e) {
                System.out.println("\"" + input.next() + "\" isn't a number!");
            }

        }

    }

    public int askHowManyAcresToSell(int acresOwned) {
    int acresToSell = 0;
        while (true) {
            System.out.print("How many acres would you like to sell?");
            try {
                acresToSell = input.nextInt();
                if (acresToSell <= acresOwned) {
                    return acresToSell;
                }
                System.out.println("You don't have that many acres to sell!");
            }
            catch (InputMismatchException e) {
                System.out.println("\"" + input.next() + "\" isn't a number!");
            }

        }
    }

    public int askHowMuchGrainToFeedPeople(int bushels) {
        int bushelsToFeed = 0;
        while (true) {
            System.out.println("How much of your grain should be fed to the people?");
            try {
                bushelsToFeed = input.nextInt();
                if (bushelsToFeed <= bushels) {
                    return bushelsToFeed;
                }
                System.out.println("You do not have enough bushels for that!");
            } catch (InputMismatchException e) {
                System.out.println("\"" + input.next() + "\" isn't a number!");
            }

        }
    }

    public int askHowManyAcresToPlant(int acresOwned, int population, int bushels) {
        int acresToPlant = 0;
        while (true) {
            System.out.println("How many acres would you like to plant with grain?");
            try {
                acresToPlant = input.nextInt();
                if (acresToPlant <= acresOwned) {
                    return acresToPlant;
                }
                System.out.println("You do not have enough acres for that!");
            } catch (InputMismatchException e) {
                System.out.println("\"" + input.next() + "\" isn't a number!");
            }

        }
    }

    public int plagueDeaths(int population) {
        int sickDeaths = 0;
        return 0;
      }

    public int starvationDeaths(int population, int bushelsFedToPeople) {
        int pplStarved = 0;
        return 0;
     }

    public boolean uprising(int population, int howManyPeopleStarved) {
        return false;
    }

        public int immigrants(int population, int acresOwned, int grainInStorage) {
        int newComers = 0;
        return 0;
    }

    public int harvest(int acres, int bushelsUsedAsSeed) {
        int money = 0;
        return 0;
    }

    public int grainEatenByRats(int bushels) {
        Random random = new Random();
        int grainEaten = 0;

        // 40% chance of rat infestation
        if (random.nextDouble() < 0.4) {
            // Rats eat between 10% and 30% of the grain
            double eatenPercentage = 0.1 + random.nextDouble() * 0.2;
            grainEaten = (int) Math.round(bushels * eatenPercentage);


        }
        return 0;
    }
        public int newCostOfLand(){
            int[] costOfLand = new int[]{17, 18, 19, 20, 21, 22, 23};
            int randomIndex = random.nextInt(costOfLand.length);
            int randomNumber = costOfLand[randomIndex];

            return 0;
        }


}