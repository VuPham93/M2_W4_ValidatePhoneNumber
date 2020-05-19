import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String PHONE_NUMBER_REGEX = "^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$";

    public static boolean validPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] phoneNumbers = {"(84)-(0978489648)", "(a8)-(22222222)"};

        System.out.println("Check result: ");
        for (String phoneNumber: phoneNumbers) {
            System.out.println(validPhoneNumber(phoneNumber));
        }
    }
}
