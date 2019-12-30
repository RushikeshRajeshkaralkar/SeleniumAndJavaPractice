package ExcelReader;

import java.io.File;
import java.io.IOException;

import org.sqlite.SQLiteConfig.SynchronousMode;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataFromXsl {
	public static void main(String[] args) throws BiffException, IOException {
		File src = new File("C:\\Users\\Rushikesh\\Desktop\\TestCase\\DataFrom.xls");

		Workbook workbook = Workbook.getWorkbook(src);
		Sheet sheet = workbook.getSheet(0);
		int row = sheet.getRows();
		int colum=sheet.getColumns();
		for(int j=0;j<colum;j++)
		{
			for (int i = 0; i < row; i++) {
				Cell cell = sheet.getCell(j, i);
				String data = cell.getContents();
				System.out.println(data);
			}
			
		}
		

	}
	
	
	
	

}
