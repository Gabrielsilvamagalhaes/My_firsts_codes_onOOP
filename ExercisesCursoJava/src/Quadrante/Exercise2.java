package Quadrante;
public class Exercise2 {
    private double x, y;
    private String Quadrante;
    
    public void setPoints(double x, double y){
        this.x = x;
        this.y = y;
        if(this.x > 0 && this.y>0){
            Quadrante = "Q1";
        }else if(this.x>0 && this.y<0){
            Quadrante = "Q4";
        }else if(this.x<0 && this.y<0){
            Quadrante = "Q3";
        }else if(this.x <0 && this.y>0){
            Quadrante = "Q2";
        }else if(this.x ==0 && this.y ==0){
            Quadrante = "Origem";
        }
        else if(this.x == 0 && this.y>0 ||this.y<0){
            Quadrante = "Eixo Y";
        }
        else if(this.x >0 ||this.x<0 && this.y ==0){
            Quadrante = "Eixo x";
        }
    }
    public String getPoints(){
        return Quadrante;
    }
    
}
