package org.example.a.algos.strings;

/*  String, StringBuffer and StringBuilder.
/   StringBuilder and StringBuffer are other options compared to Strings.
/   StringBuffer is synchronized: overhead.
/   StringBuilder is mutable. Sequence of chars.
/   String is immutable so every time I change the value, a new string is created.
**/

/*  String vs StringBuilder
/   length(): O(1)
/   charAt(): O(1)
/   substring(): O(1) vs O(N)
/   concat(): O(N) vs O(1)
**/

/*  Applications
/   String reversion: StringBuilder O(N). String O(N^2).
/   Suffixes: StringBuilder O(N^2). String O(N) because of substring().
/       > Suffix arrays: databases and web searches.
/   Longest common prefix
/   Longest repeated substring.
**/

public class Main {
}
