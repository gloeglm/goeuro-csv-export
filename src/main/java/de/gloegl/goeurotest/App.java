package de.gloegl.goeurotest;

import java.io.IOException;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

public class App {
	GoEuroService goEuroService = new GoEuroService();

	public static void main(String[] args) {
		validateArguments(args);

		App app = new App();
		try {
			app.queryAndExportCities(args[0]);
		} catch (RuntimeException | IOException e) {
			System.err.println("An error occured! Here is some info that might help the maintainer "
							+ "(m.gloegl@gmail.com)");
			e.printStackTrace();
		}
	}

	private static void validateArguments(String[] args) {
		if (args.length != 1 || args[0].equals("-h") || args[0].equals("--help")) {
			System.out.println("GoEuro City Suggestions CSV Exporter");
			System.out.println("Argument Required: City Name you want suggestions for");
			System.exit(0);
		}
	}

	private void queryAndExportCities(String cityName) throws IOException {
		List<CitySuggestion> citySuggestions = goEuroService.getCitySuggestions(cityName);
		final CSVPrinter printer = CSVFormat.DEFAULT.print(System.out);
		for (CitySuggestion cs : citySuggestions) {
			printer.printRecord(
					cs.getId(), 
					cs.getName(), 
					cs.getType(), 
					cs.getLocation().getLatitude(), 
					cs.getLocation().getLongitude());
		}

	}
}