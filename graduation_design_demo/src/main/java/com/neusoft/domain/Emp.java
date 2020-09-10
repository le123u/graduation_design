package com.neusoft.domain;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class Emp {
    public static void main(String[] args) throws IOException {
        String resouce = "mybatis-config.xml";
        // 1. 根据SqlMapConfig.xml，读取资源
        InputStream inputStream = Resources.getResourceAsStream(resouce);
        // 2. 创建SqlSessionFactory，根据全局配置文件SqlMapConfig.xml创建工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 3. 创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();


//        Emp e = sqlSession.selectOne("com.neusoft.domain.Emp.getEmp");
//        System.out.println(e.getMgrid());

        // 查询所有
//        List<Emp> list = sqlSession.selectList("com.neusoft.domain.Emp.findAll");
//        for(Emp emp:list){
//            System.out.println(emp);
//        }

        // 通过id查询
//        List<Emp> list = sqlSession.selectList("com.neusoft.domain.Emp.findById");
//        for (Emp e : list){
//            System.out.println(e);
//        }

        // 插入
//        Emp emp = new Emp();
//        emp.setEname("张八丰");
//        emp.setLogid("ttc8");
//        int i = sqlSession.insert("com.neusoft.domain.Emp.insertEmp",emp);
//        sqlSession.commit();
//        System.out.println(i);

        // 修改
//        Emp emp = new Emp();
//        emp.setEmpid(6);
//        emp.setEname("张九丰");
//        emp.setLogid("ttc9");
//        int i = sqlSession.update("com.neusoft.domain.Emp.updateEmp",emp);
//        sqlSession.commit();
//        System.out.println(i);

        // 删除
//        int i = sqlSession.delete("com.neusoft.domain.Emp.deleteEmp", 6);
//        sqlSession.commit();
//        System.out.println(i);

        // 模糊查询
//        List<Emp> list = sqlSession.selectList("com.neusoft.domain.Emp.likeSelect", "张");
//        for(Emp e:list){
//            System.out.println(e);
//        }

        // 查询总条数
//        Object one = sqlSession.selectOne("com.neusoft.domain.Emp.countSelect");
//        System.out.println(one);
//        sqlSession.close();


    }

    private int empid;
    private String ename;
    private Date hiredate;
    private String logid;
    private String logpwd;
    private int mgrid;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public String getLogid() {
        return logid;
    }

    public void setLogid(String logid) {
        this.logid = logid;
    }

    public String getLogpwd() {
        return logpwd;
    }

    public void setLogpwd(String logpwd) {
        this.logpwd = logpwd;
    }

    public int getMgrid() {
        return mgrid;
    }

    public void setMgrid(int mgrid) {
        this.mgrid = mgrid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", hiredate=" + hiredate +
                ", logid='" + logid + '\'' +
                ", logpwd='" + logpwd + '\'' +
                ", mgrid=" + mgrid +
                '}';
    }
}
