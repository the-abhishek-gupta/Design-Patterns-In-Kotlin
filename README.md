# Design Patterns in Kotlin

A small Kotlin JVM project that demonstrates common design patterns with simple, runnable examples.

## Project Structure

The examples are organized by pattern category under `src/main/kotlin`:

- `creational`
  - Factory
  - Abstract Factory
  - Builder
  - Singleton
  - Prototype
- `structural`
  - Adapter
  - Bridge
  - Composite
  - Decorator
  - Facade
  - Proxy
  - Flyweight
- `behavioural`
  - Category entrypoint exists, but examples have not been implemented yet

## Requirements

- JDK 24
- Gradle wrapper included in the repository

The project uses:

- Kotlin `2.3.0`
- Gradle `9.0.0`

## Build

```bash
./gradlew build
```

This command was verified successfully in the current project state.

## Run the Examples

The main entrypoint is:

- `src/main/kotlin/Main.kt`

`Main.kt` delegates to one category at a time. Right now it is set to run the structural examples, and `StructuralMain.kt` is currently set to run the Flyweight example.

To run a different example:

1. Open `Main.kt`
2. Uncomment the category you want to run
3. Open that category's `*Main.kt`
4. Uncomment the specific pattern example you want to execute
5. Run the `main` function from your IDE

Current category entrypoints:

- `creational/CreationalMain.kt`
- `structural/StructuralMain.kt`
- `behavioural/BehaviouralMain.kt`

## Notes

- This project is focused on simple pattern demonstrations rather than production-ready abstractions.
- Behavioural patterns are not implemented yet.
- There is no Gradle `run` task configured at the moment; examples are intended to be run from the Kotlin `main` entrypoint in the IDE.
