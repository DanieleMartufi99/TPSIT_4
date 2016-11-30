// Martufi Daniele      4INA    23/11/2016
#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
#include<stdlib.h>
main(){
    pid_t pid ;
    int x,i;
    do{
        printf("\n Immetti un numero da 1 a 4");
        scanf("%d",&x);
    }while((x<0)||(x>4));
    printf("Processo padre %d\n",getppid());
    for(i=0;i<x;i++){
        pid=fork();
        if(pid==0){
           sleep(1);
           printf("Processo figlio %d    ",getpid());
           printf("Processo padre %d\n",getppid());
        }
    }
exit(0);
}
