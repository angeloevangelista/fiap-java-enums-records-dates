import java.util.Date;

public class ExemploDate {
    public static void main(String[] args) {
        Date agora = new Date();

        Date diaNacionalDoLivro = new Date(1730160000000L);

        switch (agora.compareTo(diaNacionalDoLivro)){
            case -1:
                System.out.println("O dia nacional do Livro vem aí");
                break;
            case 0:
                System.out.println("O dia nacional do Livro é agora");
                break;
            case 1:
                System.out.println("O dia nacional do Livro já passou");
                break;
        }

        if (agora.after(diaNacionalDoLivro)) {
            System.out.println("O dia nacional do Livro já passou");
        } else {
            System.out.println("O dia nacional do Livro vem aí");
        }

        System.out.println(agora);
        System.out.println(diaNacionalDoLivro);
    }
}
