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
import java.util.List;

public interface SortEvent<T> {
	void apply(T[] arr);
	List<Integer> getAffectedIndices();
	boolean isEmphasized();
}
