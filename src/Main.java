public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."
            + "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";

    public static void main(String[] args) {
        WordChecker a = new WordChecker(text);
        System.out.println(a.hasWord("lama")); //нет слова
        System.out.println(a.hasWord("proident"));//есть слово

        boolean exists = text.contains("proident");
        System.out.println(exists);
        System.out.println(text.contains("sunt"));
    }
}