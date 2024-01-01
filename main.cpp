//by the name of Allah

/*
    What is the third largest integer in the array?
*/
#include <iostream>
using namespace std;

void largest_num(){
    int arr[5] = {12,30,42,52,16};
    int arrayLength = sizeof(arr) / sizeof(int);
    for (int i = 0; i < arrayLength; i++){
        if (arr[i] < arr[i + 1]){
            arr[i + 1] = arr[i];
        }
        else {

        }
    }
        cout << arr[0];
}

int main(){
    largest_num();
}