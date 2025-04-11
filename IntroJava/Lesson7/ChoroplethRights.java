

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import processing.core.PApplet;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.GeoJSONReader;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.providers.Microsoft;
import de.fhpotsdam.unfolding.utils.MapUtils;

/**
 * Visualizes population density of the world as a choropleth map. Countries are shaded in proportion to the population
 * density.
 * 
 * It loads the country shapes from a GeoJSON file via a data reader, and loads the population density values from
 * another CSV file (provided by the World Bank). The data value is encoded to transparency via a simplistic linear
 * mapping.
 */
public class ChoroplethRights extends PApplet {

	UnfoldingMap map;

	HashMap<String, CountryRights> dataEntriesMap;
	List<Marker> countryMarkers;

	public void settings() {
		size(800, 600, P2D);
	}

	public static void main(String args[]) {
		PApplet.main(new String[] { ChoroplethRights.class.getName() });
	}

	public void setup() {
		size(800, 600); 
		map = new UnfoldingMap(this, 50, 50, 700, 500, new Microsoft.RoadProvider());
		map.zoomToLevel(2);
		map.setBackgroundColor(240);
		MapUtils.createDefaultEventDispatcher(this, map);

		// Load country polygons and adds them as markers
		List<Feature> countries = GeoJSONReader.loadData(this, "data/countries.geo.json");
		countryMarkers = MapUtils.createSimpleMarkers(countries);
		map.addMarkers(countryMarkers);

		// Load rights data ***
		dataEntriesMap = loadPopulationDensityFromCSV("lgbt-legal-equality-index.csv");
		println("Loaded " + dataEntriesMap.size() + " data entries");

		// Country markers are shaded according to its population density (only once)
		shadeCountries();
	}

	public void draw() {
		background(240);

		// Draw map tiles and country markers
		map.draw();
	}

	public void shadeCountries() {
		for (Marker marker : countryMarkers) {
			// Find data for country of the current marker
			String countryId = marker.getId();
			CountryRights dataEntry = dataEntriesMap.get(countryId);

			if (dataEntry != null) {
				float value = (float)dataEntry.getEqualityIndex();
				// Encode value as brightness (values range: 0-1000)
				float transparency = map(value, 0, 100, 10, 255);
				marker.setColor(color(255, 0, 0, transparency));
				//marker.setColor(color(255, 0, 0, dataEntry.getAlpha()));
			} else {
				// No value available
				marker.setColor(color(100, 120));
			}
		}
	}

	public HashMap<String, CountryRights> loadPopulationDensityFromCSV(String fileName) {
		HashMap<String, CountryRights> dataEntriesMap = new HashMap<String, CountryRights>();

		String[] rows = loadStrings(fileName);
		for (String row : rows) {
			// Reads country name and population density value from CSV row
			String[] columns = row.split(",");
			if (columns.length >= 3) {
				CountryRights dataEntry = new CountryRights(columns[0], columns[1], Double.parseDouble(columns[3]) );
				dataEntriesMap.put(columns[1], dataEntry);
			}
		}

		return dataEntriesMap;
	}


}