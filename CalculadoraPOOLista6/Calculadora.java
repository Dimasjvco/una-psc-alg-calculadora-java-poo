class Calculadora {
    public void realizarOperacao(String operation, double numeroUm, double numeroDois) {
        switch (operation.toLowerCase()) {
            case "\n soma":
                imprimirResultado(numeroUm + numeroDois, "\n O resultado dessa adição é %.2f");
                break;
            case "\n subtração":
                imprimirResultado(numeroUm - numeroDois, "\n O resultado dessa subtração é %.2f");
                break;
            case "\n multiplicação":
                imprimirResultado(numeroUm * numeroDois, "\n O resultado dessa multiplicação é %.2f");
                break;
            case "\n divisão":
                if (numeroDois != 0) {
                    imprimirResultado(numeroUm / numeroDois, "\n O resultado dessa divisão é %.2f");
                } else {
                    System.out.println("\n Impossível realizar uma divisão por zero.");
                }
                break;
            case "\n potenciação":
                imprimirResultado(Math.pow(numeroUm, numeroDois), "\n O resultado dessa potência é %.2f");
                break;
            case "\n raiz":
                if (numeroUm >= 0) {
                    imprimirResultado(Math.sqrt(numeroUm), "\n A raiz do primeiro número é %.2f");
                } else {
                    System.out.println("\n Não existe raiz de número negativo.");
                }
                break;
            default:
                System.out.println("\n Operação inválida, digite uma das opções da tabela.");
                break;
        }
    }

    private void imprimirResultado(double resultado, String mensagem) {
        System.out.printf(mensagem, resultado);
    }
}