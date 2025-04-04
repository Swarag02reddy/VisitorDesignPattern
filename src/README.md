# Construction Lab 2: Design Patterns and Dependency Injection

## Overview

This project demonstrates the use of three design patterns:
- **Activity 1:** Implements a Factory pattern by creating an alternate implementation of `IVehicleInspector` (named `AltVehicleInspection`) along with a factory class (`VehicleFactory`). The main class `AltMain.java` uses these to determine the correct inspector.
- **Activity 2:** Refactors the solution to use Dependency Injection via a Singleton (`Act2VehicleService`) along with its corresponding main class (`Act2Main.java`). This eliminates the client’s responsibility for instantiating or configuring the service.
- **Activity 3:** Uses the Strategy pattern to vary the behavior of the `calculateTotal` method by introducing an emissions fee strategy. The updated vehicle interface (`IVehicle`) now includes a `co2Emissions()` method, and new strategy classes (`OneEmissionsStrategy`, `TwoEmissionsStrategy`, `NullEmissionsStrategy`) are used by the singleton service `Act3VehicleService` and its main class `Act3Main.java`.

## Commit History

- **Initial Commit:** [commit-hash-initial]
- **Activity 1 – Factory Pattern:** [commit-hash-activity1]
- **Activity 2 – Dependency Injection / Singleton:** [commit-hash-activity2]
- **Activity 3 – Strategy Pattern:** [commit-hash-activity3]



## File Structure

