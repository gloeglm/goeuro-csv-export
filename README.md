# goeuro-csv-export
Simple tool that queries the goeuro API for position suggestions based on name and prints them as csv

## Building it

Required:
* Java 7
* Maven

After checking out the project running mvn package will build the project. Fat jar will be created in the "target" subdirecotry as goeuro-csv-export-<version>.jar

## Running it

Run with "java -jar goeuro-csv-export-<version>.jar <CityName>"
CSV export will be written to the console, so pipe it to a file if you want a file

## Stuff that could be improved
* Use slf4j/logback instead of System.err
* The one test that is there depends on an external system being 100% reachable
* No test coverage for App.java but there is barely any code 
