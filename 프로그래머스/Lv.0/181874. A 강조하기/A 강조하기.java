class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            char currentChar = myString.charAt(i);

            if (currentChar == 'a') {
                sb.append('A');
            } else if ((currentChar != 'A') && (Character.isUpperCase(currentChar))) {
                sb.append(Character.toLowerCase(currentChar));
            } else {
                sb.append(currentChar);
            }
        }

        return sb.toString();
    }
}