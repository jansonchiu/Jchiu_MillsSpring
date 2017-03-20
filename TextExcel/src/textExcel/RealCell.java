package textExcel;

public class RealCell implements Cell {
	private String answer;
	
	public RealCell(String enteredValue) {
		answer = enteredValue;
	}
	@Override
	public String abbreviatedCellText() {
		String stuff =answer+"                    ";
		return stuff.substring(0,10);
	}
	@Override
	public String fullCellText() {	
		return answer;
	}
	public double getDoubleValue(){
		return Double.parseDouble(answer);
	}
	public void setCellContents(String content) {
		answer = content;
	}
	public String getCellContents(){
		return answer;
	}
}
