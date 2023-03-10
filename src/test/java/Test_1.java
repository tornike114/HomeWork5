import com.codeborne.selenide.Condition;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Test_1 {
    @Test
    public void excel() throws IOException, BiffException {
        String filePath = "files\\Test.xls";
        FileInputStream fs = new FileInputStream(filePath);
        Workbook wb = Workbook.getWorkbook(fs);
        Sheet sheet = wb.getSheet("Sheet1");
        int totalNoOfRows = sheet.getRows();//4
        for (int row = 1; row < totalNoOfRows; row++){
            System.out.println(sheet.getCell(0,row).getContents());
            $("#elllogin").setValue(sheet.getCell(0,row).getContents());
            Assert.assertFalse($(byText("email is not valid")).is(Condition.visible),"email check");
        }
    }
}
