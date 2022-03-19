package uk.axone.devintest.filehandling;

public class ExcelReaderDemo {

    public static void main(String[] args) {

        ExcelReader myReader = new ExcelReader("M1 - File Handling/Test Data.xlsx","TestData");
        //System.out.println(myReader.getCellValue(0,0));

        int cols = myReader.getColumnCount();
        int rows = myReader.getRowCount();

        for(int i=0; i < rows; i++){
            for(int j =0; j < cols; j++){
                System.out.print(myReader.getCellValue(i, j)+ "   ");
            }
            System.out.println();
        }

    }
}
