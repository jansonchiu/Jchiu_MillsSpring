package textExcel;

public class FormulaCell extends RealCell{
	Spreadsheet original;
	
	public FormulaCell(String value, Spreadsheet sheet){
		super(value);
		//original = sheet;
		
		String cellEnter = value.substring(0, 3);
		if(cellEnter.endsWith(" ")) {
			cellEnter = cellEnter.substring(0, 2);
		}
		//sheet = // idk 
		String formula = value.substring(value.indexOf("(") +1, value.indexOf(")"));
		if ( formula.contains("*")){
			formula.split("*");	
		}
		else if ( formula.contains( "/")){
			formula.split("/");
		}
		else if ( formula.contains("avg")){		
		}
		else if( formula.contains("+")){
			
		}
		else if(formula.contains("-")){
			
		}else{ 
			
		}
		//if (formula.equals(arg0)) {
			
		//}
		// need to be edited  
	// cellEnter 
		
	}
	
	
	public String cellContents(){
		return "FormulaCell";
	}
}

