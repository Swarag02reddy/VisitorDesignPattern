# Construction Lab 2: Design Patterns and Dependency Injection

##Overview

This project demonstrates three design patterns :
**Activity 1** employs a Factory pattern by establishing another implementation of 'IVehicleInspector' and a factory class. The main class 'Altmain.java' uses these to locate the appropriate inspector.

**Activity 2** Installs a Factory pattern by adding a different implementation of 'IvehicleInspector' and a factory class . The 'AltMain.java' employs them in order to look up the right inspector.

**Activity 3**Uses the Strategy pattern to modify the behavior of the 'calculateTotal' method by introducing an emissions fee strategy. The new vehicle interface contains a 'co2Emissions()' method, and new strategy classes ( 'OneEmissionsStrategy','TwoEmissionsStrategy' , 'NullEmissionsStrategy') are used by the singleton service 'Act3vehicleService'  and its main class 'Act3Main.java'.

## Build and run Instructions ##

### Pre-requisites

- Ensure that you have JDK installed
- Place the 'json-simple-1.1.1.jar' library in a folder named **lib**.

### compilation

From the project root, run the following command

'''bash
javac -cp ".:lib/json-simple-1.1.1.jar" src/*.java

### running The Programs

to run the programs use the following commands for respective activities

Original Main program 
- java -Ddata=./data/data.json -cp ".:lib/json-simple-1.1.1.jar:src" Main
Activity 1
- java -Ddata=./data/data.json -Dvi=alt -cp ":lib/json-simple-1.1.1.jar:src" AltMain
Activity 2
- java -Ddata=./data/data.json -Dvi=alt -cp ".:lib/json-simple-1.1.1.jar:src" Act2Main
Activity 3
- java -Ddata=./data/data/json -Dvi=alt -Des=one -cp ".:lib/json-simple-1.1.1.jar:src" Act3Main


## Discussion

The Visitor Pattern allows you to add new operations to an existing class structure without modifying the classes. The visitor pattern is used in this project to calculate service charges by "visiting" each vehicle.

The strategy pattern ties algorithms together so that they can be swapped out at runtime. In Activity 3, the strategu pattern is employed to modify the behaviour of calculateTotal so that it computes an emissions fee, and service charges as non-negative.

## Additional notes

- The data.json file must be placed in the data folder.
- the submission file is named clab2_1235866842.zip
- the submission contains all files including data.json, json-simple-1.1.1.jar, codefiles(.java files), and .git file.

## git info

- this code was first tested on local system.
- after its ready it is updated in git




