package codewars;

public class RemoveVowel {

    public static void main(String[] args) {
        System.out.println(total());
    }

    public static int laLigaGoals = 45;
    public static int championsLeagueGoals;
    public static int copaDelReyGoals;

    static {
        laLigaGoals = 7;
        championsLeagueGoals = 8;
        copaDelReyGoals = 5;
    }
    // static method
    public static void initialize() {
        laLigaGoals = 10;
        championsLeagueGoals = 5;
        copaDelReyGoals = 3;
    }

    public static int total() {
        int total = laLigaGoals + championsLeagueGoals + copaDelReyGoals;
        return total;
    }
}