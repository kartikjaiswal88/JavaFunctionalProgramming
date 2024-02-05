#include <iostream>
#include <bits/stdc++.h>
using namespace std;

bool hasArrayTwoCandidates(int arr[], int n, int x)
{
    unordered_map<int, int> m;

    for (int i = 0; i < n; i++)
        m[arr[i]]++;

    for (int i = 0; i < n; i++)
    {
        int key = arr[i];
        int val = m[arr[i]];
        int pair = x - arr[i];
        if (key == pair) // In case both the numbers are equal
        {
            if (val >= 2)
                return true;
        }
        else if (m[pair])
            return true;
    }

    return false;
}

bool find3Numbers(int arr[], int n, int X)
{
    sort(arr, arr + n);
    for (int i = 0; i < n; i++)
    {
        int toFind = X - arr[i];
        int p = i + 1;
        int q = n - 1;
        while (p < q)
        {
            int sum = arr[p] + arr[q];
            if (sum == toFind)
                return true;
            else if (sum < toFind)
                p++;
            else
                q--;
        }
    }
    return false;
}

void segregate0and1(int arr[], int n)
{

    int zero = 0;
    int one = n - 1;

    while (zero <= one)
    {
        while (arr[zero] == 0 && zero < n)
            zero++;
        while (arr[one] == 1 && one >= 0)
            one--;

        if (one > zero)
            swap(arr[zero++], arr[one--]);
    }
}

int binarysearch(int arr[], int n, int k)
{

    int low = 0, high = n - 1;
    while (low <= high)
    {
        int mid = low + (high - low) / 2;

        if (arr[mid] == k)
            return mid;
        else if (arr[mid] < k)
            low = mid + 1;
        else
            high = mid - 1;
    }
    return -1;
}

void indexes(vector<long long> v, long long x)
{
    long long l = 0;
    long long maxi = INT_MIN;
    long long h = v.size() - 1;
    long long mini = INT_MAX;
    int i=1;
    while (l < h)
    {
        cout<<"Iteration:"<<i++<<endl;
        long long m = l + (h - l) / 2;

        if (v[m] == x)
        {
            maxi = max(maxi, m);
            mini = min(mini, m);
        }
        else if (v[m] < x)
            l = m + 1;
        else
            h = m - 1;
    }

    cout << "Maxi" << maxi << endl;
    cout << "Mini" << mini << endl;
}

int main()
{
    vector<long long> arr = {1, 2, 2, 3, 4, 5};
    indexes(arr,2);

}