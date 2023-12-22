package codewars;

public class AgeCalculator {

    public static void main(String[] args) {
        System.out.println(calculateAge(2027,2023));
    }

    public static String calculateAge(int birth, int currentYear) {
        int age = currentYear - birth;

        if (age > 0) {
            return "You are " + age + (age == 1 ? " year" : " years") + " old.";
        } else if (age < 0) {
            return "You will be born in " + Math.abs(age) + (Math.abs(age) == 1 ? " year." : " years.");
        } else {
            return "You were born this year!";
        }
    }
}