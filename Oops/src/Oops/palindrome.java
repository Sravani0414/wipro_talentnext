package Oops;

public class palindrome {
    private String original;

    // Constructor
    public palindrome(String original) {
        this.original = original;
    }

    public boolean isPalindrome() {
        String cleaned = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

   
    public String getOriginal() {
        return original;
    }

   
    public static void main(String[] args) {
        palindrome checker1 = new palindrome("Madam");
        palindrome checker2 = new palindrome("Hello");

        System.out.println("\"" + checker1.getOriginal() + "\" is palindrome? " + checker1.isPalindrome());
        System.out.println("\"" + checker2.getOriginal() + "\" is palindrome? " + checker2.isPalindrome());
    }
}
