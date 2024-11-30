package ch04_factory.solution.P4_2.factory_pattern.utils;

import java.security.SecureRandom;

public class Utils {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    public static String generateRandomString(int length){
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);

        for(int i = 0; i < length; i++){
            int random = secureRandom.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(random));
        }

        return sb.toString();
    }
}
