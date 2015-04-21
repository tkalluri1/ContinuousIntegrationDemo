/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CI;

/**
 *
 * @author user
 */
public class StringFunctions {

    String reverse(String input) {
        StringBuffer sb = new StringBuffer();
        sb.append(input);
        sb.reverse();
        return sb.toString();
    }

    String lowerCase(String input) {
        return input.toLowerCase();
    }

    String upperCase(String input) {
        return input.toUpperCase();
    }

    String concat(String input, String concatString) {
        return input.concat(concatString);
    }

    String split(String input, String splitToken) {
        String result = "";
        String[] strings = input.split(splitToken);
        for (String splitValue : strings) {
            result = result.concat(splitValue);
            result = result.concat("  ");
        }
        return result.trim();
    }

    String toggleCase(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }

}
