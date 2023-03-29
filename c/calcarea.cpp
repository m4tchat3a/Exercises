//caclarea.cpp
#include<iostream.h>
#include<conio.h>
#include<areas.h>
#include<ctype.h>
#inclde<dos.h>

void Beep() {
  sound(300);delay(300);nosound();delay(300);
}
void Nome() {
  cout<<"Nome: Luanda Catarina No: 37";
}

void main() {
  clrscr();
  int op;
  float x, y, r;
  cout<<"\n Calculadora de Areas:";
  cout<<"\n 1 - Area do Circulo:";
  cout<<"\n 2 - Area do Quadrado:";
  cout<<"\n 3 - Area do Retangulo:";
  cout<<"\n 4 - Area do Triangulo:";
  cout<<"\n Digite a opcao: ";
  cin>>op;
  Beep();
  
  switch(op) {
    case 1:
      cout<<"Digite raio do circulo: ";
      cin>>r;
      cout<<"Area do circulo = "<<ACirculo;
      break;
    case 2:
      cout<<"Digite raio do quadrado: ";
      cin>>r;
      cout<<"Area do quadrado = "<<AQuadrado;
      break;
    case 3:
      cout<<"Digite raio do retangulo: ";
      cin>>r;
      cout<<"Area do retangulo = "<<ARetangulo;
      break;
    case 4:
      cout<<"Digite raio do triangulo: ";
      cin>>r;
      cout<<"Area do triangulo = "<<ATriangulo;
      break;
    default:
      cout<<"Opcao invalida";
  }
  Beep();
  cout<<"\n\nTecle algo para sair...\n\n";
  Nome();
  Beep();
  getch();
