public class pessoa {
    private String nome;
    private int idade;
    private String sobrenome;

    public pessoa (String nome,String sobrenome,int idade ) {
        this.nome = nome;
        this.idade = idade;
        this.sobrenome = sobrenome;
    }
    
     public String getNome() {
        return nome;
    }
     
      public int getIdade() {
        return idade;
    }
      
       public String getSobrenome(){
           return sobrenome;
       }
     
      public void setNome(String nome) {
        this.nome = nome;
    }
      
       public void setIdade(int idade) {
        this.idade = idade;
    }
       
        public void setSobrenome(String sobrenome){
           this.sobrenome = sobrenome;
       }
}


classe: principal.java
public class principal {
 public static void main (String[] args) {
     pessoa pessoa = new pessoa("Yuri", "Guedes", 77);
     
     System.out.println("Nome: " + pessoa.getNome());
     System.out.println("Sobrenome: " + pessoa.getSobrenome());  
     System.out.println("Idade: " + pessoa.getIdade());
       
        
        pessoa.setNome("Matheus");
        pessoa.setsobrenome("Lisboa");
        pessoa.setIdade(19);
        
        
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Posição: " + pessoa.getSobrenome());
        System.out.println("Idade: " + pessoa.getIdade());
        
 }
}
