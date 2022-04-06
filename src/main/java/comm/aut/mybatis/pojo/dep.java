package comm.aut.mybatis.pojo;

import java.util.List;

public class dep {

    private int did;
    private String dname;
    private List<emp> deps;//一对多

    public dep() {
    }

    public dep(int did, String dname, List<emp> deps) {
        this.did = did;
        this.dname = dname;
        this.deps = deps;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<emp> getDeps() {
        return deps;
    }

    public void setDeps(List<emp> deps) {
        this.deps = deps;
    }

    @Override
    public String toString() {
        return "dep{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", deps=" + deps +
                '}';
    }
}
