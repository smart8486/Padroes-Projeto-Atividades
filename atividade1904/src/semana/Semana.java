package semana;

public class Semana {

    public Dia_semana getDia_semana(int dia_semana) {
        // Verificar o dia da semana desejado
        switch (dia_semana) {
            case 1:
                return new Domingo();
            case 2:
                return new Segunda();
            case 3:
                return new Terca();
            case 4:
                return new Quarta();
            case 5:
                return new Quinta();
            case 6:
                return new Sexta();
            case 7:
                return new Sabado();
        }
     // Dia da semana invalido
       throw new IllegalArgumentException("'" + dia_semana + 
                                       "' É um argumento ilegal para o parâmetro dia da semana!");
  }

    

    public Dia_semana getDia_semana(String dia_semana) {
        try {
            // Obter a instancia da classe desejada
            return (Dia_semana) Class.forName(dia_semana).newInstance();
            
        } catch (Exception exception) {
            // Dia da semana invalido
            throw new IllegalArgumentException("'" + dia_semana + 
                    "' É um argumento ilegal para o parâmetro dia da semana!");
        }
    }
}

