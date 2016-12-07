// Alunno: Martufi Daniele    Classe: 4INA    Data: 7/12/2016
#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
int main(){
    int i,p;
    for(i=0;i<2;i++){
        printf("i=%d\n",i);
        p=fork();
        if(p>0)fork();
    }
}
