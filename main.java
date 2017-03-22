import java.util.Scanner;
import javax.swing.JFrame;
public class main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int escolha; 
        int tx=0,ty=0,ang=0;
        double fe=0;
        int dist=0;
        System.out.println("Digite o numero da transformacao que deseja executar:\n"
                + ">(0)Desenho original\n"
                + ">(1)Translacao\n"
                + ">(2)Escala\n"
                + ">(3)Rotacao\n"
                + ">(4)Cisalhamento(Shearing)\n"
                + ">(5)Reflexao no eixo x\n");
        escolha = leia.nextInt();
        if(escolha == 1){
            System.out.println("Digite o x e o y");
            tx = leia.nextInt();
            ty = leia.nextInt();
            
        }
        if(escolha == 2){
            System.out.println("Digite o fator de escala");
            fe = leia.nextFloat();
                    }
        if(escolha == 3){
            System.out.println("Digite o angulo:");
            ang = leia.nextInt();
                    }
        if(escolha == 4){
            System.out.println("Digite o valor da distorcao ");
            dist = leia.nextInt();
        }
        desenho desenho1 = new desenho(escolha,tx,ty,ang,fe,dist);
        JFrame janela = new JFrame ("Transformacoes");
        janela.add(desenho1);
        janela.setSize(800,600);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
