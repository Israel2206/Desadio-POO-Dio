import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso c1 = new Curso();
        c1.setTitulo("Curso java");
        c1.setDescricao("Descrição curso java");
        c1.setCargaHoraria(7);

        
        Curso c2 = new Curso();
        c2.setTitulo("Curso js");
        c2.setDescricao("Descrição curso js");
        c2.setCargaHoraria(3);


        Mentoria m1 = new Mentoria();

        m1.setTitulo("Mentoria java");
        m1.setDescricao("descrição de mentoria java");
        m1.setData(LocalDate.now());


        /*System.out.println(c1);
        System.out.println(c2);

        System.out.println(m1); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(c1);
        bootcamp.getConteudos().add(c2);
        bootcamp.getConteudos().add(m1);

        Dev devBreno = new Dev();
        devBreno.setNome("Breno");

        devBreno.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos: " + devBreno.
        getConteudosInscritos());
        System.out.println("-");
        devBreno.progredir();
        System.out.println("Conteúdos inscritos: " + devBreno.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: " + devBreno.getConteudosConcluidos());
        System.out.println("--------");
        System.out.println("XP: "+ devBreno.calcularTotalXp());

        System.out.println("======================");

        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");

        devVitor.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos: " + devVitor.getConteudosInscritos());
                System.out.println("Conteúdos Concluidos: " + devVitor.getConteudosConcluidos());


        
    }
}
