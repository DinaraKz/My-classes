package com.syntax.class08;

public class SwitchStatement {
	public static void main(String[] args) {
	//switch statement in java it allows us to choose among multiple
	// or several alternative/option
		
		String browser="youtube";
	switch(browser.toLowerCase()) {
	case "chrome":
	System.out.println("Lunching chrome browser");
	break;
	case "firefox":
	System.out.println("Lunching firefox browser");
	break;
	case "ie":
	System.out.println("Lunching ie browser");
	break;
	
	default:
		System.err.println("Unsupported browser");
	}
	}

}
