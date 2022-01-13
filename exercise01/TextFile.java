package by.jonline.modul05.exercise01;

public class TextFile extends File {

	private Text text;

	public TextFile(String fileName) {
		super(fileName);
		this.type = ".txt";
		text = new Text("");

	}

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}

	public void addText(String string) {
		text.getText().add(string);
	}

	@Override
	public void outputContent() {
		System.out.println(this + " content:");
		if (text.getText().isEmpty()) {
			System.out.println("You text could be here".toUpperCase()+"\n");
		} else {
			System.out.println(text);
		}
	}

}
