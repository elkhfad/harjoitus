package model;

import java.util.ArrayList;
import java.util.List;

public class PersonBasicInformation extends BasicInformation {

    private List<BasicInformation> siblings = new ArrayList<>();
    private List<BasicInformation> children = new ArrayList<>();
    private BasicInformation spouse;

    public PersonBasicInformation() {
    }

    public void addSibling(BasicInformation siblings) {
        this.siblings.add(siblings);
    }

    public void removeSibling(BasicInformation siblings) {
        this.siblings.remove(siblings);
    }

    public void addChild(BasicInformation children) {
        this.children.add(children);
    }

    public void removeChild(BasicInformation children) {
        this.children.remove(children);
    }

    public BasicInformation getSpouse() {
        return spouse;
    }

    public void setSpouse(BasicInformation spouse) {
        this.spouse = spouse;
    }

    public List<BasicInformation> getChildren() {
        return children;
    }

}
