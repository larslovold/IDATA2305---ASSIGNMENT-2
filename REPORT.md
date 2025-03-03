# Observations

## Scenario 1: Using Synchronization
- Ensures correct ticket count at the end.
- No overbooking
- Output is consistente with the expected number of remaining tickets.

## Scenario  2: Using `volatile` without Synchronization
- Multiple threads may book the same ticket simultaneously.
- Overbooking might occur.
- The final ticket count may not be correct.

## Scenario  3: Removing volatile and synchronization
- Severe race conditions.
- Results vary each time the program runs.
- Overbooking is highly likely.

## Conclusion
- Best Practice: Use synchronized for thread-safe booking.
- volatile alone is not enough: It ensures visibility but not atomicity.
- Without synchronization, the system is inconsistent.