# DatLib #
Just another library to make life easier.

## Sets ##
Sets are simply a group of numbers.
For example the Set3i class stores 3 integers.
Basic math operations can pe performed on individual numbers in the set or the entire set.
```java
Set2i coords = new Set3i(25, 235, -542);
coords.addLocal(15);
Set3i newCoords = coords.addNew(13, 54, 233);
```

## Bounded Numbers ##
Bounded numbers are number containers that come in different types.

### Default ###
The default bounded number limits the number between an upper and lower bound.
A bounded number 5 with a bounds of 0 and 10 would result in 10 when 15 was added to it.

### Looping ###
Looping numbers will wrap around when the limits have been exceded.
For example the number 7 with bounds of 0 and 10 would result in 2 when 5 was added to it.