package comm.aut.mybatis.pojo;

public class emp {

    private int eid;
    private String ename;
    private int age;
    private String sex;
    private dep deps;//多对一

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }



    public dep getDeps() {
        return deps;
    }

    public void setDeps(dep deps) {
        this.deps = deps;
    }

    public emp(int eid, String ename, int age, String sex, int did, dep deps) {
        this.eid = eid;
        this.ename = ename;
        this.age = age;
        this.sex = sex;

        this.deps = deps;
    }

    public emp() {
    }

    @Override
    public String toString() {
        return "emp{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", deps=" + deps +
                '}';
    }
}
