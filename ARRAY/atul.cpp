#include<iostream>
using namespace std;
int main()
{
    int arr[100],n;
    cout<<"Enter the size of array : ";
    cin>>n;
    cout<<"Enter the element of array : ";
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }

    int i=0;

    for(int j=1;i<n;j++)
    {
        if(arr[j]!=arr[i])
        {
            i++;
            arr[i]=arr[j];
        }
    }
     
    cout<<"the output is : ";
    for(int i=0;i<5;i++)
    {
        cout<<arr[i]<<" ";
    }
}