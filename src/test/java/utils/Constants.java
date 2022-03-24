package utils;

public class Constants {

    public static final String EMAIL = "hipis@ymail.com";
    public static final String PASSWORD = "Testowe123";
    public static final String PROFILE_NAME = "Kuba Jakub";
    public static final int TIMEOUT = 10;
    public static final String HOME_PAGE_URL = "http://automationpractice.com/index.php";
    public static final String PART_OF_LOGIN_URL = "?controller=authentication&back=my-account";
    public static final String PART_OF_MY_ACCOUNT_URL = "?controller=my-account";
    public static final String PART_OF_AUTHENTICATION_URL = "?controller=authentication";

    public static String getLoginUrl() {
        return HOME_PAGE_URL + PART_OF_LOGIN_URL;
    }

    public static String getMyAccountUrl() {
        return HOME_PAGE_URL + PART_OF_MY_ACCOUNT_URL;
    }

    public static String getAuthenticationUrl() {
        return HOME_PAGE_URL + PART_OF_AUTHENTICATION_URL;
    }
}
