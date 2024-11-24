package ru.netology.data;

import com.github.javafaker.Faker;
import lombok.Value;

import java.util.Locale;

public class DataHelper {
    private static Faker faker = new Faker(new Locale("en"));

    private DataHelper() {
    }

    public static AuthInfo getAuthInfoWithTestData() {
        return new AuthInfo("vasya", "qwerty123");
    }


    private static String generateRandomLogin() {
        return faker.name().username();
    }

    private static String generateRandomPassword() {
        return faker.internet().password();
    }

    public static AuthInfo generateRandomUser() {
        return new AuthInfo(generateRandomLogin(), generateRandomPassword());
    }

    public static VerificationCode generateRandomVerificationCode() {
        var verificationCode = new VerificationCode(faker.numerify("######"));
        return verificationCode;
    }

    @Value
    public static class AuthInfo {
        String login;
        String password;

        public AuthInfo(String s, String s1) {
            
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getPassword() {
            return password;
        }
    }

    @Value
    public static class VerificationCode {
        String code;

        public VerificationCode(String numerify) {
            
        }

        public String getCode() {
            return null;
        }
    }

}