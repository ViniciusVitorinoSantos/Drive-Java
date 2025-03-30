/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author vxvit
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // OLÁ MUNDO INFORMATION PANE
        //JOptionPane.showMessageDialog(null, "Olá, mundo!");
        //=================================================================================
        //Entrada de usuário
        //String nome = JOptionPane.showInputDialog("Digite seu nome:");
        //System.out.println("Nome digitado: " + nome);
        //=================================================================================
        //Caixa de diálogo com opções personalizadas
        //Além do YES_NO_OPTION, você pode criar botões personalizados:
        //CAIXA DE CONFIRMAÇÃO
        //int resposta = JOptionPane.showConfirmDialog(null, "Você deseja continuar?");
        //if (resposta == JOptionPane.YES_OPTION) {
        //System.out.println("Usuário escolheu SIM");
        //=================================================================================
        //Entrada com caixa de seleção (combo box)
        //Quer oferecer opções para o usuário escolher em um menu suspenso? Dá pra fazer assim:
        /*Object[] opcoes = {"Azul", "Vermelho", "Verde"};
        int escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha uma cor:",
                "Cores",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        System.out.println("Você escolheu: " + opcoes[escolha]);
         */
        //=================================================================================
        //Entrada com caixa de seleção (combo box)
        //Quer oferecer opções para o usuário escolher em um menu suspenso? Dá pra fazer assim:
        /*String[] opcoes = {"Java", "Python", "C++", "JavaScript"};
        String escolha = (String) JOptionPane.showInputDialog(
                null,
                "Qual sua linguagem favorita?",
                "Escolha uma opção",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        System.out.println("Você escolheu: " + escolha);
         */
        //=================================================================================
        //Exibir mensagens com diferentes ícones
        //O JOptionPane permite mudar os ícones para indicar o tipo de mensagem:
        //JOptionPane.showMessageDialog(null, "Isso é uma mensagem de informação!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Isso é um aviso!", "Aviso", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Isso é um erro!", "Erro", JOptionPane.ERROR_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Isso é uma pergunta!", "Pergunta", JOptionPane.QUESTION_MESSAGE);
        //=================================================================================
        //Caixa de diálogo para senha
        //Se precisar que o usuário digite uma senha sem que os caracteres apareçam, use um JPasswordField:
        /*JPasswordField passwordField = new JPasswordField();
        int resposta = JOptionPane.showConfirmDialog(null, passwordField, "Digite sua senha:", JOptionPane.OK_CANCEL_OPTION);

        if (resposta == JOptionPane.OK_OPTION) {
            String senha = new String(passwordField.getPassword());
            System.out.println("Senha digitada: " + senha);
        }
         */
        //=================================================================================
        //ImageIcon icone = new ImageIcon("caminho/para/sua/imagem.png");
        //JOptionPane.showMessageDialog(null, "Mensagem com ícone personalizado!", "Título", JOptionPane.INFORMATION_MESSAGE, icone);
    }

}
