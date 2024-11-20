# WordSubset Program

## Description
This program was a school assignment for my Java course. The task was to write a Java program that prompts the user to enter a string, and then generates all possible subsets of letters from that string using recursion.

The subsets generated are not substrings, meaning the letters in the subsets do not need to be in their original order. Additionally, the program ensures that all subsets are included, even the null string.

For example, if the input string is "cat", the following subsets are generated:
- "cat"
- "ca"
- "ct"
- "c"
- "at"
- "a"
- "t"
- ""

## What I Learned
In this week's lesson, I discovered that recursive problems can have multiple base cases, which was new and helpful to learn about. I didn't realize that different conditions might require distinct stopping points in recursive methods. Another key takeaway was the importance of ensuring a recursive function always reaches a base case. Apparently, it's common for beginners to write recursive methods that sometimes loop endlessly because they lack a clear base. To avoid this, I learned to focus on defining my base cases first before moving on to the recursive logic. Overall, understanding how to set multiple base cases and identifying the base case first was helpful.