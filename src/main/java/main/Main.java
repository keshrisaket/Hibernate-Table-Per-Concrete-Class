package main;


import beans.Employee;
import beans.Student;
import hibernateutils.HibernateUtility;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Session session= HibernateUtility.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();

        try {

            Employee employee = new Employee();
            employee.setJob("Developer");
            employee.setName("saket");
            employee.setSal(234);


            Student student = new Student();
            student.setName("keshri");
            student.setFees(234);
            student.setCourse("Mca");


            session.persist(employee);
            session.persist(student);
            transaction.commit();

        }catch (HibernateException e){
            e.printStackTrace();
            transaction.rollback();
        }finally {
            session.close();
        }





    }
}
