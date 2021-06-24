package com.te.springcorexml.bean;

import java.io.Serializable;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;

import lombok.Data;
@Data
public class MessageBean  implements Serializable{
private String msg;

public MessageBean() {
	System.out.println("instaition phase");
}
//,InitializingBean,DisposableBean
//@Override
//public void destroy() throws Exception {
//System.out.println("destroy phase");
//	
//}
//
//@Override
//public void afterPropertiesSet() throws Exception {
//System.out.println("init phase");	
//}


public void msgInitMethod(){
	System.out.println("init phase");
	msg="test example";

}
public void msgBeanDestroy(){
	System.out.println("destroy phase");

}
}
