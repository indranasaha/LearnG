package com.learn.selenium;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

public class Runbatfile {
	
	@Test
	public void runBat() throws IOException {
	ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "run.bat");
	File dir = new File("C:/Users/Rana/Desktop/Workspace/com.learn.selenium");
	pb.directory(dir);
	Process p = pb.start();
	}


}
