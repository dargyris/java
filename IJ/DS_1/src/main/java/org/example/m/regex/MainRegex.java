package org.example.m.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegex {
    public static void main(String[] args) {
        // replaceAll
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        string = "abcDeeeF12Ghhiiiijkl99z asdkjwh124hdfk¶¶¢¡";
        //matches needs ALL the characters exactly to return true
        System.out.println(string.matches("^abcDeee"));

        // "." all occurrences
        System.out.println(string.replaceAll(".", "Y"));

        // "^..." starts with ...
        System.out.println(string.replaceAll("^abcDeee", "."));
        // "[^someCh]" -> ^ means exclude
        System.out.println(string.replaceAll("[^ej]", "X"));

        // $ end
        System.out.println(string.replaceAll("99z$", "END"));

        // replace any of a e or i with X
        System.out.println(string.replaceAll("[aei]", "X"));
        System.out.println(string.replaceAll("[aei]", "I replaced a letter"));

        //Replace a or e or i when followed by F or j!
        System.out.println(string.replaceAll("[aei][Fj]", "X"));

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        System.out.println(string.replaceAll("[a-f3-8]", "X"));

        // (?i) ignore case
        System.out.println(string.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println(string.replaceAll("[0-9]", "X"));

        //Character classes: \\d \\D(non-digit) \\s \\S(non-whitespace) \\w (a-zA-Z0-9_)
        // \\b(word boundaries)
        System.out.println(string.replaceAll("\\d", "X"));
        System.out.println(string.replaceAll("\\D", " "));
        System.out.println(string.replaceAll("\\D", " ").trim());
        System.out.println(string.replaceAll("\\D", " ").trim().replaceAll("\\s", ""));
        System.out.println(string.replaceAll("\\S", ""));
        System.out.println(string.replaceAll("\\b", "X"));

        // Quantifiers e{3} 3 es in a row. + 1 or more of. *: 0 or more of
        // "^abcDe{2,5}: 2 to 5 occurrences
        System.out.println(string.replaceAll("e{3}", "X"));
        System.out.println(string.replaceAll("^abcDe+", "X"));
        System.out.println(string.replaceAll("^abcDe.+", "X"));
        System.out.println(string.replaceAll("^.+", "X"));
        System.out.println(string.replaceAll("^abcDe*", "X"));
        System.out.println(string.replaceAll("^abcDe{2,5}", "X"));

        // Mixing things up
        System.out.println(string.replaceAll("h+i*j", "X"));

        StringBuilder htmlText = new StringBuilder("<h1>MyHeading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph.</p>");
        htmlText.append("<p>This is another paragraph.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2GeneralPattern = ".*<[Hh]2>.*";
        String h2SpecificPattern = "<[Hh]2>";
        String h2GroupGreedy = "(<h2>.*</h2>)"; // Greedy quantifier
        String h2GroupLazy = "(<h2>.*?</h2>)"; // Lazy quantifier
        String h2GroupLazyTxt = "(<h2>)(.+?)(</h2>)"; // Lazy quantifier. 2nd group is only text between.

        Pattern pattern1 = Pattern.compile(h2GeneralPattern);
        Pattern pattern2 = Pattern.compile(h2SpecificPattern);
        Pattern pattern3 = Pattern.compile(h2GroupGreedy);
        Pattern pattern4 = Pattern.compile(h2GroupLazy);
        Pattern pattern5 = Pattern.compile(h2GroupLazyTxt);

        Matcher matcher1 = pattern1.matcher(htmlText);
        Matcher matcher2 = pattern2.matcher(htmlText);
        Matcher matcher3 = pattern3.matcher(htmlText);
        Matcher matcher4 = pattern4.matcher(htmlText);
        Matcher matcher5 = pattern5.matcher(htmlText);

        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
        System.out.println(matcher3.matches());
        System.out.println(matcher4.matches());
        System.out.println(matcher5.matches());

        // After using the matcher, I must reset its internal state. I can only use it once otherwise.
        matcher1.reset();
        matcher2.reset();
        matcher3.reset();
        matcher4.reset();
        matcher5.reset();

        int counter = 0;
        while (matcher1.find()) {
            System.out.println("Occurrence " + ++counter + ": " + matcher1.start() + " to " + matcher1.end());
        }
        System.out.println();

        counter = 0;
        while(matcher2.find()) {
            System.out.println("Occurrence " + ++counter + ": " + matcher2.start() + " to " + matcher2.end());
        }
        System.out.println();

        counter = 0;
        while (matcher3.find()) {
            System.out.println("Occurrence " + ++counter + ": " + matcher3.group(1));
        }
        System.out.println();

        counter = 0;
        while (matcher4.find()) {
            System.out.println("Occurrence " + ++counter + ": " + matcher4.group(1));
        }
        System.out.println();

        counter = 0;
        while (matcher5.find()) {
            System.out.println("Occurrence " + ++counter + ": " + matcher5.group(2));
        }
        System.out.println();

        // Logical Operators
        System.out.println("harry".replaceAll("[Hh]arry", "Larry"));
        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
        System.out.println("harry".replaceAll("[^B|b]arry", "Larry")); // Not

        String tvText = "tstvtkt";
        String notCarret = "t[^v]";
        String negativeOperator = "t(?!v)"; // ?! Lookahead negative operator
        String positiveLookahead = "t(?=v)"; // will not include the matching v

        Pattern notCarretPattern = Pattern.compile(notCarret);
        Pattern negativeOperatorPattern = Pattern.compile(negativeOperator);

        Matcher notCarretMatcher = notCarretPattern.matcher(tvText);
        Matcher negativeOperatorMatcher = negativeOperatorPattern.matcher(tvText);

        counter = 0;
        while (notCarretMatcher.find()) {
            System.out.println("Occurrence " + ++counter + ": " + notCarretMatcher.start() + " to " + notCarretMatcher.end());
        }
        System.out.println();

        counter = 0;
        while (negativeOperatorMatcher.find()) {
            System.out.println("Occurrence " + ++counter + ": " + negativeOperatorMatcher.start() + " to " + negativeOperatorMatcher.end());
        }
        System.out.println();

        /* Phone number validation
        /  ^( [\(]{1} [0-9]{3} [\)]{1} [ ]{1} [0-9]{3} [\-]{1} [0-9]{4} )$
        **/
        String regex = "^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$";
        String phone1 = "1234567890";
        String phone2 = "123 456-7890";
        String phone3 = "(123) 456-7890";
        System.out.println("phone1: " + phone1.matches(regex));
        System.out.println("phone2: " + phone2.matches(regex));
        System.out.println("phone3: " + phone3.matches(regex));

        /* Visa validation: Last three numbers are optional: ? group
        /  ^4 [0-9]{12} ([0-9]{3})?$
        **/

    }
}
