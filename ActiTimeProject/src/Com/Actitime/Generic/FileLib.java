package Com.Actitime.Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.util.PropertiesPropertySource;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hpsf.Property;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getproperty(String key) throws IOException {
FileInputStream fis=new FileInputStream( "./datacommandatas.property");
Properties p=new Properties();
p.load(fis);
 String data = p.getProperty(key);
 return data;
	}


	public String getExceldata(String sheetname,int row,int cell ) throws EncryptedDocumentException, IOException {
		FileInputStream fls=new FileInputStream("./data/create.xlsx");
	   Workbook wb = WorkbookFactory.create(fls);
	String data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	return data;
}
}
