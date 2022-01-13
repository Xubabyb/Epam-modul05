package by.jonline.modul05.exercise01;

/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить,
 * удалить.
 */

public class TestDriveTextFile {

	public static void main(String[] args) {

		Directory directory = new Directory("Temp");

		TextFile textFile1 = new TextFile("My JoB");

		textFile1.getText().setHeading("Daily duties");
		textFile1.addText("some text");

		textFile1.outputContent();

		TextFile textFile2 = new TextFile("Java");
		textFile2.renameFile("Java Introduction");
		textFile2.outputContent();

		directory.addFileToDirectory(textFile1);
		directory.addFileToDirectory(textFile2);

		System.out.println(directory);

		directory.deleteFile(textFile1);

		System.out.println(directory);
	}

}
