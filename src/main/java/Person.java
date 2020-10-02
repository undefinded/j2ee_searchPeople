import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
@Data
public class Person {
    @ExcelProperty(index = 0)
    public String ID;

    @ExcelProperty(index = 1)
    public String name;

    @ExcelProperty(index = 2)
    public String telephone;

    @ExcelProperty(index = 3)
    public String QQ;

    @ExcelProperty(index = 4)
    public String email;

}
