package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        //analisarCandidato(1900.0);
        //analisarCandidato(2200.0);
        //analisarCandidato(2000.0);
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Anthony","Diego","Clara","Gustavo","Ana","Luisa","Sarah","Caio","Maria","Iasmin"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5){
            String candidato = candidatos[candidatosAtual];
            double salarioPreterido = valorPretendido();

            System.out.println("O candidato " + candidato + "solicitou este valor de salario " + salarioPreterido);
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(Double salarioPreterido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPreterido) {
            System.out.println("Ligar para candidato!");
        } else if (salarioBase == salarioPreterido) {
            System.out.println("Ligar para o candidato para oferecer uma contra proposta!");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos!");
        }
    }
}
