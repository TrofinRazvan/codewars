package codewars;
//www.codewars.com/kata/563b662a59afc2b5120000c6/train/java
public class PopulationGrowth {

    public static void main(String[] args) {

        int initialPopulation = 1000;
        int targetPopulation = 1200;
        double growthRate = 0.02;
        int newInhabitantsPerYear = 50;

        int years = 0;
        while (initialPopulation < targetPopulation) {
            initialPopulation += (int) (initialPopulation * growthRate) + newInhabitantsPerYear;
            years++;
        }
        System.out.println("The town needs " + years + " years to reach a population of " + targetPopulation + " or more.");
    }
}