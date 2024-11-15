
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Scanner;

public class ANTLRParserApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o conteúdo da gramática ANTLR (ou pressione Enter para sair):");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Encerrando o programa.");
                break;
            }

            try {
                // Cria um CharStream a partir da entrada do usuário
                CharStream charStream = CharStreams.fromString(input);

                // Inicializa o lexer e o parser com o CharStream
                ANTLRLexer lexer = new ANTLRLexer(charStream);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                ANTLRParser parser = new ANTLRParser(tokens);

                // Inicia o parser a partir da regra de entrada
                ParseTree tree = parser.grammarFile();

                // Exibe a árvore sintática
                System.out.println("Árvore Sintática: " + tree.toStringTree(parser));

            } catch (Exception e) {
                System.out.println("Erro ao analisar a gramática ANTLR: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
}
