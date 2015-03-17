package by.epam.execution;


public class Execution {
	
	public Execution () {
		
	}
	
public String oprExecution (int arg1, int opr, int arg2) {
	String result = "null";
	int res = 0;
	switch (opr) {
		case 1: {
			res = arg1 + arg2;
			result = Integer.toString(res);
			break;
		}
		case 2: {
			res = (arg1 - arg2);
			result = Integer.toString(res);
			break;
		}
		case 3:{
			res = (arg1 * arg2);
			result = Integer.toString(res);
			break;
		}
		case 4: {
			if (arg2 != 0) {
				res = (Integer) (arg1/arg2);
				result = Integer.toString(res);
			}
			else {
				System.out.println ("The Operation is prohibited");
				result = "Error";
			}
			break;
		}
		default: {
			opr = 0;
		}
	}
	return result;
}


}
