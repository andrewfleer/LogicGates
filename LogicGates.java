public class LogicGates {

	public static void main(String[] args) {
		System.out.println("--------- AND GATE ---------");
		System.out.println("true AND true = " + logicGate(Logic.AND, true, true));
		System.out.println("false AND true = " + logicGate(Logic.AND, false, true));
		System.out.println("true AND false = " + logicGate(Logic.AND, true, false));
		System.out.println("false AND false = " + logicGate(Logic.AND, false, false));
		System.out.println("\n");
		System.out.println("--------- OR GATE ---------");
		System.out.println("true OR true = " + logicGate(Logic.OR, true, true));
		System.out.println("false OR true = " + logicGate(Logic.OR, false, true));
		System.out.println("true OR false = " + logicGate(Logic.OR, true, false));
		System.out.println("false OR false = " + logicGate(Logic.OR, false, false));
		System.out.println("\n");
		System.out.println("--------- NOT GATE ---------");
		System.out.println("NOT true = " + logicGate(Logic.NOT, true, null));
		System.out.println("NOT false = " + logicGate(Logic.NOT, false, null));
		System.out.println("\n");
		System.out.println("--------- NAND GATE ---------");
		System.out.println("true NAND true = " + logicGate(Logic.NAND, true, true));
		System.out.println("false NAND true = " + logicGate(Logic.NAND, false, true));
		System.out.println("true NAND false = " + logicGate(Logic.NAND, true, false));
		System.out.println("false NAND false = " + logicGate(Logic.NAND, false, false));
		System.out.println("\n");
		System.out.println("--------- NOR GATE ---------");
		System.out.println("true NOR true = " + logicGate(Logic.NOR, true, true));
		System.out.println("false NOR true = " + logicGate(Logic.NOR, false, true));
		System.out.println("true NOR false = " + logicGate(Logic.NOR, true, false));
		System.out.println("false NOR false = " + logicGate(Logic.NOR, false, false));
		System.out.println("\n");
		System.out.println("--------- XOR GATE ---------");
		System.out.println("true XOR true = " + logicGate(Logic.XOR, true, true));
		System.out.println("false XOR true = " + logicGate(Logic.XOR, false, true));
		System.out.println("true XOR false = " + logicGate(Logic.XOR, true, false));
		System.out.println("false XOR false = " + logicGate(Logic.XOR, false, false));
		System.out.println("\n");
		System.out.println("--------- XNOR GATE ---------");
		System.out.println("true XNOR true = " + logicGate(Logic.XNOR, true, true));
		System.out.println("false XNOR true = " + logicGate(Logic.XNOR, false, true));
		System.out.println("true XNOR false = " + logicGate(Logic.XNOR, true, false));
		System.out.println("false XNOR false = " + logicGate(Logic.XNOR, false, false));
		
	}
	
	public static boolean logicGate(Logic logic, Boolean firstVal, Boolean secondVal) {
		switch(logic) {
			case AND :
				return firstVal && secondVal;
			case OR :
				return firstVal || secondVal;
			case NOT :
				return !firstVal;
			case NAND :
				return !(firstVal && secondVal);
			case NOR :
				return !(firstVal || secondVal);
			case XOR :
				if (firstVal && secondVal)
					return false;
				return firstVal || secondVal;
			case XNOR:
				if (firstVal == secondVal)
					return true;
				return false;
			default :
				throw new RuntimeException("Unsupported logic. What are you doing?");
		}
	}

}
