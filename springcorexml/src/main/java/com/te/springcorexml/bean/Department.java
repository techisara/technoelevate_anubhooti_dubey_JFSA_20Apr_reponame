package com.te.springcorexml.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class Department implements Serializable {
private int did;
private String dname;
}
