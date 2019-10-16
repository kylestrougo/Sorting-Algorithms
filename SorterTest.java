import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;

import java.io.PrintStream;

import org.junit.jupiter.api.Test;


class SorterTest {

	@Test
	void merge_test() {
		int arr[] = {12, 11, 13, 5, 6, 7};
		int l = 0;
		int r = arr.length-1;
		
		Sorter ob = new Sorter();
		ob.mergesort(arr, l, r);
		
		
		System.out.println("Sorted: ");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		ob.mergesort(arr, l, r);
		ob.printArray(arr);
		String expectedOutput = "5 6 7 11 12 13 \n";
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void quick_test() {
		int arr[] = {12, 11, 13, 5, 6, 7};
		int l = 0;
		int r = arr.length-1;
		
		Sorter ob = new Sorter();
		ob.mergesort(arr, l, r);
		
		
		System.out.println("Sorted: ");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		ob.quicksort(arr, l, r);
		ob.printArray(arr);
		String expectedOutput = "5 6 7 11 12 13 \n";
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void heap_test() {
		int arr[] = {12, 11, 13, 5, 6, 7};
		int l = 0;
		int r = arr.length-1;
		
		Sorter ob = new Sorter();
		ob.mergesort(arr, l, r);
		
		
		System.out.println("Sorted: ");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		ob.heapsort(arr);
		ob.printArray(arr);
		String expectedOutput = "5 6 7 11 12 13 \n";
		assertEquals(expectedOutput, outContent.toString());
	}

}


