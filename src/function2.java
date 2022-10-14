public class function2 {

    public static void main(String [] args) {
        String [] SA = {"salami", "naxvamdis", "jvm", "kodireba", "mgoni", "imushavebs", "imedia"};
        smallest(SA);
        System.out.println("yvelaze pataraa :" + smallest(SA));
    }

    public static String smallest(String SA[]) {
        String first = SA[0];
        for (int i = 1 ; i < SA.length ; i++) {
            if (SA[i].length()<first.length()) {
                first = SA[i];
            }
        }
        return first;
    }
}