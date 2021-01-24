package org.example.agnar.movie;

import java.util.List;

public class Movie {

    String rating;

    public Movie(String rating) {
        super();
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    /*Axx or By
    Where x represents any digit between 0 and 9, and y represents
    any digit between 1 and 4*/
    public boolean isValidRating() {
        if (rating == null) {
            return false;
        }

        if (isValidARating()) {
            return true;
        }

        if (isValidBRating()) {
            return true;
        }

        return false;
    }

    private boolean isValidARating() {
        String firstChar = rating.substring(0, 1);
        return (firstChar.equalsIgnoreCase("A")
            && rating.length() == 3
            && StringUtils.isNumeric(rating.substring(1, 3)));
    }

    private boolean isValidBRating() {
        return List.of("B1", "B2", "B3", "B4").contains(rating);
//        return Arrays.asList("B1", "B2", "B3", "B4").contains(rating);

//        if (rating.substring(0, 1).equalsIgnoreCase("B")
//                && rating.length() == 2) {
//            if (StringUtils.isNumeric(rating.substring(1, 2))
//                    && Integer.parseInt(rating.substring(1, 2)) > 0
//                    && Integer.parseInt(rating.substring(1, 2)) < 5) {
//                return true;
//            }
//        }
//        return false;
    }
}