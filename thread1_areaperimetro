#include<stdio.h>
#include<pthread.h>
float b,h,a,p;
void *area(){
    a=b*h;
    printf("L'area del quadrilatero e' %f \n",a);
}
void *perimetro(){
    p=(b+h)*2;
    printf("Il perimetro del quadrilatero e' %f \n",p);
}
main(){
    pthread_t t1,t2;
    printf("Inserire base \n");
    scanf("%f",&b);
    printf("Inserire altezza \n");
    scanf("%f",&h);
    pthread_create(&t1,NULL,&area,NULL);
    pthread_create(&t2,NULL,&perimetro,NULL);
    pthread_join(t1,NULL);
    pthread_join(t2,NULL);
    getchar();
    getchar();
}
