package com.tdd;

public class RemoveCharacterA {
	public String remove(String s) {
		String res = s;
		int stringLength = s.length();
		
		if(s.charAt(0)!= 'A'  && s.charAt(1)!= 'A') {
			res=s;
		}
		else if(s.charAt(0) == 'A' && s.charAt(1)!= 'A') {
			res = s.substring(1,stringLength);
		}
		else if(s.charAt(1)== 'A' && s.charAt(0)!= 'A') {
			res = s.charAt(0) + s.substring(2,stringLength);
		}
		else if(s.charAt(0)== 'A'  && s.charAt(1)== 'A') {
			res=s.substring(2,stringLength);
		}
	
		return res;
	}

}



