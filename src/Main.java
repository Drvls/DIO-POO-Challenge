import org.alexvsi.challenge.poo.domain.Course;
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

        title = "Java Bootcamp";
        description = "Java Bootcamp by Digital Innovation One";
        load = 70;

        // Não instanciar um objeto sem valor
        Course javaCourse = new Course(title, description, load);

        //javaCourse.setTitle("Java Bootcamp");
        //javaCourse.setDescription("Java Bootcamp by Digital Innovation One");
        //javaCourse.setCourseLoad(70);

        title = "AI-powered Game Development";
        description = "Game Development by SoulCode Academy";
        load = 240;

        Course gameDevCourse = new Course(title, description, load);

        //gameDevCourse.setTitle("AI-powered Game Development");
        //gameDevCourse.setDescription("Game Development by SoulCode Academy");
        //gameDevCourse.setCourseLoad(240);

        System.out.println(javaCourse);
        System.out.println(gameDevCourse);

        title = "Boas Práticas de Desenvolvimento em Java no mundo Real";
        description = "Mentoria DIO com Lorem Ipsum";
        date = LocalDate.parse("2026-03-31");

        Mentoring mentoria1 = new Mentoring(title, description, date);

        title = "Disciplina de QA e Testes em Java (JUnit + Estratégia)";
        description = "Mentoria DIO com Lorem & Ipsum";
        date = LocalDate.parse("2026-04-16");

        Mentoring mentoria2 = new Mentoring(title, description, date);
    }
}
