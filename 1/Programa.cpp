#include <iostream>

using namespace std;

int main(){
	int i,j,aux;
	int vec[10];
		
	for(i=0;i<10;i++){
		cout<<"ingrese valor numero: "<<i+1<<endl;
         cin>>vec[i];
	}
	system ("cls");
	cout<<"vector original: ";
	for(i=0; i<10;i++){
		cout<<vec[i]<<" ";
	}
	cout<<endl;
	for(i=0;i<10;i++){
		for(j=0;j<10;j++){
			if(vec[j]>vec[j+1]){
				aux=vec[j];
				vec[j]=vec[j+1];
				vec[j+1]=aux;
			}
		}
	}
    cout<<"vector organizado de menor a mayor: ";
	for(i=0;i<10;i++)
	{
		cout<<vec[i]<<" ";
	}
	cout<<endl;
	cout<<"vector organizado de mayor a menor: ";
	for (i=9; i>=0; i--){
		cout<<vec[i]<<" ";
	}
	cout<<endl;
	cout<<"el vector es de tamaño: 10"<<endl;
	
system ("pause");
return 0;
}