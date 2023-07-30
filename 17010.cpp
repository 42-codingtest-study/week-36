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
    int m;
    char c;
    cin >> n;
    while (n--)
    {
        cin >> m >> c;
        for (int i = 0; i < m; i++)
        {
            cout << c;
        }
        cout << endl;
    }
}
