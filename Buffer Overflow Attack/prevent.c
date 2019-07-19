#include <stdio.h>
#include <string.h>
#include<stdlib.h>

int main(void)
{
    
    char buff[15];
    int pass = 0;
    printf("\n Enter the password : \n");
    gets(buff);
    printf("Buf: %p\n",&buff);
    printf("pass: %p\n",&pass);
    
    if(strlen(buff) > 5) { printf("Buffer Overflow"); goto A; }
    if(strcmp(buff, "keeru"))
    {
        printf ("\n Wrong Password \n");
    }
    else
    {
        printf ("\n Correct Password \n");
        pass = 1;
    }
    if(pass)
    {
       /* Now Give root or admin rights to user*/
        printf ("\n Root privileges given to the user \n");
    }
    A:
    getch();
    return 0;
}
