#include<iostream.h>
#include<conio.h>
#include<dos.h>

void main() {
  clrscr();
  int n;
  cout<<"\nTabuada";
  cout<<"\n Insira um número inteiro : ";
  cin>>n;
  
  for (int i = 1; i <= 10; i++) {
    cout << n << " * " << i << " = " << n * i << end;
    delay(100);
  }
  
  sound(500);delay(500);
  nosound();
  cout<<"\n Pressione qualquer tecla pra sair";
  getch();
}
