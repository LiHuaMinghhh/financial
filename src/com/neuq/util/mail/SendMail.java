package com.neuq.util.mail;

import com.neuq.bean.MailSenderInfo;

public class SendMail {
    public static void sendMail(String username,String mail,String url){
    	  StringBuilder sb=new StringBuilder();
    	  sb.append(" <!DOCTYPE html>");
    	  sb.append(" <html>"); 
    	  sb.append(" <head>");
    	  sb.append(" <title>�һ�����</title>");
    	  sb.append("  </head>");
    	  sb.append("<body>");
    	  sb.append("�װ����û�"+username+"��"+"</br>");
    	  sb.append("���ڼ�ͥ��ƹ���ϵͳ�Ϸ�����������������"+"</br>");
    	  sb.append("����<a href="+'"'+url+'"'+"+>�˴�</a>��������");   	
    	  sb.append("���������Ӹ��Ƶ���ַ����"+"</br>"); 
    	  sb.append(url);
    	  sb.append("</br>");
    	  sb.append("���ʼ���ϵͳ�Զ�����������ظ����ʼ������Ǳ��˲���������ʼ����ݡ�");
    	  sb.append("  </body>");
    	  sb.append(" </html> ");
    	 
        //�������Ҫ�������ʼ�     
        MailSenderInfo mailInfo = new MailSenderInfo(mail, sb.toString());      
        
     //   mailInfo.setToAddress("liangjing_2018@163.com");      
    //    mailInfo.setSubject("����һ������ϵͳ�Ĳ����ʼ�");  
        
      
   //     sb.append("����<a href='www.baidu.com'>�˴�</a>��������");
       // mailInfo.setContent("������������");   
        mailInfo.setContent(sb.toString());   
        System.out.println(sb.toString());
           //�������Ҫ�������ʼ�     
        SimpleMailSender sms = new SimpleMailSender();     
          //  sms.sendTextMail(mailInfo);//���������ʽ      
            sms.sendHtmlMail(mailInfo);//����html��ʽ     
    	
    	
    }
    
	
	
}
