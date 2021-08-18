package com.neotech.lesson24;

public abstract class File {

	public abstract void open();

	public void edit() {
		System.out.println("File be edited!!!");
	}

	public void close() {
		System.out.println("File can be closed!");
	}

}

class JavaFile extends File {
	@Override
	public void open() {
		System.out.println("Java files can be opened using Notepad++");
	}

}

class WordFile extends File {

	@Override
	public void open() {

		System.out.println("Word files are opened using MS Word");

	}

}

class PdfFile extends File
{

	@Override
	public void open() {

System.out.println("PDF files can be opened using Adobe Acrobat");
		
	}
	
}