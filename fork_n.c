//Nucci Maria 4inB 01.12.2016
/*TESTO: Dato  un numero compreso tra 1 e 4 generare tanti processi figli. Per ogni processo stampare id del padre e id del figlio*/

#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>

main(){
    int n;
    int i;
    pid_t pid;
    printf("\n>>INSERIRE NUMERO DI FORK DA GENERARE TRA 1 E 4: ");
    scanf("%d", &n); //inserimento numero processi
    if((n<=0)||(n>4)){ //controllo se il numeo dei processi inserito è tra 1 e 4
        printf("\n ERRORE : reinserire numero tra 1 e 4: ");
        scanf("%d", &n);
    }
    for(i=0; i<n; i++){
       pid=fork();
       if (pid==0){
            sleep(1);
            printf("Sono il figlio (PID = %d) e mio padre ha PID = %d\n", getpid(), getppid());
       }
    }
}
