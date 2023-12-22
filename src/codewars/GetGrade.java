package codewars;

public class GetGrade {
    public static void main(String[] args) {
        System.out.println(Grade(85,78,98));
    }
   public static char Grade(int s1, int s2, int s3) {
       int avarage = 0;
       avarage=(s1+s2+s3)/3;
       return avarage >= 90 ? 'A':avarage >= 80 ? 'B':avarage >= 70 ? 'C':avarage >= 60 ? 'D':'F';

   }

}
