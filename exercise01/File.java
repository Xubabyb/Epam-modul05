 package by.jonline.modul05.exercise01;

import java.util.Objects;

public abstract class File {

	private String fileName;
	protected String type;

	public File(String fileName) {
		this.fileName = fileName;

	}

	public String getFileName() {
		return fileName;
	}

	public String getType() {
		return type;
	}

	private int setFileName(String fileName) {
		if (fileName == null) {
			return -1;
		} else if (fileName.isEmpty()) {
			return -2;
		} else if (fileName.matches("^\\W.*")) {
			return -3;
		} else {
			this.fileName = fileName;
			return 0;
		}
	}

	public void renameFile(String newName) {

		int status = setFileName(newName);

		switch (status) {
		case -1: {
			System.out.println("Filename cannot be NULL");
			break;
		}
		case -2: {
			System.out.println("Filename cannot be empty");
			break;
		}
		case -3: {
			System.out.println("Filename can only start with alfanumeric characters or underscore");
			break;
		}
		case 0: {
			System.out.println("File rename complete");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + status);
		}
		this.setFileName(newName);
	}

	@Override
	public String toString() {
		return this.getFileName() + this.type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fileName, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		File other = (File) obj;
		return Objects.equals(fileName, other.fileName) && Objects.equals(type, other.type);
	}

	abstract public void outputContent();

}
