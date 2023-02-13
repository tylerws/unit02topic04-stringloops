In this assignment, all exercises should be completed in the same file. Write some code in the `main` method to demonstrate/test each method.

1. `reverseCharacters`

Take as input a `String`, and return a `String` which contains all the same characters as the input string, but in reverse order.

input | return
---|---
"academy" | "ymedaca"
"radar" | "radar"
"taco cat" | "tac ocat"

2. `indexesOfAll`

Take as input two `String`s: `text` and `searchTerm`. Return an array of `int`s that represent the indexes of each occurrence of `searchTerm` in `text`. Return an empty array if `searchTerm` does not occur in `text`.

`text` | `searchTerm` | return value
---|---|---
"attack" | "a" | [0, 3]
"attack" | "t" | [1, 2]
"attack" | "c" | [4]
"attack" | "b" | []

3. `hasRepeatedConsecutives`

Take as input a `String` representing a word in lowercase, and return `true` if it has two identical characters in a row and `false` otherwise.

input | return value
---|---
"bookkeeper" | true
"kick" | false
"alibi" | false
"rook" | true

4. `reverseWords`

Take as input a `String` representing a sentence, and return a `String` which contains all the same words as the input string, but in reverse order.

input | return
---|---
"the quick brown fox" | "fox brown quick the"
"taco cat" | "cat taco"