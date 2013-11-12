import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exporter {

	/**
	 * FileWriter to write to a file.
	 */
	private FileWriter fileWriter;
	/**
	 * PrintWriter to write to a file.
	 */
	private PrintWriter printWriter;

	/**
	 * 
	 * @param file
	 *            to which the results to be written
	 * @param append
	 *            true if you want to append the new results to the existing
	 *            ones
	 * @throws IOException
	 */
	public Exporter(String file, String header, boolean append)
			throws IOException {
		fileWriter = new FileWriter(file, append);
		printWriter = new PrintWriter(fileWriter);
		printWriter.println(header);
	}

	/**
	 * Writes a given string to the file.
	 * 
	 * @param s
	 *            string to be written in the file
	 */
	public void export(String s) {
		printWriter.println(s);
		printWriter.flush();

	}

}
