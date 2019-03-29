# Sounds-of-Sorting

The main goal when building this program was to show both a **audibilizer** and **visualizer** for six sorting algorithms. This is achieved by playing MIDI notes for an unsorted scale and then visually showing their sorting according to the respective algorithm used. 

## Sorting Algorithms

The sorting algorithms that I chose to use are as follows:

- Selection Sort
- Insertion Sort
- Bubble Sort
- Merge Sort
- Quick Sort
- Shell Sort (more information at [references](https://github.com/karkipra/Sounds-of-Sorting#references))

## Features

This program illustrates a visceral method of showing the workings behind these common sorting algorithms. Furthermore, these algorithms are implemented on two types of scales: **chromatic** and **pentatonic**. As any music lover should know, a chromatic scale encompasses all standard 12 notes per octave, while a pentatonic scale operates only on 5 notes per octave.

## Presentation

Here is a demo of the program after successful deployment:
<br />

###### Demo with all sorting algorithms

<img src="/demo/Sortings.gif?raw=true"  width="600" height="600">
<!-- ![](demo/Sortings.gif) -->

## Code Style & Example

The project followed [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html).
<br />
I've included a coding sample, which is an implementation of Shell Sort:

```
public static <T extends Comparable<T>> List<SortEvent<T>> shellSort(T[] arr) {
    List<SortEvent<T>> events = new ArrayList<SortEvent<T>>();
    for (int gap = arr.length / 2; gap > 0; gap /= 2) {
        // insertion sort here
        for (int i = gap; i < arr.length; i++) {
            T val = arr[i];
            int j;            
	        for (j = i; j >= gap && arr[j - gap].compareTo(val) > 0; j -= gap) {
	        	events.add(new CompareEvent<T>(j - gap, i));
	        	events.add(new CopyEvent<T>(j, arr[j - gap]));            	
	            arr[j] = arr[j - gap];
	        }    
	        events.add(new CopyEvent<T>(j, val));
	        arr[j] = val;
	    }
    }
    return events;
}
```

<!-- ## Tests -->

## References 

- Sorting algorithms based on this [Wikipedia article](https://en.wikipedia.org/wiki/Sorting_algorithm).
- Shell sort algorithm was based on this tutorial and explanation by [GeeksForGeeks](https://www.geeksforgeeks.org/shellsort/).











