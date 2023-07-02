package Project;

public abstract class FileMultimediale implements Media {
	protected String title;

	public FileMultimediale(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
}
