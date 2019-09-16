import java.util.*;
public class Program
{
    public static void main(String[] args)
    {
        Scanner dado = new Scanner(System.in);

        String t = dado.nextLine();
        String[] separado = t.split(" ");
        for(int i = 0 ; i < separado.length;i++)
        {
            System.out.println(separado[i]);
        }
        System.out.println("Encriptador de fluxo:");
        while(true)
        {
            List list = new List();
            System.out.println("Digite 1 para encriptação ou 2 para decriptação:");
            int i = dado.nextInt();
            String texto;
            int cesar;
            switch (i) //Analisa a escolha do func
            {
                case 1: //encriptação
                    System.out.println("Digite o texto para ser encriptado:");
                    texto = dado.next();
                    dado.nextLine();
                    System.out.println("Digite o valor de césar:");
                    cesar = dado.nextInt();
                    for(int z = 0 ;z < texto.length();z++)
                    {
                        list.Add(texto.substring(z,z+1));
                    }

                    list.Encriptografa(texto,cesar);
                    break;
                case 2: //descriptação
                    System.out.println("Digite o texto para ser descriptografado:");
                    texto = dado.next();
                    System.out.println("Digite o valor de césar:");
                    cesar = dado.nextInt();
                    for(int z = 0 ;z < texto.length();z++)
                    {
                        list.Add(texto.substring(z,z+1));
                    }
                    list.Descriptografa(texto,cesar);
                    break;
            }
            System.out.println("DIGITE 'SIM' SE DESEJA PARAR O PROGRAMA ou 'NÃO' SE DESEJA CONTINUAR:");
            String escolha = dado.next();
            if(escolha.equals("SIM"))
            {
                break;
            }
        }
    }
}
