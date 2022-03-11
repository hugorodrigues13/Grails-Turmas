package turmas

class Turma {
    
    Integer codigo
    String disciplina
    String horario
    Integer qtdMaximaAlunos
    Integer alunosMatriculados
   
    //uma turma tem 1 professor
    
    //relacionamentos 1 pra muitos
      static hasMany = [aluno: Aluno]
      static belongsTo = [Aluno]

    static constraints = {
       
    }

    static mapping = {
        aluno joinTable:[name: "turma_aluno", key: "id_turma", column: "id_aluno"]
    }
}
