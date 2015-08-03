# goeuro-csv-export
Simple tool that queries the goeuro API for position suggestions based on name and prints them as csv

## Building it

Required:
* Java 1.7.
* Maven

After checking out the project running mvn package will build the project. Fat jar will be created in the "target" subdirecotry

## Running it

Run with "java -jar <jarname> <CityName>"
CSV export will be written to the console, so pipe it to a file if you want a file
