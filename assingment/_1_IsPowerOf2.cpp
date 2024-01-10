// to check the given number is power of 2 or not

#include <iostream>

using namespace std;

bool isPowerOfTwo(int n)
{

    while (n > 1)
    {
        if (n % 2 != 0)
        {
            return false;
        }
        n /= 2;
    }

    return true;
}

int main()
{

    int n;
    cout << "Enter the number :";
    cin >> n;

    cout << "\nResult : " << (isPowerOfTwo(n) == 1 ? "TRUE" : "FALSE");

    return 0;
}