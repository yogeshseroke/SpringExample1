package scs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TeacheregMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Teachereg t=(Teachereg)factory.getBean("teach");
		t.setId(2);
		t.setName("Shiva sir");
		System.out.println(t.getId()+" "+t.getName());
	}
}
