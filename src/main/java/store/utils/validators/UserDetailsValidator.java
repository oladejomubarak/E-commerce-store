package store.utils.validators;

import store.data.dto.BuyerRegistrationRequest;

public class UserDetailsValidator {
    public static boolean isValidPassword
            (String password) {
        return password.matches("[a-zA-Z-Z0-9(@#$!_)]{8,20}");
    }

   public static boolean isValidBuyerPhoneNumber(String phoneNumber) {
        return phoneNumber.length() == 11;
    }

    public static boolean isValidBuyerEmailAdrress(String email) {
        return email.contains("@");
    }




}
