public class Strings {
    public static void main(String[] args) {
        String word = "";
        //   \\S er = med mellemrum  + betyder 1 eller flere tegn   * betyder 0 eller flere
        // ? = 0 match eller 1
        System.out.println("0045.27357750".matches("\\d\\d\\d\\d[-.]\\d{8}"));
    }
}
