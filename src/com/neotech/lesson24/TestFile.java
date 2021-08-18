package com.neotech.lesson24;

public class TestFile {

	public static void main(String[] args) {


	//	File fl = new File(); cannot INSTANTIATE because File is an abstract class
		
		File javaFile = new JavaFile();
		
//		javaFile.close();
//		javaFile.open();
//		javaFile.edit();
		
		File pdfFile = new PdfFile();
		
//		pdfFile.close();
//		pdfFile.open();
//		pdfFile.edit();
		
		File wordFile = new WordFile();
//		wordFile.close();
//		wordFile.edit();
//		wordFile.open();
		
		File[] files = { new JavaFile(), new WordFile(), new PdfFile() };  // objects are automatically upcasted
		
		
		
		
		for ( File f : files)
		{
			f.open();
			System.out.println("==================================");
//			f.edit();
//			f.close();
		}
		
		
		File jFile = new JavaFile();
		File wFile = new WordFile();
		File pFile = new PdfFile();
		
		File[] files2 = { jFile, wFile, pFile};  //2nd way of creating array of objects.
		
		
		
	}

}
