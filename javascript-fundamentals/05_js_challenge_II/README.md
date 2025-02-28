# JavaScript Challenge II T-Diagram

## Task 1: Inventory Tracker

| Variable       | Values                            |
|---------------|----------------------------------|
| inventory     | `["apple", "banana", "cherry", "date", "elderberry"]` |
| inventoryCount | `[10, 15, 5, 20, 7]`             |
| i            | `0 → 1 → 2 → 3 → 4 → 5`          |

**Output:**
```
apple: 10
banana: 15
cherry: 5
date: 20
elderberry: 7
```

---

## Task 2: Alphabetical Sorting

| Variable | Values                                     |
|----------|--------------------------------------------|
| words    | `["zebra", "apple", "mango", "cherry", "banana"]` |
| i        | `0 → 1 → 2 → 3 → 4`                         |
| j        | `i + 1` (Comparing each element)           |
| temp     | Used to swap values                        |

**Output:**
```
["apple", "banana", "cherry", "mango", "zebra"]
```

---

## Task 3: Unique Array Builder

| Variable       | Values                      |
|---------------|-----------------------------|
| uniqueNumbers | `[4, 15, 8, 12, 1, 20, 5, 9, 17, 3]` |
| randomNumber  | Random number between 1 and 20 |
| exists       | `true` if duplicate, `false` if unique |
| while        | Loops until `uniqueNumbers.length == 10` |

**Output:**
```
[4, 15, 8, 12, 1, 20, 5, 9, 17, 3]
```

---

## Task 4: Triangle Checker

| Variable | Values        |
|----------|-------------|
| sideA    | `7`         |
| sideB    | `10`        |
| sideC    | `5`         |
| Condition | `true` (Valid Triangle) |

**Output:**
```
The sides 7, 10, and 5 form a valid triangle.
```