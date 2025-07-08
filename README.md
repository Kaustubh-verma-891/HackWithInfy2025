# **HackWithInfy2025**

This repository tracks my progress in solving problems and practice for HackWithInfy2025.

---

## **GreedyApproach**

| Problem Name          | Problem Link                                                                                                                                                       | Approach Summary                                                    | Status  |
|-----------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------|---------|
| Activity Selection    | [Maximum Length of Pair Chain]([https://leetcode.com/problems/two-sum/](https://leetcode.com/problems/maximum-length-of-pair-chain/description/))                  | Sort the array according to the ending time and apply the approach. | Solved  |
| Fractional Knapp-Sack | [Maximum Units On a Truck]([https://leetcode.com/problems/best-time-to-buy-and-sell-stock/](https://leetcode.com/problems/maximum-units-on-a-truck/description/))  | Sort array according to units and apply knapsack approach.          | Solved  |

---

## **DP**

| Problem Name        | Problem Link                                                                    | Approach Summary                                                                                                           | Status |
|---------------------|---------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|--------|
| Minimum Coin Change | [Coin Change]([https://leetcode.com/problems/coin-change/description/)          | Use recursive approach to explore all possible solution and using dp array store to the solution that are repeating.       | Solved |
| Nth Fibonacci       | [Nth Fibonacci]([https://leetcode.com/problems/fibonacci-number/description/])  | Use tabulation in order to calculate nth no. by adding previous two no. from dp array, (base case dp[0] = 0 and dp[1] = 1) | Solved |
| Climbing Stairs     | [Climbing Stairs]([https://leetcode.com/problems/climbing-stairs/description/]) | Use tabulation and use same approach as fibonacci with returning minimum value from last two values of dp array.           | Solved |
| Coin Change         | [Coin Change]([https://www.geeksforgeeks.org/problems/coin-change2448/1])       | Use recursion with inclusion - exclusion principle to find no of ways then apply memoization to optimize the solution.     | Solved |
| Minimum Coin Change | [Minimum Coin Change]([https://leetcode.com/problems/coin-change/description/]) | Use inclusion - exclusion principle for picking the coins and return minimum ans that you obtain from both situation.      | Solved |
| House Robber        | [House Robber]([https://leetcode.com/problems/house-robber/description/])       | Use fibonacci pattern but change the condition for filling the dp array i.e use minimum of previous two values.            | Solved |


---

## **EXTRAS**

| Problem Name          | Problem Link  | Approach Summary                                                                                                                 | Status   |
|-----------------------|---------------|----------------------------------------------------------------------------------------------------------------------------------|----------|
| GDC Composition       | HackerBlock   | Using graph to separate no. that have gcd 1 then finding that the graph is bipartite or not.                                     | Solved   |
| Minimum Serving (P1)  | Problem Sheet | Calculate frequency of each type of dish (according to problem) and picking the smallest dish with highest frequency calculated. | Solved   |

---