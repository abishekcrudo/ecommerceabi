package model;

import org.hibernate.Session;

public class ProductDAO 
{
	private DBConfig db;
	private Session sess;
	public ProductDAO()
	{
		db= new DBConfig();
	}
	public void insertProduct(Product pd)
	{
		try
		{
			sess = db.getSession();
			sess.beginTransaction();
			sess.save(pd);
			sess.getTransaction().commit();
		}catch(Exception ex)
		{
			sess.getTransaction().rollback();
			ex.printStackTrace();
		}
	}
}
