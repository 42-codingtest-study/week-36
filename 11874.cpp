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
    int a, b, c;
    cin >> a >> b >> c;
    int min_int = 2147483647, max_int = 0;
    for (int i = a; i <= b; i++)
    {
        int sum = 0, temp = i;
        while (temp > 0)
        {
            sum += temp % 10;
            temp /= 10;
        }
        if (sum == c)
        {
            min_int = min(min_int, i);
            max_int = max(max_int, i);
        }
    }
    cout << min_int << endl;
    cout << max_int << endl;
}
