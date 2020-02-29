package com.day6;

import java.util.*;
public class Pogo {
	int eid;
	String ename;
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	Pogo(int id,String name)
	{
		this.eid=id;
		this.ename=name;
	}

	public class pogoSet {

	}

	public static void main(String[] args) {
		HashSet<Pogo> hs=new LinkedHashSet<Pogo>();

		Pogo p1=new Pogo(100,"abc");
		Pogo p2=new Pogo(101,"xyz");
		hs.add(p1);
		hs.add(p2);

		Iterator<Pogo> itr= hs.iterator();
		while(itr.hasNext()){
			Pogo p=(Pogo)itr.next();
			System.out.println(p.getEid());
			System.out.println(p.getEname());
		}

	}

} 
