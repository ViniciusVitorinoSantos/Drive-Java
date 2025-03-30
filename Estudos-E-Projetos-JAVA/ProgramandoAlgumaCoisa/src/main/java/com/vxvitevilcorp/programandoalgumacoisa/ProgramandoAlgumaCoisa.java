/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vxvitevilcorp.programandoalgumacoisa;
import java.util.Scanner;
/**
 *
 * @author vxvit
 */
public class ProgramandoAlgumaCoisa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(" Olá mundo! jovem programador qual seu nome: ");
        String nomeJovemProgramador = entrada.next();
        System.out.print(" Muito prazer " + nomeJovemProgramador);
        System.out.print(" Qual o ano do seu nascimento neste formato ex(1990): ");
        int anoNascimento = entrada.nextInt();
        int idade = (2024 - anoNascimento);
        System.out.print(" Que legal " + nomeJovemProgramador + " então você tem " + idade + " anos");
        if(idade <= 18){
        System.out.println(" É realmente você é um jovem programador " + nomeJovemProgramador);
        }
        else if(idade > 18 && idade < 50){
            System.out.println(" Pois é não é tão jovem assim " + nomeJovemProgramador);
        }
        else{
            System.out.println(" Você ja é um vovô programador ");
        }
    }
}
