// Convert primitive 2d int array (int[][]) to Knime's BufferedDataTable...

import org.knime.core.data.DataCell;
import org.knime.core.data.DataColumnSpec;
import org.knime.core.data.DataColumnSpecCreator;
import org.knime.core.data.DataTableSpec;
import org.knime.core.data.DataTableSpecCreator;
import org.knime.core.data.RowKey;
import org.knime.core.data.def.DefaultRow;
import org.knime.core.data.def.IntCell.IntCellFactory;
import org.knime.core.node.BufferedDataContainer;
import org.knime.core.node.BufferedDataTable;
import org.knime.core.node.ExecutionContext;

public class TableFromArray {
	
	private BufferedDataTable[] outputTable;
	
	public TableFromArray(int[][] array, ExecutionContext exec) {
		int rowCount = array.length;
		int colCount = array[0].length;

		DataTableSpecCreator creator = new DataTableSpecCreator();

		for (int i=0; i<colCount; i++) {
			String colName = "column_" + i;
			DataColumnSpecCreator dataColumnSpecCreator = new DataColumnSpecCreator(colName, IntCellFactory.TYPE);
			DataColumnSpec dataColumnSpec = dataColumnSpecCreator.createSpec();
			creator.addColumns(dataColumnSpec);
		}

		DataTableSpec spec = creator.createSpec();

		BufferedDataContainer container = exec.createDataContainer(spec);

		for (int i=0; i<rowCount; i++) {
			String key = "row_" + i;
			RowKey rowKey = new RowKey(key);
			DataCell[] dataCellArray = new DataCell[rowCount];
			for (int j=0; j<colCount; j++) {
				dataCellArray[j] = IntCellFactory.create(array[i][j]);
			}
			DefaultRow row = new DefaultRow(rowKey, dataCellArray);
			container.addRowToTable(row);
		}

		container.close();

		this.outputTable = new BufferedDataTable[] {container.getTable()};
		
	}
	
	public BufferedDataTable[] getTable() {
		return outputTable;
	}

}
