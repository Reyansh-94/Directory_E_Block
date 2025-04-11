package com.StudentRegistration;

import java.util.Optional;

public class RegistrationOptional {
//public static int naturalIncreasig(int a) {
//	if(a==1){
//		return 1;
//	}else if(a<=0) {
//		return 0;
//	}
//	return a+naturalIncreasig(a-1);
//}			
	int x=10;
	public static void main(String[] args) {
//		int a = 10;
//	System.out.println(RegistrationOptional.naturalIncreasig(a));
		RegistrationOptional val = new RegistrationOptional();
		Optional<RegistrationOptional> optionalVal = Optional.ofNullable(val);
		if(optionalVal.isPresent()) 
		{
			System.out.print(val.x);
		}else {
			System.out.print("Data is not present here...");
		}
	}
}
