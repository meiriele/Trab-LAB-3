
package trabalholab3;

//007
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.JFrame;


public class CursoSaberMais {

   
    public static void main(String[] args) {
       
          
       JanelaPrincipal principal = new JanelaPrincipal();
         
       principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       principal.setSize(800, 600);
       principal.setLocationRelativeTo(null);
       principal.setVisible(true);
        
    ArrayList<Professor> professores =new ArrayList<>();
      professores.add(new Professor("Aline de Paula Sotte","alinedpaso@gamail.com","984431121"));
      professores.add(new Professor("Jose Ricardo Santos","josericardo@gamail.com","999176031"));
      professores.add(new Professor("Carlos Alberto da Cruz","carloscruz@hotmail.com","984971122"));
      professores.add(new Professor("Fernanda Dutra","ruivinha@uol.com.br","32217247"));       

      ArrayList<Aluno> alunos =new ArrayList<>();
       
      alunos.add(new Aluno("Caio Silva","caiao@gamail.com","Rita Silva","984417575"));
      alunos.add(new Aluno("Luciana Miranda","lumiranda@gamail.com","Idê de Paula","999888887"));
      alunos.add(new Aluno("Isabela Luz","isaluz@hotmail.com","Thiago Luz","32247675"));
      alunos.add(new Aluno("Bento Gonçalves","betao@uol.com.br","Alberto Gonçalves","32214287"));
      
      ArrayList<Turma> turma =new ArrayList<>();
       
      turma.add(new Turma("geometriaespacial","Matemática",5,20,professores.get(0),"10/05/2016","12/05/2016"));
      turma.add(new Turma("Revolução Industrial","História",5,10,professores.get(1),"11/10/2016","15/10/2016"));
      turma.add(new Turma("Relevo Brsileiro","Geografia",5,16,professores.get(2),"28/07/2016","30/07/2016"));
      turma.add(new Turma("Sintaxe na Redação","Português",5,2,professores.get(3),"10/06/2016","14/06/2016"));
       
      principal.setProfessor(professores);    
      principal.setAluno(alunos);
      principal.setTurma(turma);         
        
}

}
            


    
    

