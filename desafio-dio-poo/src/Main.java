import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso c1 = new Curso();
        c1.setTitulo("Curso java");
        c1.setDescrisao("Descrição curso java");
        c1.setCargaHoraria(7);

        
        Curso c2 = new Curso();
        c2.setTitulo("Curso js");
        c2.setDescrisao("Descrição curso js");
        c2.setCargaHoraria(3);

        Mentoria m1 = new Mentoria();

        m1.setTitulo("Mentoria java");
        m1.setDescrisao("descrição de mentoria java");
        m1.setData(LocalDate.now());


        System.out.println(c1);
        System.out.println(c2);

        System.out.println(m1);
    }
}
