package codewars;

//    https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java

public class AbbreviateTwoWords {

    public static void main(String[] args) {
        AbbreviateTwoWords.abbrevName("TROFIN Razvan");
    }

    public static String abbrevName(String name) {
        String[] names = name.split(" ");
        //names [] = {"john", "doe"}
        //               0      1
        String firstName = names[0].toUpperCase().substring(0, 1);
        String lastName = names[1].toUpperCase().substring(0, 1);

       System.out.println(firstName + "." + lastName);

        return firstName + "." + lastName;
    }
}