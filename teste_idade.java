class TesteIdade{
    public static void main(String[] args) {
        //imprime idade
        int idade;
        idade = 29;
        System.out.println(idade); 
        //idade do ano que vem
        int idadeanoquevem=idade+1;
        System.out.println(idadeanoquevem);
        //teste de matematica quebrada
        double pi=3.14;
        int raio=5;
        double result=2*raio*pi;
        System.out.println(result==31.4);
        //comparação de idade (menor de idade)
        boolean menordeidade=idade<18;
        System.out.println(menordeidade);
        //comparação de idade (maior de idade)
        boolean menordeidade2=idade>=18;
        System.out.println(menordeidade2);
        //char
        char letra='a';
        System.out.println(letra);
        //primitivos
        int i=5;//i:5
        int j=i;//j:5
        i =i+1;//i:6,j:5
        System.out.println(i);
        System.out.println(j);
    }
}


/* utilize essas barras com estrela para comentario de varias linhas */