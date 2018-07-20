/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortevents;

/**
 *
 * @author pratikkarki
 */
import java.util.*;

public class CopyEvent<T> implements SortEvent<T> {

	/* i is the index; copy is the element being stored in that index */
	public int i;
	public T copy;
	
	/* Constructor */
	public CopyEvent(int index, T val) {
		this.i = index;
		this.copy = val;
	}
	
	public void apply(T[] arr) {
		arr[i] = this.copy;
	}

	public List<Integer> getAffectedIndices() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(this.i);
		return list;
	}

	public boolean isEmphasized() {
		return true;
	}
	
}
