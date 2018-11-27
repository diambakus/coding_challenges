#include <bits/stdc++.h>

using namespace std;

// Complete the repeatedString function below.
long repeatedString(string s, long n) {
    
    long a_counter_in_quotient = 0;
    long a_counter_in_remain = 0;
    long quotient, remain;
    int str_len = s.length();
    

    // compute quotient and remain
    quotient = n / str_len;
    remain = n % str_len;

    long min_seq = (str_len >= quotient) ? quotient : str_len;
    // compute occurence of as in the string s
    for (int i = 0; i < min_seq; i++)
        if (s.at(i) == 'a') a_counter_in_quotient++;
    
    for (int i = 0; i < remain; i++)
        if (s.at(i) == 'a') a_counter_in_remain++;
    
    return (a_counter_in_quotient*quotient + a_counter_in_remain);
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    long n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    long result = repeatedString(s, n);

    fout << result << "\n";

    fout.close();

    return 0;
}
