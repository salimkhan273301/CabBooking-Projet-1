package usefulfiles;

package usefulfiles;

import javax.servlet.ServletException;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.cbs.model.Employee;

public class HibernateSer {
public static void saveEmployee(Employee emp) throws HibernateException, Exception {
	SessionFactory sessionFactory=HibernateConnection.sessionFactory();
	Session session=sessionFactory.openSession();
	Transaction txn=session.beginTransaction();
	session.save(emp);
	txn.commit();
	session.close();
	
}
	





public Employee searchbyemailpass(String email, String password) {
	
	SessionFactory sessionFactory=HibernateConnection.sessionFactory();Session session=sessionFactory.openSession();
	Criteria criteria=session.createCriteria(Employee.class);
	criteria.add(Restrictions.eq("email",email));
	criteria.add(Restrictions.eq("password",password));
	Employee emp=(Employee)criteria.uniqueResult();
	
	return null;
}





}

