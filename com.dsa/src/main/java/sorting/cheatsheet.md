#Bubble sort
**compare adjacent elements in each iteration bubbling the largest element toward right, reduce search space by one since largest elemt is already in its place**

- [worst case] - O(n^2) -- search and swaps for all elements in the array.
- [Best Case] - O(n) -- no swaps, just iterate since array is already sorted 
- [Avg case] - O(n^2)
- [In place] - yes -- no extra space is needed
- [online] - No -- new elements if added on runtime will mess up the algo.
- [stable] -- yes
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
#Selection Sort
**Declare a minimum value and iterate over the array to fill in the minimum value toward left, select minimum value with every iteration.**
worst case - O(n^2) -- search and swaps for all elements in the array.
Best Case - O(n^2) -- search and swaps for all elements in the array.
Avg case - O(n^2)
In place - yes -- no extra space is needed
online - No -- new elements if added on runtime will mess up the algo.
stable -- no since swaps is not confined to adjecent element but any element that is small
#Insertion Sort
**Insert elements to sorted section, so INSERT element to the sorted left if smaller else ignore and move, increase the sorted section by insertion**
