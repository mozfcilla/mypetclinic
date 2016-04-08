package org.springframework.samples.petclinic.model;

//This is a test package needed to verify Jacks
public class ProcessBuilderDemo {

	public ProcessBuilderDemo(String[] list){
	   // create a new list of arguments for our process
	   //String[] list = {"notepad.exe", "test.txt"};

	   // create the process builder
	   ProcessBuilder pb = new ProcessBuilder(list);

	   // set the command list
	   pb.command(list);

	   // print the new command list
	   System.out.println("" + pb.command());		
		
	}
}
