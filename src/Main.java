import org.alexvsi.challenge.poo.domain.Bootcamp;
import org.alexvsi.challenge.poo.domain.Course;
import org.alexvsi.challenge.poo.domain.Dev;
import org.alexvsi.challenge.poo.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        //Course javaCourse = new Course();
        //Course gameDevCourse = new Course();

        String title;
        String description;
        int load;
        LocalDate date;

        title = "Programming Logic";
        description = "by Digital Innovation One";
        load = 8;

        // Não instanciar um objeto sem valor
        Course programmingLogic = new Course(title, description, load);

        //javaCourse.setTitle("Java Bootcamp");
        //javaCourse.setDescription("Java Bootcamp by Digital Innovation One");
        //javaCourse.setCourseLoad(70);

        title = "Spring Boot Framework";
        description = "by Digital Innovation One";
        load = 12;

        Course springBoot = new Course(title, description, load);

        //gameDevCourse.setTitle("AI-powered Game Development");
        //gameDevCourse.setDescription("Game Development by SoulCode Academy");
        //gameDevCourse.setCourseLoad(240);

        //System.out.println(ProgrammingLogic);
        //System.out.println(SpringBoot);

        title = "Boas Práticas de Desenvolvimento em Java no mundo Real";
        description = "Mentoria DIO com Lorem Ipsum";
        date = LocalDate.parse("2026-03-31");

        Mentoring mentoria1 = new Mentoring(title, description, date);

        title = "Disciplina de QA e Testes em Java (JUnit + Estratégia)";
        description = "Mentoria DIO com Lorem & Ipsum";
        date = LocalDate.parse("2026-04-16");

        Mentoring mentoria2 = new Mentoring(title, description, date);

        //System.out.println(mentoria1);
        //System.out.println(mentoria2);

        title = "Java Bootcamp";
        description = "Java Bootcamp by Digital Innovation One";
        Bootcamp JavaBootcamp = new Bootcamp(title, description);
        JavaBootcamp.getContents().add(programmingLogic);
        JavaBootcamp.getContents().add(springBoot);
        JavaBootcamp.getContents().add(mentoria1);
        JavaBootcamp.getContents().add(mentoria2);

        Dev devDravls = new Dev("Vinicius");
        devDravls.subscribeBootcamp(JavaBootcamp);
        devDravls.progress();
        System.out.println("\nDravls dev => " +  devDravls.getName());
        System.out.println("Conteúdos inscritos: " + devDravls.getSubscribedContent());
        System.out.println("Conteúdos concluidos: " + devDravls.getCompletedContent());
        System.out.println("XP: " + devDravls.calculateXP());

        Dev devGroner = new Dev("LGroner");
        devGroner.subscribeBootcamp(JavaBootcamp);
        devGroner.progress();
        devGroner.progress();
        System.out.println("\nGroner dev => " + devGroner.getName());
        System.out.println("Conteúdos inscritos: " + devGroner.getSubscribedContent());
        System.out.println("Conteúdos concluidos: " + devGroner.getCompletedContent());
        System.out.println("XP: " + devGroner.calculateXP());
    }
}
