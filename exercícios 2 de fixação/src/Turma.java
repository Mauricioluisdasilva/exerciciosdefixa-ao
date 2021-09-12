public class Turma{
    String turma, nomeA1, nomeA2, nomeA3;
    double n1, n2, n3;
   
   
    public void setTurma(String turma){
        this.turma = turma;
    }
    public String getTurma(){
        return turma;
    }
    
        public void setNomeA1(String nomeA1){
        this.nomeA1 = nomeA1;
        }
        public String getNomeA1(){
        return nomeA1;
        }

        public void setNomeA2(String nomeA2){
        this.nomeA2 = nomeA2;
        }
        public String getNomeA2(){
        return nomeA2;
        }

        public void setNomeA3(String nomeA3){
        this.nomeA3 = nomeA3;
        }
        public String getNomeA3(){
        return nomeA3;
        }


        public void setN1(double n1){
        this.n1 = n1;
        }
        public double getN1(){
        return n1;
        }

        public void setN2(double n2){
        this.n2 = n2;
        }
        public double getN2(){
        return n2;
        }

        public void setN3(double n3){
        this.n3 = n3;
        }
        public double getN3(){
        return n3;
        }

    

        public String maiorNota(){
        String resultado1, resultado2, resultado3;

        double media;
        media = (n1 + n2 + n3)/3;
        
        if(this.n1 >= media){
            resultado1 = this.nomeA1 + " está acima da média. Nota = " + this.n1;
        } else{
            resultado1 = this.nomeA1 + " está abaixo da média. Nota = " + this.n1;
        }
        
        if (this.n2 >= media){
            resultado2 = this.nomeA2 + " está acima da média. Nota = " + this.n2;
        } else{
            resultado2 = this.nomeA2 + " está abaixo da média. Nota = " + this.n2;
        }
        
        if (this.n3 >= media){
            resultado3 = this.nomeA3 + " está acima da média. Nota = " + this.n3;
        }else {
            resultado3 = this.nomeA3 + " está abaixo da média. Nota = " + this.n3;
        }
    
        
        return "A média da turma é " + media  + "\n" + resultado1 + "\n" + resultado2 + "\n" + resultado3 ;
        

    }

        public String toString(){
        return "Notas da turma " + this.turma + "\n" +
                this.nomeA1 + " = " + n1 + "\n" + 
                this.nomeA2 + " = " + n2 + "\n" + 
                this.nomeA3 + " = " + n3 ;
                
        
    }

}
