// Knime's BufferedDataTable to Convert primitive 2d int array (int[][])...

import org.knime.core.data.DataRow;
import org.knime.core.data.container.CloseableRowIterator;
import org.knime.core.node.BufferedDataTable;

public class ArrayFromTable {
	
	private int[][] array;
	
	public ArrayFromTable(BufferedDataTable table) {
		int rowCount = (int) table.size();
		int colCount = table.getSpec().getNumColumns();
		
		int[][] array = new int[rowCount][colCount];
		
		CloseableRowIterator it = table.iterator();
		
		for (int i=0; i<rowCount; i++) {
			DataRow dataRow = it.next();
			for (int j=0; j<colCount; j++) {
				int dataCell = Integer.parseInt(dataRow.getCell(j).toString());
				array[i][j] = dataCell;
			}
		}
		
		this.array = array;
	}
	
	public int[][] getArray() {
		return array;
	}
}
