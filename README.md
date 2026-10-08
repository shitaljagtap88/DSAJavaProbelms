# DSA Java Coding

Interview-prep problems in Java: a short statement, an interview-quality solution (with time/space notes), and JUnit 5 tests for the main path plus edges.

Requires **Java 21**. Tests run with the Gradle wrapper — no global Gradle install needed.

```bash
./gradlew test
```

## Suggested study order

Work one topic at a time. Easy problems first, then the medium follow-up.

| Order | Topic | Package | Problems |
| ---: | --- | --- | --- |
| 1 | Arrays / hashing | `dsa.arrays` | Two Sum (easy), Group Anagrams (medium) |
| 2 | Two pointers | `dsa.twopointers` | Valid Palindrome (easy), Container With Most Water (medium) |
| 3 | Sliding window | `dsa.slidingwindow` | Longest Substring Without Repeating Characters, Minimum Size Subarray Sum |
| 4 | Stack | `dsa.stack` | Valid Parentheses (easy), Daily Temperatures (medium) |
| 5 | Linked list | `dsa.linkedlist` | Reverse Linked List, Linked List Cycle |
| 6 | Binary tree | `dsa.tree` | Maximum Depth, Level Order Traversal |
| 7 | Graph BFS / DFS | `dsa.graph` | Number of Islands (DFS), Course Schedule (BFS / topological) |
| 8 | Binary search | `dsa.binarysearch` | Binary Search (easy), Search in Rotated Sorted Array (medium) |
| 9 | Heap | `dsa.heap` | Last Stone Weight (easy), Top K Frequent Elements (medium) |
| 10 | 1D / 2D DP | `dsa.dp` | Coin Change (1D), Unique Paths (2D) |

Shared types live in `dsa.common` (`ListNode`, `TreeNode`).

## Layout

```
src/main/java/dsa/<topic>/   solutions
src/test/java/dsa/<topic>/   JUnit 5 tests
```

Each solution class documents the prompt and complexity in Javadoc. Read the solution, cover it, then re-implement from the tests.
