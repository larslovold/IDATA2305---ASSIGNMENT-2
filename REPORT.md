# Observations

## Experiment 1: Using Synchronization
- Ensures correct ticket count at the end.
- Prevents race conditions.

## Experiment 2: Using `volatile` without Synchronization
- Does not guarantee consistent results.
- Threads may read outdated values, leading to overselling tickets.

## Conclusion
Synchronization is required to maintain consistency. The `volatile` keyword alone is not sufficient because it does not provide atomicity.