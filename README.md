# Movie Ticket Booking System

## Overview
This project simulates a multi-threaded movie ticket booking system in Java. The goal is to understand thread synchronization and the `volatile` keyword.

## Project Structure
```
├── booking
│   ├── MovieTicketClient.java
│   ├── MovieTicketServer.java
└── Main.java
```

## How to Run
1. Compile the project:
   ```sh
   javac booking/*.java Main.java
   ```
2. Run the application:
   ```sh
   java Main
   ```

## Experimentation
- Run the project with and without `volatile`.
- Remove synchronization and observe inconsistencies.