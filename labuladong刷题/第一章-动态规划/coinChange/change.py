def coinChange(coins: List[int], amount: int):
    def dp(n):
        if n ==0 : return 0;
        if n < 0 : return -1;
        for coin in coins:
            subproblem = dp(n - coin)
            if subproblem == -1 : continue;
            res = min(res, 1 + dp(n - coin))
        return res 
    return dp(amount);