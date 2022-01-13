package by.jonline.modul05.exercise01;

import java.util.Arrays;
import java.util.HashSet;

public class Directory {

	private String directoryName;
	private HashSet<File> files;

	public Directory(String directoryName, File... files) {

		this.directoryName = directoryName;
		this.files = new HashSet<>(Arrays.asList(files));
	}

	public void addFileToDirectory(File file) {
		if (files.contains(file)) {
			System.out.printf("Such file %s already exists\n", file.toString());
		}
		this.files.add(file);
	}

	public void deleteFile(File file) {
		files.remove(file);
	}

	public String getDirectoryName() {
		return directoryName;
	}

	public void setDirectoryName(String directoryName) {
		this.directoryName = directoryName;
	}

	public HashSet<File> getFiles() {
		return files;
	}

	public void setFiles(HashSet<File> files) {
		this.files = files;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(String.format("Directory>> %s\\\\\n ", directoryName));
		for (File file : files) {
			stringBuilder.append(file.toString()).append("\n ");
		}
		return stringBuilder.toString();
	}
}
