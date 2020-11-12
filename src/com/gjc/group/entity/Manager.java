package com.gjc.group.entity;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Component{

    private List<Component> components = new ArrayList<>();

    public Manager(String position, String job) {
        super(position,job);
    }

    @Override
    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public void check() {
        work();
        for (Component component : components) {
            component.check();
        }
    }
}
