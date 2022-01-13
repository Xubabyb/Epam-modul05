package by.jonline.modul05.exercise01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Text {
	
	private String heading;
	private ArrayList<String> text;

	public Text() {
		this.heading = "UNKNOWN";
		this.text = new ArrayList<>();
	}

	public Text(String heading, String... strings) {
		this.heading = heading;
		this.text = new ArrayList<String>(Arrays.asList(strings));

	}

	@Override
	public int hashCode() {
		return Objects.hash(heading, text);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		return Objects.equals(heading, other.heading) && Objects.equals(text, other.text);
	}

	@Override
	public String toString() {

		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("\t").append(heading).append("\n");

		for (String temp : text) {
			stringBuilder.append(temp).append("\n");
		}

		return stringBuilder.toString();
	}

	public ArrayList<String> getText() {
		return text;
	}

	public void setText(ArrayList<String> text) {
		this.text = text;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public void addString(String string) {
		this.text.add(string);
	}
	
}
