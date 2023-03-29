//AgdDnt.cpp
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<string.h>
#include<iostream.h>
#include<dos.h>
void Criar_Arq();
void Cadastrar_Agd();
void Exibir_Agd();

void Grupo() {
cout<<"\nTurma: 1 Internet E";
cout<<"\nLeandro dos Santos Bido  No 15";
cout<<"\nLa¡s de Souza Freitas  No 14";
cout<<"\nLuanda Catarina  No 37\n";
cout<<"\n";}

void Beep(){ sound(300);delay(400);nosound();delay(1200);}

FILE *Agenda;
char Id[3],Nome[41],Dia[6],Horario[6];

void main ()
{ clrscr();
Grupo();
int Op;
cout<<"\nMenu Principal\n";
cout<<"\n1_ Criar Arquivo no C:";
cout<<"\n2_Fazer Agendamento";
cout<<"\n3_Exibir Agendamentos";
cout<<"\n4_Sair\n";
cout<<"\nQual opcao deseja===>"; cin>>Op;
fflush(stdin);
switch(Op)
{
	case 1:
	Criar_Arq();
	break;

	case 2:
	Cadastrar_Agd();
	break;

	case 3:
	Exibir_Agd();
	break;

	case 4:
	cout<<"\nFavor aguardar\n";
	Beep();
	break;
	default:
	cout<<"\nOpcao invalida";
	getch();
	} }


void Criar_Arq()
{ clrscr();
cout<<"\nCriando Arquivo txt no C:";
Agenda=fopen("C:\\TURBOC3\\ArqAgd.txt","w");
cout<<"\nArquivo ArqAgd.txt criado no C:";
cout<<"\nTecle algo para sair";
getch();
fclose(Agenda);
}

void Cadastrar_Agd()
{ clrscr();
cout<<"\nCadastrando Agendamentos";
Agenda=fopen("C:\\TURBOC3\\ArqAgd.txt","a");
cout<<"\nDigite Id: ";
gets(Id);
fputs(Id,Agenda);
fputs(" ",Agenda);
cout<<"\nDigite Nome: ";
gets(Nome);
fputs(Nome,Agenda);
fputs(" ",Agenda);
cout<<"\nDigite Dia: ";
gets(Dia);
fputs(Dia,Agenda);
fputs(" ",Agenda);
cout<<"\nDigite Horario: ";
gets(Horario);
fputs(Horario,Agenda);
fputs("\n",Agenda);
cout<<"\nTecle algo para sair";
getch();
fclose(Agenda);
}

void Exibir_Agd()
{ clrscr();
int L=4;
cout<<"\nExibindo Agendamentos\n\n";
Agenda=fopen("C:\\TURBOC3\\ArqAgd.txt","r");
while(fgets(Nome,80,Agenda)!=NULL)
{ gotoxy(5,L);
L=L+1;
cout<<Id<<" "<<Nome<<" "<<Dia<<" "<<Horario; }
cout<<"\nTecle algo para sair";
getch();
fclose(Agenda);
}
