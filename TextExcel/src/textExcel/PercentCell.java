package textExcel;

public class PercentCell extends RealCell {
	
	private String answer;
	public String abbreviatedCellText() {
		String output;
		if(answer.indexOf(".") < 0){	
			output = answer; 
		} else 
			output = answer.substring(0,answer.indexOf("."))+ "%";
		return (answer + "          ").substring(0, 10);
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
