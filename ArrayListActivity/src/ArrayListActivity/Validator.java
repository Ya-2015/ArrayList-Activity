package ArrayListActivity;

public class Validator {
	public boolean checkRange(int val, int min, int max){
		if (val < min || val > max){
			return false;
		}else{
			return true;
		}
	}
	
	public boolean checkRange(double val, double min, double max){
		if (val < min || val > max){
			return false;
		}else{
			return true;
		}
	}
}
