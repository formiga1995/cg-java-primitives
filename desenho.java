
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class desenho extends JPanel{
    private int x1=10,y1=10,x2=50,y2=10,x3=x1,y3=50,x4=50,y4=50;//quadrado inicial
    private int escolha,tx,ty,ang,dist;
    private double fe, angulo;
    public desenho(int e, int tx1,int ty1,int ang1, double fe1,int distorcao){
        escolha = e;
        tx = tx1;
        ty = ty1;
        ang = ang1;
        fe = fe1;
        dist = distorcao;
        
    }
    @Override
    public void paintComponent(Graphics desenho){
        super.paintComponent(desenho);
        //Graphics2D g = (Graphics2D) desenho.create();
        //desenho.drawRect(ox,oy,ow,oh);//Imagem original
        //Graphics2D g2 = (Graphics2D) desenho;
        desenho.setColor(Color.red);
        desenho.drawLine(x1,y1,x2,y2);//reta1  (x1,y1,x2,y2);
        desenho.setColor(Color.BLUE);
        desenho.drawLine(x3,y3,x4,y4);//reta2  (x3,y3,x4,y4);   
        desenho.setColor(Color.green);
        desenho.drawLine(x1,y1,x1,y4);//reta3  (x1,y1,x1,y4);
        desenho.setColor(Color.yellow);
        desenho.drawLine(x4,y1,x4,y4);//reta4  (x4,y1,x4,y4);  
        // desenho original
        switch(escolha){
            case 1: //translacao
                desenho.setColor(Color.red);
                desenho.drawLine(x1+tx,y1+ty,x2+tx,y2+ty);//reta1  (x1,y1,x2,y2);
                desenho.setColor(Color.BLUE);
                desenho.drawLine(x3+tx,y3+ty,x4+tx,y4+ty);//reta2  (x3,y3,x4,y4);   
                desenho.setColor(Color.green);
                desenho.drawLine(x1+tx,y1+ty,x1+tx,y4+ty);//reta3  (x1,y1,x1,y4);
                desenho.setColor(Color.yellow);
                desenho.drawLine(x4+tx,y1+ty,x4+tx,y4+ty);//reta4  (x4,y1,x4,y4); 
                break;
            case 2://escala
                desenho.setColor(Color.red);
                int ex1 = (int)((int)x1 *fe);
                int ex2 = (int)((int)x2 *fe);
                int ex3 = (int)((int)x3 *fe);
                int ex4 = (int)((int)x4 *fe);
                int ey1 = (int)((int)y1 *fe);
                int ey2 = (int)((int)y2 *fe);
                int ey3 = (int)((int)y3 *fe);
                int ey4 = (int)((int)y4 *fe);
                desenho.drawLine(ex1,ey1,ex2,ey2);//reta1  (x1,y1,x2,y2);
                desenho.setColor(Color.BLUE);
                desenho.drawLine(ex3,ey3,ex4,ey4);//reta2  (x3,y3,x4,y4);   
                desenho.setColor(Color.green);
                desenho.drawLine(ex1,ey1,ex1,ey4);//reta3  (x1,y1,x1,y4);
                desenho.setColor(Color.yellow);
                desenho.drawLine(ex4,ey1,ex4,ey4);//reta4  (x4,y1,x4,y4); 
                break;
            case 3://rotacao
                angulo = Math.toRadians(ang);
                desenho.setColor(Color.red);
                ex1 = (int)((int)x1 * Math.cos(angulo)-Math.sin(angulo));
                ex2 = (int)((int)x2 * Math.cos(angulo)-Math.sin(angulo));
                ex3 = (int)((int)x3 * Math.cos(angulo)-Math.sin(angulo));
                ex4 = (int)((int)x4 * Math.cos(angulo)-Math.sin(angulo));
                ey1 = (int)((int)y1 * Math.cos(angulo)+Math.sin(angulo));
                ey2 = (int)((int)y2 * Math.cos(angulo)+Math.sin(angulo));
                ey3 = (int)((int)y3 * Math.cos(angulo)+Math.sin(angulo));
                ey4 = (int)((int)y4 * Math.cos(angulo)+Math.sin(angulo));
                desenho.drawLine(ex1,ey1,ex2,ey2);//reta1  (x1,y1,x2,y2);
                desenho.setColor(Color.BLUE);
                desenho.drawLine(ex3,ey3,ex4,ey4);//reta2  (x3,y3,x4,y4);   
                desenho.setColor(Color.green);
                desenho.drawLine(ex1,ey1,ex1,ey4);//reta3  (x1,y1,x1,y4);
                desenho.setColor(Color.yellow);
                desenho.drawLine(ex4,ey1,ex4,ey4);//reta4  (x4,y1,x4,y4); 
                break;
            case 4://cisalhamento
                desenho.setColor(Color.red);
                desenho.drawLine(x1+dist,y1+dist,x2+dist,y2+dist);//reta1  (x1,y1,x2,y2);
                desenho.setColor(Color.BLUE);
                desenho.drawLine(x3,y3,x4,y4);//reta2  (x3,y3,x4,y4);   
                desenho.setColor(Color.green);
                desenho.drawLine(x1+dist,y1+dist,x1,y4);//reta3  (x1,y1,x1,y4);
                desenho.setColor(Color.yellow);
                desenho.drawLine(x4+dist,y1+dist,x4,y4);//reta4  (x4,y1,x4,y4); 
                break;
            case 5: //reflexao
                desenho.setColor(Color.BLUE);
                desenho.drawLine(x1,y1+50,x2,y2+50);//reta2  (x1,y1,x2,y2);
                desenho.setColor(Color.red);
                desenho.drawLine(x3,y3+50,x4,y4+50);//reta1  (x3,y3,x4,y4);   
                desenho.setColor(Color.green);
                desenho.drawLine(x1,y1+50,x1,y4+50);//reta3  (x1,y1,x1,y4);
                desenho.setColor(Color.yellow);
                desenho.drawLine(x4,y1+50,x4,y4+50);//reta4  (x4,y1,x4,y4); 
                break;
                
        }
        
    }
}
