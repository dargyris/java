package org.example.m.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Reg Exp Exercises
/  No compile:
/  someString.matches(regExp);
/
/  With somePattern.compile:
/  someMatcher.matches();
/  someMatcher.find(); someMatcher.group(1);
**/

public class Challenges {
    public static void main(String[] args) {
//        challengeOne();
//        challengeTwo();
//        challengeThree();
//        challengeFour();
//        challengeFive();
//        challengeSix();
//        challengeSeven();
//        challengeEight();
//        challengeNine();
//        challengeTen();
//        challengeEleven();
//        challengeTwelve();
//        challengeThirteen();
//        challengeFourteen();
//        challengeFifteen();
//        challengeSixteen();
//        challengeSeventeen();
//        challengeEighteen();
//        challengeNineteen();
        challengeTwenty();
    }

    public static void challengeTwenty() {
        // Using groups: the group ? can be 0 or 1 occurrences. * could work. + is wrong.
        System.out.println("11111".matches("^\\d{5}(-\\d{4})?$"));
        System.out.println("11111-1111".matches("^\\d{5}(-\\d{4})?$"));
        System.out.println();

        System.out.println("11111".matches("^\\d{5}(-\\d{4})+$"));
        System.out.println("11111-1111".matches("^\\d{5}(-\\d{4})+$"));
        System.out.println();

        System.out.println("11111".matches("^\\d{5}(-\\d{4})*$"));
        System.out.println("11111-1111".matches("^\\d{5}(-\\d{4})*$"));
        System.out.println();
    }

    public static void challengeNineteen() {
        String string1 = "11111";
        String string2 = "11111-1111";
        String string3 = "11111-111"; // Should fail
        String string4 = "1111-1111"; // Should fail
        String regExp = "^\\d{5}$|^\\d{5}-\\d{4}$";

        Pattern pattern = Pattern.compile(regExp);

        Matcher matcher1 = pattern.matcher(string1);
        Matcher matcher2 = pattern.matcher(string2);
        Matcher matcher3 = pattern.matcher(string3);
        Matcher matcher4 = pattern.matcher(string4);

        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
        System.out.println(matcher3.matches());
        System.out.println(matcher4.matches());
    }

    public static void challengeEighteen() {
        System.out.println("11111-1111".matches("^\\d{5}-\\d{4}$"));
    }

    public static void challengeSeventeen() {
        System.out.println("11111".matches("^\\d{5}$"));
    }

    public static void challengeSixteen() {
        String string = "{0, 2}, {0, 5}, {1, 3}, {2, 4}, {x, y}, {428, 579}, {11, 12}";
        Pattern pattern = Pattern.compile("\\{(\\d+, \\d+)\\}");
        Matcher matcher = pattern.matcher(string);

        StringBuilder s = new StringBuilder();
        int counter = 0;
        while (matcher.find()) {
            s.append("Occurrence " + ++counter + ": " + matcher.group(1) + '\n');
        }
        System.out.println(s.toString());
    }

    public static void challengeFifteen() {
        String string = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        // Without the lazy ?, the + would swallow everything between the first { and last }
        Pattern pattern = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher = pattern.matcher(string);

        int counter = 0;
        while (matcher.find()) {
            System.out.println("Occurrence " + ++counter + ": " + matcher.group(1) +
                    "\tStarts at: " + matcher.start(1) +
                    "\tends at: " + (matcher.end(1) - 1));
        }
    }

        public static void challengeFourteen() {
        String string = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";

        System.out.println(string
                .replaceAll("\\{", "")
                .replaceAll("\\}, ", "\n")
                .replaceAll("\\}", ""));
        System.out.println();

        System.out.println(string.replaceAll("[\\{]|[\\}]|[,]",""));
        System.out.println(string.replaceAll("[\\{\\},]",""));
        System.out.println();
    }

    public static void challengeThirteen() {
        String string = "abcd.135\tuvqz.7\ttzik.999\n";

        String regExpRecurring = "\\w+\\.(\\d+)\\s";
        Pattern pattern = Pattern.compile(regExpRecurring);
        Matcher matcher = pattern.matcher(string);

        int counter = 0;
        while (matcher.find()) {
            System.out.println("Occurrence " + ++counter +
                    ", starts at: " + matcher.start() +
                    ", ends at: " + matcher.end());
            System.out.println("Occurrence " + ++counter +
                    ", starts at: " + matcher.start(1) +
                    ", ends at: " + (matcher.end(1) - 1));
        }
        System.out.println();
    }

    public static void challengeTwelve() {
        String string = "abcd.135\tuvqz.7\ttzik.999\n";

        String regExpRecurring = "\\w+\\.(\\d+)\\s";
        Pattern pattern = Pattern.compile(regExpRecurring);
        Matcher matcher = pattern.matcher(string);

        int counter = 0;
        while (matcher.find()) {
            System.out.println("Occurrence " + ++counter + ": " + matcher.group(1));
        }
        System.out.println();
    }

    public static void challengeEleven() {
        String string = "abcd.135uvqz.7tzik.999";
        String regExp1 = "^(\\w+\\.)(\\d+)(\\w+\\.)(\\d+)(\\w+\\.)(\\d+)$";
        String regExp2 = "^(.*\\.)(\\d+)(.*\\.)(\\d+)(.*\\.)(\\d+)$";
        String regExp3 = "^(\\S+\\.)(\\d+)(\\S+\\.)(\\d+)(\\S+\\.)(\\d+)$";

        String regExpRecurring = "\\w+\\.(\\d+)";

        Pattern pattern1 = Pattern.compile(regExp1);
        Pattern pattern2 = Pattern.compile(regExp2);
        Pattern pattern3 = Pattern.compile(regExp3);
        Pattern pattern4 = Pattern.compile(regExpRecurring);

        Matcher matcher1 = pattern1.matcher(string);
        Matcher matcher2 = pattern2.matcher(string);
        Matcher matcher3 = pattern3.matcher(string);
        Matcher matcher4 = pattern4.matcher(string);

        matcher1.find();
        System.out.println(matcher1.group(2) + " " + matcher1.group(4) + " " + matcher1.group(6));
        System.out.println();

        matcher2.find();
        System.out.println(matcher2.group(2) + " " + matcher2.group(4) + " " + matcher2.group(6));
        System.out.println();

        matcher3.find();
        System.out.println(matcher3.group(2) + " " + matcher3.group(4) + " " + matcher3.group(6));
        System.out.println();

        int counter = 0;
        while (matcher4.find()) {
            System.out.println("Occurrence " + ++counter + ": " + matcher4.group(1));
        }
    }

    public static void challengeTen() {
        System.out.println("aBcd.125".matches("^\\w+\\.\\d+$"));
        System.out.println("kjISl.22".matches("^[a-zA-Z]+\\.[0-9]+$"));
        System.out.println("kjISl.22".matches("^(?i)[a-z]+\\.[0-9]+$"));
    }

    public static void challengeNine() {
        String string = "aaabccccccccdddefffg";

        System.out.println(string.matches("^a.*g$"));
        System.out.println(string.matches("^a{3}bc{8}d{3}ef{3}g$"));
    }

    public static void challengeEight() {
        String string = "aaabccccccccdddefffg";
        String regExp = "(\\S+)";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(string);

        System.out.println(matcher.matches());
        matcher.reset();
        matcher.find();
        System.out.println(matcher.group(1));
    }

    public static void challengeSeven() {
        String string = "aaabccccccccdddefffg";
        System.out.println(string.matches("\\S+"));
        System.out.println(string.matches("\\w+"));
        System.out.println(string.matches(".*+"));
        System.out.println(string.matches("[abcdefg]+"));
        System.out.println(string.matches("[a-g]+"));
    }

    public static void challengeSix() {
        String string = "Replace all blanks with underscores.";
        System.out.println(string.replaceAll(" ", "_"));
        System.out.println(string.replaceAll("\\s", "_"));
    }

    public static void challengeFive() {
        String string = "I want a bike.";
        String regExp = "\\w\\W\\w+\\W\\w\\W\\w+.";

        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(string);

        System.out.println(matcher.matches());
    }

    public static void challengeFour() {
        String string1 = "I want a bike.";
        String string2 = "I want a ball.";

        String regExp = "I want a (bike|ball).";

        System.out.println(string1.matches(regExp));
        System.out.println(string2.matches(regExp));
    }

    public static void challengeThree() {
        String text1 = "I want a bike.";
        String text2 = "I want a ball.";

        String regexGroup = "I want a (bike|ball).";

        System.out.println(text1.matches(regexGroup));
        System.out.println(text2.matches(regexGroup));
        System.out.println();

        Pattern pattern = Pattern.compile(regexGroup);
        Matcher matcher1 = pattern.matcher(text1);
        Matcher matcher2 = pattern.matcher(text2);

        matcher1.find();
        System.out.println(matcher1.group(1));
        matcher2.find();
        System.out.println(matcher2.group(1));
        System.out.println();
    }

    public static void challengeTwo() {
        System.out.println("I want a bike.".matches("^I.+b.+\\.$"));
        System.out.println("I want a ball.".matches("^I.+b.+\\.$"));
        System.out.println();
        System.out.println("I want a bike.".matches("I want a \\w+."));
        System.out.println("I want a ball.".matches("\\w\\s\\w+\\s\\w\\s\\w+."));
        System.out.println("I want a ball.".matches("\\w\\W\\w+\\W\\w\\W\\w+."));
        System.out.println("I want a ball.".matches("\\S\\s\\S+\\s\\S\\s\\S+."));
    }

    public static void challengeOne() {
        String challenge1 = "I want a bike.";
        String challenge1Reg1 = ".*";
        String challenge1Reg2 = ".+";
        String challenge1Reg3 = "(.+)";

        Pattern challenge1Pattern1 = Pattern.compile(challenge1Reg1);
        Pattern challenge1Pattern2 = Pattern.compile(challenge1Reg2);
        Pattern challenge1Pattern3 = Pattern.compile(challenge1Reg3);

        Matcher challenge1Matcher1 = challenge1Pattern1.matcher(challenge1);
        Matcher challenge1Matcher2 = challenge1Pattern2.matcher(challenge1);
        Matcher challenge1Matcher3 = challenge1Pattern3.matcher(challenge1);

        System.out.println(challenge1Matcher1.matches());
        System.out.println(challenge1Matcher2.matches());

        challenge1Matcher3.find();
        System.out.println(challenge1Matcher3.group(1));
    }

}
