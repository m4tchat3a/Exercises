//Tarefa_1.java
import javax.swing.JOptionPane;
class Tarefa_1 extends Thread
{
public Tarefa_1(String nome)
{
super(nome);
}
public void run()
{
String resp="Tem fluxo do programa 1: ";
try
{ Thread.sleep(1000);
}
catch(InterruptedException e)
{}
String A = getName();
resp += "\nNome da Thread = " +A+"";;
int b=getPriority();
resp += "\nUma Thread de prioridade = "+b+"\n";
for(int i =0; i<=10;i++)
{
resp += " - " +i;
}
JOptionPane.showMessageDialog(null,resp,"Resposta",-1);
} }
