#include<bits/stdc++.h>

using namespace std;

int main(){
    // test set
    int t;
    vector<int> X(3); // define vector for inputs integer
    cin >> t;         // input No. of test to perform

    while (t--)
    {
        /* code for input all the integers into vector */
        for (auto &i : X)
            cin>> i;
        /* Sort the elements of vector */

        sort(X.begin(), X.end());

        if(X[1]!=X[2]){
            cout << "No" << endl;
        }else
        {
            cout << "Yes" << endl
                 << X[0] << " " << X[0] << " " << X[2] << endl;
        }
    }

    return 0;
}

/*  Input:
2
10, 30, 20
100, 100, 100
 */

/* Output:
No
Yes
100, 100, 100 */