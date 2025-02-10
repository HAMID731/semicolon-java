package television;

public class TelevisionTest {
}
@startuml
class Problem {
    - name : String
    - type : String
    - status : boolean
    + Problem(name : String, type : String)
}

class Person {
    - name : String
    - problems : List<Problem>
    + addProblem(problem : Problem)
    + solveProblem(problem : Problem)
    + getUnsolvedProblems() : List<Problem>
}

Person "1" -- "*" Problem : has

@enduml
