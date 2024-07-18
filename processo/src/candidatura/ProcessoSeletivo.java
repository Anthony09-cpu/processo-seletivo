package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = { "Diego", "Caio", "Ana", "Gustavo", "Anthony" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativaRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuaTentando = !atendeu;

            if (continuaTentando) {
                tentativaRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!!");
            }
        } while (continuaTentando && tentativaRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos o contato com " + candidato + " na " + tentativaRealizadas + " tentativa");
        } else {
            System.out.println("Não conseguimos conatto com " + candidato + ", número maximas de tentativas "
                    + tentativaRealizadas + " realizadas");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "Diego", "Caio", "Ana", "Gustavo", "Anthony" };

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("o candidato de n° " + (i + 1) + " é o " + candidatos[i]);
        }

        System.out.println("Forma abreviada de interação for each");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi : " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Anthony", "Diego", "Clara", "Gustavo", "Ana", "Luisa", "Sarah", "Caio", "Maria",
                "Iasmin" };
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPreterido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPreterido);
            if (salarioBase >= salarioPreterido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
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
