import entidades.Conta;

void main() {
    Conta conta = new Conta("Edgar", 5000);

    conta.setTitular("João Silva Santos");
    conta.saldo = 2000;

    IO.println(conta.getTitular());
    IO.println(conta.saldo);

}



