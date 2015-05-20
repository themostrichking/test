import java.util.List;

public abstract class Human {
    private int age;
    private int growth;
    private int weight;
    private Human mother;
    private Human father;
    private List<Human> kids;
    private String docName;
    private String sex;
    private String footsize;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getGrowth() {
        return growth;
    }
    public void setGrowth(int growth) {
        this.growth = growth;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public Human getMother() {
        return mother;
    }
    public void setMother(Human mother) {
        this.mother = mother;
    }
    public Human getFather() {
        return father;
    }
    public void setFather(Human father) {
        this.father = father;
    }
    public List<Human> getKids() {
        return kids;
    }
    public void setKids(List<Human> kids) {
        this.kids = kids;
    }
    public String getDocName() {
        return docName;
    }
    public void setDocName(String docName) {
        this.docName = docName;
    }
    public String getSex() {
        return sex;
    }

}
