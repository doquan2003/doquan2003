package FB;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author doquan
 */
public class Constants {

    public static String FACEBOOK_APP_ID = System.getenv("FACEBOOK_APP_ID");
    public static String FACEBOOK_APP_SECRET = System.getenv("FACEBOOK_APP_SECRET");
    public static String FACEBOOK_REDIRECT_URL = "http://localhost:9999/project/login-facebook";
    public static String FACEBOOK_LINK_GET_TOKEN = "https://graph.facebook.com/oauth/access_token?client_id=%s&client_secret=%s&redirect_uri=%s&code=%s";

    public static String GOOGLE_CLIENT_ID = System.getenv("GOOGLE_CLIENT_ID");
    public static String GOOGLE_CLIENT_SECRET = System.getenv("GOOGLE_CLIENT_SECRET");
    public static String GOOGLE_REDIRECT_URI = "http://localhost:9999/project/login-google";
    public static String GOOGLE_LINK_GET_TOKEN = "https://accounts.google.com/o/oauth2/token";
    public static String GOOGLE_LINK_GET_USER_INFO = "https://www.googleapis.com/oauth2/v1/userinfo?access_token=";
    public static String GOOGLE_GRANT_TYPE = "authorization_code";

}