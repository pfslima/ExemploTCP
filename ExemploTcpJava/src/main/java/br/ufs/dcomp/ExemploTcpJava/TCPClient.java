/**
 * @author Tarcisio da Rocha (Prof. DCOMP/UFS)
 */
package br.ufs.dcomp.ExemploTcpJava;

import java.net.*;
import java.io.*;
public class TCPClient{
    
    
    public static void main(String[] args){
     try {
            System.out.print("[ Conectando com o Servidor TCP    ..................  ");
            Socket sock = new Socket("127.0.0.1", 3300);
            System.out.println("[OK] ]");   
            InputStream is = sock.getInputStream(); // Canal de entrada de dados
            OutputStream os = sock.getOutputStream(); // Canal de saída de dados
            
            Scanner sc = new Scanner(System.in);
            String msg = "";
            
            while (true) {
                System.out.println("Digite sua mensagem:");
                msg = sc.nextLine();
                
                System.out.print("[ Enviando mensagem    ..............................  ");
                os.write(buf);
                System.out.println("[OK] ]");
                    
                if (msg.intern() != "exit") {
                    byte[] bufferRecepcao = new byte[50]; // buffer de recepção
                    System.out.println("[ Aguardando recebimento de mensagem   ..............  ");
                    is.read(bufferRecepcao); // Operação bloqueante (aguardando chegada de dados)
                    System.out.println("[OK] ]");
                    String msgRecebida = new String(bufferRecepcao);
                    msgRecebida = msgRecebida.trim()
                    if (msg_recebida.intern() != "exit") {
                        System.out.println("  Mensagem recebida: "+ msgRecebida);    
                    } else {
                        System.out.println("[ FIM ]");
                        System.exit(1);
                    }
                } else {
                    System.out.println("[ FIM ]");
                    System.exit(1);
                }
            }
            
        }catch(Exception e){System.out.println(e);}    
            System.out.println("[ FIM ]");

    }
}