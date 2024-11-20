import java.util.Scanner;

/**
 * Title: WordSubset Program
 *
 * Description: This program uses recursion to generate all possible subsets of letters from a given input string.
 * The subsets include all combinations, from the full word to the empty string.
 */
public class WordSubset {
    /**
     * This method recursively generates subsets by either including or excluding each character from the input string in the subset.
     *
     * @param current    the current subset being formed
     * @param remaining  the remaining characters to process
     */
    public static void generateSubsets(String current, String remaining) {
        if (remaining.isEmpty()) {
            System.out.println(current);
        } else {
            // Include the first character in the subset
            generateSubsets(current + remaining.charAt(0), remaining.substring(1));

            // Exclude the first character in the subset
            generateSubsets(current, remaining.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Generate all subsets
        System.out.println("Subsets of the word:");
        generateSubsets("", word);

        scanner.close();
    }
}
