package textExcel;

public class PercentCell extends RealCell {
	@Override
	public String abbreviatedCellText() {
		String answer = getCellContents();
		if (answer.indexOf(".") != -1){
			answer = answer.substring(0, answer.indexOf(".")) + "%                    ";
		}
		return answer.substring(0,10);
	}

	@Override
	public String fullCellText() {
		
		return super.fullCellText();
	}
	
	public PercentCell(String originalValue){
		super(originalValue);
	}
	
	public double getDoubleValue(){
		return Double.parseDouble(fullCellText().substring(0, fullCellText().length()-1));
	}

}
