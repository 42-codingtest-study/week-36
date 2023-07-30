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
    string s;
    cin >> s;
    int n = (s.length() - 2) * 2;
    cout << "h" << string(n, 'e') << "y" << endl;
}
