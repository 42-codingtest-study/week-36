#include <iostream>
#include <cstring>
#include <algorithm>
#include <vector>
#include <cmath>

using namespace std;

#define fast                          \
    ios_base::sync_with_stdio(false); \
    cin.tie(0), cout.tie(0)
#define ll long long

int main()
{
    fast;
    int n;
    cin >> n;
    while (1)
    {
        int total = 0;
        string s = to_string(n);
        for (int i = 0; i < s.length(); i++)
        {
            total += s[i] - '0';
        }
        if (n % total == 0)
        {
            cout << n << endl;
            break;
        }
        n++;
    }
}
