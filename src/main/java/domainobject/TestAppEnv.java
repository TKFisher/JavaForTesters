package domainobject;


public class TestAppEnv {

    public static final String DOMAIN = "192.123.0.3";
    public static final String PORT = "67";

    public static String getURL() {
        //my way:
        //return DOMAIN + PORT;
        //OR:
        return "http://" + DOMAIN + ":" + PORT;
    }


}
