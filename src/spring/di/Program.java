package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {
	public static void main(String[] args) {
//		Exam exam = new NewlecExam();
//		ExamConsole console = new GridExamConsole(exam);
//		console.setExam(exam);
		ApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		ExamConsole console = (ExamConsole) context.getBean("console");
//		ExamConsole console = context.getBean(ExamConsole.class); 
		//ExamConsole Type class 불러오기
		console.print();
		
//		Exam exam = context.getBean(Exam.class);
//		System.out.println(exam.toString());
		
//		List<Exam> list = (List<Exam>)context.getBean("exams"); //new ArrayList<>();
//		list.add(new NewlecExam(10,20,30,40));
//		for(Exam e : list) {
//			System.out.println(e);
//		}
		
	}	
}
	