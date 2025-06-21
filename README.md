# Calcula a Duração de um Jogo em Horas em Java

Este programa Java solicita ao usuário que digite a hora inicial e a hora final de um jogo (em formato de 24 horas) e, em seguida, calcula e exibe a duração total do jogo em horas.

## Como Executar

1.  **Salve o código:** Salve o código Java fornecido como `Main.java` dentro de um diretório chamado `principal`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório que contém a pasta `principal` e compile o código utilizando o compilador Java:
    ```bash
    javac principal/Main.java
    ```
    Este comando irá gerar um arquivo chamado `Main.class` dentro da pasta `principal`.
3.  **Execute o programa:** Ainda no terminal ou prompt de comando, execute o programa utilizando a Máquina Virtual Java:
    ```bash
    java principal.Main
    ```
    Duas caixas de diálogo pop-up aparecerão, uma após a outra, solicitando que você digite a hora inicial e a hora final do jogo, respectivamente, e pressione "OK" em cada uma. Após a entrada, outra caixa de diálogo exibirá a duração do jogo.

## Explicação do Código

O programa realiza as seguintes ações:

1.  **Importa a classe JOptionPane:** A linha `import javax.swing.*;` permite que o programa utilize a classe `JOptionPane` para interagir com o usuário através de caixas de diálogo.
2.  **Lê as horas inicial e final do jogo:**
    * `int HI = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a hora inicial: "));` exibe uma caixa de diálogo solicitando que o usuário digite a hora inicial do jogo (em formato inteiro de 0 a 23). O valor digitado é convertido para um inteiro e armazenado na variável `HI`.
    * `int HF = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a hora final: "));` exibe uma segunda caixa de diálogo solicitando que o usuário digite a hora final do jogo (em formato inteiro de 0 a 23). O valor digitado é convertido para um inteiro e armazenado na variável `HF`.
3.  **Calcula a duração do jogo:**
    * `if(HI < HF){ duracao = HF - HI; } else { duracao = 24 - HI + HF; }` é uma estrutura condicional que calcula a duração do jogo de duas maneiras:
        * **Se a hora inicial (`HI`) for menor que a hora final (`HF`):** A duração é simplesmente a diferença entre a hora final e a hora inicial (`HF - HI`). Isso cobre casos onde o jogo termina no mesmo dia.
        * **Se a hora inicial (`HI`) for maior ou igual à hora final (`HF`):** Isso indica que o jogo começou em um dia e terminou no dia seguinte (passando pela meia-noite). A duração é calculada como 24 (total de horas em um dia) menos a hora inicial, mais a hora final (`24 - HI + HF`).
4.  **Exibe a duração do jogo:**
    * `JOptionPane.showMessageDialog(null,"O jogo durou " + duracao + " horas");` exibe uma caixa de diálogo com a mensagem informando a duração total do jogo em horas.

Este programa demonstra um exemplo de como obter entrada do usuário, utilizar uma estrutura condicional para lidar com diferentes cenários (jogo terminando no mesmo dia ou no dia seguinte) e exibir um resultado calculado através de caixas de diálogo Swing em Java.
