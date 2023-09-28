public class Browser {

    public static String switchCase(String browser) {

        switch(browser.toLowerCase()) {
            case "firefox", "opera", "safari":
                return "Je gebruikt een moderne browser";
            case "edge":
                return "Je gebruikt Edge";
            case "ie":
                return "Waarom gebruik je Internet Explorer?";
            default:
                return "Je gebruikt een niet-ondersteunde browser";
        }
    }

    public static void main(String[] args) {
        System.out.println(switchCase("Firefox"));
        System.out.println(switchCase("Edge"));
        System.out.println(switchCase("IE"));
        System.out.println(switchCase("OPERA"));
        System.out.println(switchCase("safarI"));
        System.out.println(switchCase("Brave"));

    }
    
}
