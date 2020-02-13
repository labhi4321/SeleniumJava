import java.io.IOException;

public class UsedClass extends XLUtils {

	public static void main(String[] args) throws IOException {
		
		String xlfile="C://Users//Dey_a//Desktop//Excel/Test.xlsx";
		String xlsheet="Sheet1";
		int rownum=1;
		int colnum=1;
		XLUtils obj=new XLUtils();
		System.out.println(obj.getRowCount(xlfile, xlsheet));
		System.out.println(obj.getCellData(xlfile, xlsheet, rownum, colnum));
		
		

	}

}
