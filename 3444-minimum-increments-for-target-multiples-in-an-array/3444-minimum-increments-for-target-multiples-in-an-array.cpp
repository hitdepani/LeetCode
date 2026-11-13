#include <vector>
#include <numeric>
#include <algorithm>
#include <set>
using namespace std;

class Solution {
public:
    int minimumIncrements(vector<int>& nums, vector<int>& target) {
        int n = nums.size(), m = target.size();
        const int K = 8;
        set<int> cand;

        for (int j = 0; j < m; ++j) {
            long long t = target[j];
            vector<pair<long long, int>> costs(n);
            for (int i = 0; i < n; ++i) {
                long long rem = nums[i] % t;
                costs[i] = {rem == 0 ? 0 : t - rem, i};
            }
            int take = min(n, K);
            nth_element(costs.begin(), costs.begin() + take - 1, costs.end());
            for (int i = 0; i < take; ++i) {
                cand.insert(costs[i].second);
            }
        }

        int full = (1 << m);
        vector<long long> subLcm(full, 1);
        for (int mask = 1; mask < full; ++mask) {
            for (int j = 0; j < m; ++j) {
                if (mask & (1 << j)) {
                    subLcm[mask] = std::lcm(subLcm[mask], (long long)target[j]);
                }
            }
        }

        const long long INF = 1e18;
        vector<long long> dp(full, INF);
        dp[0] = 0;

        for (int idx : cand) {
            long long x = nums[idx];
            vector<long long> ndp = dp;
            for (int mask = 1; mask < full; ++mask) {
                long long L = subLcm[mask];
                long long rem = x % L;
                long long cost = (rem == 0 ? 0 : L - rem);
                for (int prev = 0; prev < full; ++prev) {
                    if (dp[prev] != INF) {
                        ndp[prev | mask] = min(ndp[prev | mask], dp[prev] + cost);
                    }
                }
            }
            dp = move(ndp);
        }

        return dp[full - 1];
    }
};