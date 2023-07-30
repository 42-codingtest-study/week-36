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
    int a[n];
    for (int i = 0; i < n; i++)
        cin >> a[i];
    int total = 0;
    int set[5];
    memset(set, 0, sizeof(set));
    for (int i = 0; i < n; i++)
    {
        if (a[i] != -1)
        {
            total += a[i];
            set[a[i]]++;
        }
    }
    int set_total = 0;
    for (int i = 0; i < 5; i++)
    {
        if (set[i] != 0)
            set_total += set[i];
    }
    float avg = (float)total / set_total;
    cout << avg << endl;
}
