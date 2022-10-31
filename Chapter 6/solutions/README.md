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
