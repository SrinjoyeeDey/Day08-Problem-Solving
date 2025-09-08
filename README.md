# 🚀 Day 8 – Solving with Trie (Longest Word + Group Anagrams)

![Java](https://img.shields.io/badge/Language-Java-blue?logo=java&logoColor=white)  ![Data Structures](https://img.shields.io/badge/Topic-Data%20Structures-orange)  ![LeetCode](https://img.shields.io/badge/Practice-LeetCode-yellow?logo=leetcode)  ![Status](https://img.shields.io/badge/Status-Solved-brightgreen)  

This repository contains *clean Java implementations* of important DSA problems, with explanations, edge cases, and approaches. Perfect for *interview prep* 💯.  


---


## ✨ Short Description

🎯 Today marks my Day 8 of coding consistency!
Instead of sticking only to the optimal solutions, I went on an exploration journey with Trie 🌲 because I was curious to see how these problems could be solved using tries, even though there are much better approaches.

📌 Problems solved:
1️⃣ Longest Word in Dictionary
2️⃣ Group Anagrams

I learned that sometimes solving a problem with a "not-so-optimal" approach teaches you a lot about the data structure 💡.


---

## 📖 Problem 1 – Longest Word in Dictionary -- LeetCode-720

🔹 Problem Statement

Given a list of words, return the longest word that can be built one character at a time by other words in the list. If there are multiple answers, return the lexicographically smallest one.

## ⚡ Approaches

1. Sorting + HashSet (Better Approach) ✅

Sort words by length and lexicographic order.

Check prefixes using a HashSet.

Time Complexity: O(N log N + N*L)

Space Complexity: O(N*L)



2. Trie (My Exploration 🚀)

Insert words into a trie.

During DFS, only continue if the prefix is marked as a valid word.

Keep track of the longest valid word.

Time Complexity: O(N * L)

Space Complexity: O(N * L)





---

## 🌲 Trie Approach (With DRY RUN)

Suppose input is:

["w","wo","wor","worl","world"]

1. Insert all words into Trie.

root -> 'w' -> 'o' -> 'r' -> 'l' -> 'd'


2. Start DFS:

At 'w' → valid prefix ✅

'wo' → valid prefix ✅

'wor' → valid prefix ✅

'worl' → valid prefix ✅

'world' → valid prefix ✅



3. Result → "world" 🎉




---

## 📖 Problem 2 – Group Anagrams -- LeetCode-49

🔹 Problem Statement

Given an array of strings, group the anagrams together.

## ⚡ Approaches

1. Sorting-based (Better Approach) ✅

Sort each word and use it as a key in HashMap.

Time Complexity: O(N * L log L)

Space Complexity: O(N*L)



2. Character Count (Optimal) 🥇

Count character frequency (26-length array).

Use it as a key.

Time Complexity: O(N * L)

Space Complexity: O(N*L)



3. Trie-based (My Exploration 🚀)

Insert each word into Trie, sorted by characters.

Anagrams will end at the same node.

Time Complexity: O(N * L log L) (sorting each word before insertion)

Space Complexity: O(N*L)





---

## 🌲 Trie Approach (With DRY RUN)

Suppose input is:

["eat","tea","tan","ate","nat","bat"]

1. Sort each word before inserting:

"aet", "aet", "ant", "aet", "ant", "abt"



2. Insert into Trie:

Words with same sorted key land on same path.



3. DFS traversal collects groups:

[["eat","tea","ate"],["tan","nat"],["bat"]]




---

## ⚠ Edge Cases Covered

Empty input [] → return []

Single word → return itself

Multiple answers for longest word → return lexicographically smallest

All words different (no anagrams) → each group is of size 1



---

### ⏳ Time & Space Complexity Summary

Problem	Approach	Time Complexity	Space Complexity

Longest Word	HashSet	O(N log N + N*L)	O(N*L)
Longest Word	Trie 🌲	O(N*L)	O(N*L)
Group Anagrams	Sorting	O(N * L log L)	O(N*L)
Group Anagrams	Char Count 🥇	O(N*L)	O(N*L)
Group Anagrams	Trie 🌲	O(N*L log L)	O(N*L)



---

### 🎉 Takeaways

Even though Trie is not the most efficient here, it deepened my understanding of prefix trees 🌲.

Sometimes experimenting with different DS/Algo gives more insights than just solving optimally.

Day 8 🔥 Consistency maintained 💪



---

⭐ If you find this interesting, don’t forget to drop a star 🌟 on this repo!


---

 


