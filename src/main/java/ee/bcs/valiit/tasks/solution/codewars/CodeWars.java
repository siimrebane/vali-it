package ee.bcs.valiit.tasks.solution.codewars;

// https://www.codewars.com/kata/517abf86da9663f1d2000003
public class CodeWars {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior")); // returns "theStealthWarrior"
        System.out.println(toCamelCase("The_Stealth_Warrior")); // returns "TheStealthWarrior"
        System.out.println(toCamelCase("")); // returns "TheStealthWarrior"
    }

    private static String toCamelCase(String input) {
        String[] words = input.replace("_", "-").split("-");
        StringBuilder sb = new StringBuilder();
        String result = "";
        sb.append(words[0]);
        for (int i = 1; i < words.length; i++) {
            sb.append(upperCase(words[i]));
            result += upperCase(words[i]);
        }
        return sb.toString();
    }

    private static String upperCase(String word) {
        String firstLetter = word.substring(0, 1);
        return firstLetter.toUpperCase() + word.substring(1);
    }
}
