**P6.1** Write a program that initializes an array with ten random integers and then prints four lines of output, containing:

* Every element at an even index.
* Every even element. 
* All elements in reverse order. 
* Only the first and last element.

**P6.2** Write array methods that carry out the following tasks for an array of integers. For each method, provide a test program. 

1. Swap the first and last elements in the array. 
2. Shift all elements by one to the right and move the last element into the first position. For example, 1 4 9 16 25 would be transformed into 25 1 4 9 16. 
3. Replace all even elements with 0. 
4. Replace each element except the first and last by the larger of its two neighbors.
5. Remove the middle element if the array length is odd, or the middle two elements if the length is even. 
6. Move all even elements to the front, otherwise preserving the order of the elements. 
7. Return the second-largest element in the array. 
8. Return true if the array is currently sorted in increasing order. 
9. Return true if the array contains two adjacent duplicate elements. 
10. Return true if the array contains duplicate elements (which need not be adjacent).


**P6.3** Write a program that takes doubles in from a user until they enter 'q' to quit. These values should be stored in a double array. Then, print all values on a new line, marking the largest and smallest values. 

**P6.4** Write a program that computes the sum of an array of values, except for the smallest one, in a single loop. In the loop, update the sum and the smallest value. After the loop, return the difference.

**P6.5** Write a program that removes the minimum value from a partially filled array without calling other methods.

**P6.6** Compute the alternating sum of all elements in an array. 
 * For example, if your program reads the input: 1 4 9 16 9 7 4 9 11
 * Then it computes: 1 – 4 + 9 – 16 + 9 – 7 + 4 – 9 + 11 = –2

**P6.7** Write a program that reverses the sequence of elements in an array.
 * For example if you input: 1 4 9 16 9 7 4 9 11 
 * Then it computes: 11 9 4 7 9 16 9 4 1

**P6.8** Write a program that splits an array of integers in half and swaps the first half to the second half and the second half to the first half
 * For example, if you input 1 4 9 16 5 7 8 11
 * Array 1 would be 1 4 9 16 and array 2 would be 5 7 8 11 then you will combine the two arrays back together with array 2 being first and array 1 being second.
 * The output would be       5 7 8 11 1 4 9 16

**P6.9** Write a program that checks whether two arrays have elements in the same order. 
 * For example, if the two input arrays are 1 2 3 4 5 6 7 8 and 1 2 3 4 5 6 7 8
 * The output would be 'The arrays are equal.'
 * If the two input arrays are 1 2 3 4 5 6 7 8 and 1 2 3 4 5 6 7 8 9
 * The output would be 'The arrays are not equal.'

**P6.10** Write a program that modifies the previous question to check whether two arrays have the same elements in some order, ignoring duplicates and ordering.
 * For example, if the two input arrays are 1 4 9 16 9 7 4 9 11 and 11 11 7 9 16 4 1
 * The output would be 'The elements of the arrays form the same set'
 * For example, if the two input arrays are 1 4 9 16 9 7 4 9 11 and 11 11 7 13 16 4 1
 * The output would be 'The elements of the arrays do not form the same set'

**P6.11** Write a program that checks whether two arrays have the same elements in some order, with the same multiplicities.
 * For example 1 4 9 16 9 7 4 9 11
 * and 11 1 4 9 16 9 7 4 9 would be considered identical 
 * but 1 4 9 16 9 7 4 9 11 
 * and 15 1 4 9 16 9 7 4  would not

**P6.12** A run is a sequence of adjacent repeated values. Write a program that generates a sequence of 20 random die tosses in an array and that prints the die values, marking the runs by including them in parentheses, like this: 1 2 (5 5) 3 1 2 4 3 (2 2 2 2) 3 6 (5 5) 6 3 1

**P6.13** Write a program that generates a sequence of 20 random die tosses in an array and that prints the die values, marking only the longest run.

**P6.14** Write a program that generates a sequence of 20 random values between 0 and 99 in an array, prints the sequence, sorts it, and prints the sorted sequence. Use the sort method from the standard Java library.

**P6.15** Write a program that produces ten random permutations of the numbers 1 to 10. To generate a random permutation, you need to fill an array with the numbers 1 to 10 so that no two entries of the array have the same contents. You could do it by brute force, by generating random values until you have a value that is not yet in the array. But that is inefficient. Instead, follow this algorithm:
 * Make a second array and fill it with the numbers 1 to 10. 
 * Repeat 10 times 
 * Pick a random element from the second array. 
 * Remove it and append it to the permutation array.

**P6.20** Write a method that computes the average of the neighbors of a two-dimensional array element in the eight directions shown in the figure below. However, if the element is located at the boundary of the array, only include the neighbors that are in the array. For example, if row and column are both 0, there are only three neighbors.
 * ![image](https://user-images.githubusercontent.com/92865953/199124117-8e00dc0e-3688-48a5-b0f2-f7328ef5d358.png)

**P6.21** Write a program that reads a sequence of input values and displays a bar chart of the values, using asterisks, like this: 
 * ![image](https://user-images.githubusercontent.com/92865953/199126381-8e396d46-b560-427c-b480-3b4e056e8c24.png)
 * You may assume that all values are positive. 

**P6.22** Referencing the previous question, improve the program to work correctly when the data set contains negative values. Also figure out the maximum value. That value’s bar should be drawn with 40 asterisks. Shorter bars should use proportionally fewer asterisks.

**P6.23** Improve the program of question 22 by adding captions for each bar. Prompt the user for the captions and data values. The output should look like this:
 * ![image](https://user-images.githubusercontent.com/92865953/199128296-3cfb9cb3-4a42-4aa5-b72c-bce584b9f91e.png)

**P6.26** Write a program that appends two array lists together.

**P6.27** Write a program that merges two array lists, alternating elements from both array lists. If one array list is shorter than the other, then alternate as long as you can and then append the remaining elements from the longer array list.
 * For example if one list is 1 4 9 16 
 * and the other is 9 7 4 9 11
 * the output would be 1 9 4 7 9 4 16 9 11

**P6.28** Write a program that merges two sorted array lists, producing a new sorted array list. Keep an index into each array list, indicating how much of it has been processed already. Each time, append the smallest unprocessed element from either array list, then advance the index.
 * For example if one list is 1 4 9 16 
 * and the other is 4 7 9 9 11
 * the output would be 1 4 4 7 9 9 9 11 16
