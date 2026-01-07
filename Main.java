import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Avaliacao5S> avaliacoes = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== CONTROLE DE AUDITORIA 5S ===");
            System.out.println("1 - Nova avaliação");
            System.out.println("2 - Listar avaliações");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Setor avaliado: ");
                String setor = scanner.nextLine();

                System.out.print("Nota Seiri: ");
                double seiri = scanner.nextDouble();

                System.out.print("Nota Seiton: ");
                double seiton = scanner.nextDouble();

                System.out.print("Nota Seiso: ");
                double seiso = scanner.nextDouble();

                System.out.print("Nota Seiketsu: ");
                double seiketsu = scanner.nextDouble();

                System.out.print("Nota Shitsuke: ");
                double shitsuke = scanner.nextDouble();

                Avaliacao5S avaliacao = new Avaliacao5S(
                        setor, seiri, seiton, seiso, seiketsu, shitsuke
                );

                avaliacoes.add(avaliacao);
                System.out.println("Avaliação registrada com sucesso!");
            }

            if (opcao == 2) {
                for (Avaliacao5S a : avaliacoes) {
                    System.out.println("\nSetor: " + a.setor);
                    System.out.println("Média 5S: " + a.calcularMedia());
                }
            }

        } while (opcao != 0);

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
