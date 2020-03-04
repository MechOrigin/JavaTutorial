package Proper;

public class ModuleX2 {
	
	/*
	 * Moved all vars and enums to ModuleXEnums & ModuleXVars
	 */
	
  public static void main(String[] args) {
    System.out.println(Util.ModuleXVars.variableInt);
    System.out.println(Util.ModuleXVars.variableInt + Util.ModuleXVars.variableInt);
    System.out.println(Util.ModuleXEnums.Color.BLUE);
    System.out.println(Util.ModuleXEnums.Color.ORANGE);
    System.out.println(Util.ModuleXEnums.Color.BLUE);
  }
}
