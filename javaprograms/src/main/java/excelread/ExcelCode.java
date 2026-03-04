package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {


	static FileInputStream f;
	// reads excel file
	static XSSFWorkbook w;
	// represents entire excel workbook
	static XSSFSheet sh;
	//represent one sheet inside the workbook

	public static String readStringData(int row, int col) throws IOException 
	{
		f = new FileInputStream("C:\\Users\\LENOVO\\git\\softwaretesting\\javaprograms\\src\\main\\resources\\Book1.xlsx");
		//opens the excel file from given location
		w = new XSSFWorkbook(f);
		//loads the excel file into memory using apache poi
		sh = w.getSheet("Sheet1");
		//selects sheet1 from workbook
		XSSFRow r = sh.getRow(row);
		//get the row based on the row number passed as an argument
		XSSFCell c = r.getCell(col);
		//gets the cell in that row based on the column number 
		return c.getStringCellValue();
		//returns the data in that cell as text/string

	}

	public static String readIntegerData(int row, int col) throws IOException
	{
		f = new FileInputStream("C:\\Users\\LENOVO\\git\\softwaretesting\\javaprograms\\src\\main\\resources\\Book1.xlsx");
		w = new XSSFWorkbook(f);
		sh = w.getSheet("Sheet1");
		XSSFRow r = sh.getRow(row);
		XSSFCell c = r.getCell(col);
		//gets data in double format in the above step
		int val =   (int) c.getNumericCellValue(); 
		//converts double value to int
		return String.valueOf(val);   
		//convert int to string so that the method returns as string i.e, match the return type of method
	}
}
