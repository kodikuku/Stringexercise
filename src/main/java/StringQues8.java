import java.util.Arrays;
public class StringQues8 {
    public static void main(String[] args) {
        String oilWater = " oil and water";
        String []oilwater = oilWater.split("and");

        String array = Arrays.toString(oilwater);

        System.out.println(array);
    }

    public static class StringQues2 {
        public static void main(String[] args) {
            String position = "Even longer example sentence";
            int pos = position.indexOf("o");

            System.out.println(pos);
        }
    }
}
